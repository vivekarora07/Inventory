package com.inventory.service;

import com.inventory.domain.Inventory;
import com.inventory.model.Item;
import com.inventory.model.Report;
import com.inventory.model.TransactionType;
import com.inventory.validator.InvalidRequestException;
import com.inventory.validator.ItemValidator;

public class InventoryService implements InventoryServiceInterface {

	public boolean createItem(String itemName, String costPrice, String sellPrice) throws InvalidRequestException {
		Item item = createItemObj(itemName, costPrice, sellPrice);
		boolean isInserted = Inventory.getInstance().addItem(item);
		return isInserted;
	}

	public int deleteItem(String name) throws InvalidRequestException {
		Item deletedItem = Inventory.getInstance().removeItem(name);
		return deletedItem != null ? 1 : 0;
	}

	public Item updateBuy(String name, String quantity) throws InvalidRequestException {
		ItemValidator.validateStringIsIntegerNumber(quantity);
		Item updatedItem = Inventory.getInstance().updateItem(name, Integer.valueOf(quantity), TransactionType.BUY);
		return updatedItem;
	}

	public Item updateSell(String name, String quantity) throws InvalidRequestException {
		ItemValidator.validateStringIsIntegerNumber(quantity);
		Item updatedItem = Inventory.getInstance().updateItem(name, Integer.valueOf(quantity), TransactionType.SELL);
		return updatedItem;
	}

	public boolean updateSellPrice(String name, String newSellPrice) throws InvalidRequestException {
		ItemValidator.validateStringIsDecimalNumber(newSellPrice);
		boolean isUpdated = Inventory.getInstance().updateSellPrice(name, Double.valueOf(newSellPrice));
		return isUpdated;
	}

	public Report generateReport() throws InvalidRequestException {
		return Inventory.getInstance().getReport();
	}

	private Item createItemObj(String itemName, String costPrice, String sellPrice) throws InvalidRequestException {
		ItemValidator.validateStringIsDecimalNumber(costPrice);
		ItemValidator.validateStringIsDecimalNumber(sellPrice);
		return new Item(itemName, Double.valueOf(costPrice), Double.valueOf(sellPrice));
	}

}
