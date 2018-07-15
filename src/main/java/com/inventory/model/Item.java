package com.inventory.model;

public class Item {

	private String name;
	private double costPrice;
	private double sellPrice;
	private int availableQuantity;
	private double value;

	public Item(String name, double costPrice, double sellPrice) {
		super();
		this.name = name;
		this.costPrice = costPrice;
		this.sellPrice = sellPrice;
		this.availableQuantity = 0;
		this.value = 0;

	}

	public Item(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}

	public double getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(double sellPrice) {
		this.sellPrice = sellPrice;
	}

	
	public int getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

}
