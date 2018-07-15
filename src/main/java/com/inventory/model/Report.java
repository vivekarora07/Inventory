package com.inventory.model;

import java.text.DecimalFormat;
import java.util.List;

import com.inventory.util.InventoryUtil;

public class Report {
	
	private List<Item> items;
	private double totalProfit;
	private double totalValue;
	DecimalFormat df2 = new DecimalFormat("#.00");
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public double getTotalProfit() {
		return totalProfit;
	}
	public void setTotalProfit(double totalProfit) {
		this.totalProfit = totalProfit;
	}
	public double getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	
	public String show(Item item){
		return item.getName()+"      "+InventoryUtil.RoundTo2DecimalsString(item.getCostPrice())+"        "+InventoryUtil.RoundTo2DecimalsString(item.getSellPrice())+"          "+InventoryUtil.RoundTo2DecimalsString(item.getAvailableQuantity())+"               "+InventoryUtil.RoundTo2DecimalsString(item.getValue());
	}
	
	
}
