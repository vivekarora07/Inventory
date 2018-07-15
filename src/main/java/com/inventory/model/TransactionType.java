package com.inventory.model;

public enum TransactionType {
	BUY("BUY"), SELL("SELL");
	private String value;

	TransactionType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
