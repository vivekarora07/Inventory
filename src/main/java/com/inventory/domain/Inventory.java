package com.inventory.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.inventory.model.Item;
import com.inventory.model.Report;
import com.inventory.model.TransactionType;
import com.inventory.validator.ErrorCode;
import com.inventory.validator.InvalidRequestException;

public class Inventory {

	private Map<String, Item> items;
	private double totalProfit;
	private Report report;
	private static Inventory instance;

	private Inventory() {
		items = new HashMap<>();
		report = new Report();
		totalProfit = 0;
	}

	public static Inventory getInstance() {
	if (instance == null) {
			instance = new Inventory();
		}
		return instance;
	}

	public Item findItem(String name) throws InvalidRequestException {
		Item exist = Optional.ofNullable(items.get(name)).orElseThrow(() -> new InvalidRequestException(ErrorCode.ERR02.getValue() + " " + name));
		return exist;
	}
	
	public boolean addItem(Item item) throws InvalidRequestException {
		
		boolean isInserted=false;
		if (item.getCostPrice() > item.getSellPrice())
			throw new InvalidRequestException(ErrorCode.ERR01.getValue() + " " + item.getName());
		Item returnedItem = items.putIfAbsent(item.getName(), item);
		if(returnedItem != null) throw new InvalidRequestException(ErrorCode.ERR05.getValue() + " " + item.getName());
		else isInserted = true;
		return isInserted;
	}

	public Item removeItem(String name) throws InvalidRequestException {
		Item itemToBeRemoved = findItem(name);
		this.totalProfit = this.totalProfit
				+ ((0 - itemToBeRemoved.getCostPrice()) * itemToBeRemoved.getAvailableQuantity());
		return items.remove(name);

	}

	public Item updateItem(String name, int quantity, TransactionType type) throws InvalidRequestException {
		Item exist = findItem(name);
		int availableQuant = 0;
		
		if ("BUY".equals(type.getValue())) {
			availableQuant = exist.getAvailableQuantity() + quantity;
		} else {
			availableQuant = exist.getAvailableQuantity() - quantity;
			if (availableQuant < 0)
				throw new InvalidRequestException(ErrorCode.ERR04.getValue() + " " + exist.getName());
			this.totalProfit = this.totalProfit + ((exist.getSellPrice() - exist.getCostPrice()) * quantity);
		}
		exist.setAvailableQuantity(availableQuant);
		exist.setValue((exist.getCostPrice() * availableQuant));

		return exist;
	}

	public boolean updateSellPrice(String name, double newSellPrice) throws InvalidRequestException {
		boolean isUpdated = false;
		Item exist = findItem(name);
		exist.setSellPrice(newSellPrice);
		items.put(name, exist);
		isUpdated = true;
		return isUpdated;
	}

	public Report getReport() throws InvalidRequestException {
		Optional<Map<String, Item>> mapOfItems = Optional.of(this.items);
		mapOfItems.filter(c->c.size()>0)
		.ifPresent((c)->
	     {
			List<Item> itemsList = c.entrySet().stream().sorted((e1,e2)->
	        e1.getValue().getName().compareTo(e2.getValue().getName()))
			.map(e2->e2.getValue())
			.collect(Collectors.toList());
	        
			double totalValue = c.values().stream().mapToDouble(i->i.getValue()).sum();
			this.report.setItems(itemsList);
			this.report.setTotalProfit(this.getTotalProfit());
			this.report.setTotalValue(totalValue);
			this.totalProfit = 0;
		});
		
		mapOfItems.filter(c->c.size()>0)
		.orElseThrow(()->new InvalidRequestException(ErrorCode.ERR03.getValue()));
		
		return this.report;

	}

	public double getTotalProfit() {
		return this.totalProfit;
	}

	public void setReport(Report report) {
		this.report = report;
	}

}
