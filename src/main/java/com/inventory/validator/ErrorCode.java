package com.inventory.validator;

public enum ErrorCode {
	ERR01("Error Cost Price is greater than Selling Price for the Input Item"),
	ERR02("Error Input item doesn't exists in the inventory.Please create item"),
	ERR03("Error No item exists in the inventory"),
	ERR04("Error requested Selling quantity is greater than Available quantity"),
	ERR05("Error Item already exists"),
	ERR06("Invalid Input");
	
	private String value;
	
	ErrorCode(String value){
		this.value = value;
	}	
	
	public String getValue(){
		return value;
	}
}
