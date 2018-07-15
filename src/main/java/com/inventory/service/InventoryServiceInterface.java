package com.inventory.service;

import com.inventory.model.Item;
import com.inventory.model.Report;
import com.inventory.validator.InvalidRequestException;

public interface InventoryServiceInterface {

	/**
	 * 
	 * @param itemName
	 * @param costPrice
	 * @param sellPrice
	 * @return
	 * @throws InvalidRequestException
	 */
	public boolean createItem(String itemName, String costPrice, String sellPrice) throws InvalidRequestException;

	/**
	 * 
	 * @param name
	 * @return
	 * @throws InvalidRequestException
	 */
	public int deleteItem(String name) throws InvalidRequestException;

	/**
	 * 
	 * @param name
	 * @param quantity
	 * @return
	 * @throws InvalidRequestException
	 */
	public Item updateBuy(String name, String quantity) throws InvalidRequestException;

	/**
	 * 
	 * @param name
	 * @param quantity
	 * @return
	 * @throws InvalidRequestException
	 */
	public Item updateSell(String name, String quantity) throws InvalidRequestException;

	/**
	 * 
	 * @param name
	 * @param newSellPrice
	 * @return
	 * @throws InvalidRequestException
	 */
	public boolean updateSellPrice(String name, String newSellPrice) throws InvalidRequestException;

	/**
	 * 
	 * @return
	 * @throws InvalidRequestException
	 */
	public Report generateReport() throws InvalidRequestException;
}
