package com.inventory.test;

import com.inventory.model.Item;
import com.inventory.model.Report;
import com.inventory.service.InventoryService;
import com.inventory.service.InventoryServiceInterface;
import com.inventory.util.InventoryUtil;
import com.inventory.validator.InvalidRequestException;

/**
 * @author Vivek This class contains methods which makes call to
 *         InventoryServiceInterface which has underlying implementation for
 *         InventoryService
 */
public class TestInventoryService {

	/*
	 * This method creates new Items in the inventory. This method creates 4
	 * items with Item name, Cost Price and Selling Price as input. This will
	 * create following items with Available quantity 1
	 */
	// @Test
	public void testAddItems_1() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {
			service.createItem("Book01", "10.50", "13.79");
			service.createItem("Food01", "1.47", "3.98");
			service.createItem("Med01", "30.63", "34.29");
			service.createItem("Tab01", "57.00", "84.98");
		//	service.createItem("Book01", "57.00", "84.98");
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}

	}

	/*
	 * This method will call update BUY for the existing item present in the
	 * inventory with Item name and Quantity as input
	 */
	// @Test
	public void testBuy100Tab01_2() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {
			service.updateBuy("Tab01", "100");
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}
	}

	/*
	 * This method will call update BUY for the existing item present in the
	 * inventory with Item name and Quantity as input
	 */
	// @Test
	public void testSell2Tab01_3() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {
			service.updateSell("Tab01", "2");
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}
	}

	/*
	 * This method will call update BUY for the existing item present in the
	 * inventory with Item name and Quantity as input
	 */
	// @Test
	public void testBuy500Food01_4() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {
			service.updateBuy("Food01", "500");
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}
	}

	/*
	 * This method will call update BUY for the existing item present in the
	 * inventory with Item name and Quantity as input
	 */
	// @Test
	public void testBuy100Book01_5() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {
			service.updateBuy("Book01", "100");
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}
	}

	/*
	 * This method will call update BUY for the existing item present in the
	 * inventory with Item name and Quantity as input
	 */
	// @Test
	public void testBuy100Med01_6() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {
			service.updateBuy("Med01", "100");
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}
	}
	/*
	 * This method will call update SELL for the existing item present in the
	 * inventory with Item name and Quantity as input
	 */

	// @Test
	public void testSell1Food01_7() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {
			service.updateSell("Food01", "1");
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}
	}
	/*
	 * This method will call update SELL for the existing item present in the
	 * inventory with Item name and Quantity as input
	 */

	// @Test
	public void testSell1Food01_8() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {
			service.updateSell("Food01", "1");
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}
	}

	/*
	 * This method will call update SELL for the existing item present in the
	 * inventory with Item name and Quantity as input
	 */
	// @Test
	public void testSell12Tab01_9() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {
			service.updateSell("Tab01", "2");
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}
	}

	/*
	 * This method will remove existing item from the inventory. It will take
	 * item name as input
	 */
	// @Test
	public void testdeleteBook01_10() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {
			service.deleteItem("Book01");
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}
	}

	/*
	 * This method will call update SELL for the existing item present in the
	 * inventory with Item name and Quantity as input
	 */
	// @Test
	public void testSell5Tab01_11() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {
			service.updateSell("Tab01", "5");
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}
	}

	/*
	 * This method creates new Items in the inventory. This method creates 4
	 * items with Item name, Cost Price and Selling Price as input. This will
	 * create following items with Avialable quantity 1
	 */
	// @Test
	public void testAddItems_12() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {
			service.createItem("Mobile01", "10.50", "44.56");
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}

	}

	/*
	 * This method will call update SELL for the existing item present in the
	 * inventory with Item name and Quantity as input
	 */
	// @Test
	public void testBuy250Mobile01_13() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {
			service.updateBuy("Mobile01", "250");
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}
	}

	/*
	 * This method will call update SELL for the existing item present in the
	 * inventory with Item name and Quantity as input
	 */
	// @Test
	public void testSell5Food0101_14() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {
			service.updateSell("Food01", "5");
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}
	}

	/*
	 * This method will call update SELL for the existing item present in the
	 * inventory with Item name and Quantity as input
	 */
	// @Test
	public void testSell4Mobile01_15() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {
			service.updateSell("Mobile01", "4");
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}
	}

	/*
	 * This method will call update SELL for the existing item present in the
	 * inventory with Item name and Quantity as input
	 */
	// @Test
	public void testSell10Med01_16() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {
			service.updateSell("Med01", "10");
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}
	}

	/*
	 * This method will call update SELL Price for the existing item present in
	 * the inventory with Item name and new Selling Price as input
	 */
	// @Test
	public void testSellPrice01Med01_17() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {
			service.updateSellPrice("Med01", "33.21");
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}
	}

	/*
	 * This method will generate report with inventory items having name, cost
	 * price, selling price, available quantity and value It will also generate
	 * net profit from last report generation
	 */
	// @Test
	public void testReportGeneration() throws InvalidRequestException {
		InventoryServiceInterface service = new InventoryService();
		try {

			Report rpt = service.generateReport();
			System.out.println("                            INVENTORY REPORT                              ");
			System.out.println("Item Name " + "  Brought At " + "  Sold At " + "  AvailableQty " + "  Value ");
			System.out.println("---------   ----------   -------   -------------   -----");
			for (Item item : rpt.getItems()) {
				System.out.println(rpt.show(item));
			}
			System.out.println("Total Value= " + InventoryUtil.RoundTo2DecimalsString(rpt.getTotalValue()));
			System.out.println(
					"Profit since previous report= " + InventoryUtil.RoundTo2DecimalsString(rpt.getTotalProfit()));
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}
	}

	public static void main(String[] args) {
		TestInventoryService test = new TestInventoryService();
		try {
			test.testAddItems_1();
			test.testReportGeneration();
			System.out.println(
					"************************************************************************************************");
			System.out.println(
					"                                                                                                ");
			test.testBuy100Tab01_2();
			test.testSell2Tab01_3();
			test.testBuy500Food01_4();
			test.testBuy100Book01_5();
			test.testBuy100Med01_6();
			test.testSell1Food01_7();
			test.testSell1Food01_8();
			test.testSell12Tab01_9();
			test.testReportGeneration();
			System.out.println(
					"************************************************************************************************");
			System.out.println(
					"                                                                                                ");
			test.testdeleteBook01_10();
			test.testSell5Tab01_11();
			test.testAddItems_12();
			test.testBuy250Mobile01_13();
			test.testSell5Food0101_14();
			test.testSell4Mobile01_15();
			test.testSell10Med01_16();
			test.testReportGeneration();
			System.out.println(
					"************************************************************************************************");
			System.out.println(
					"                                                                                                ");
			test.testSellPrice01Med01_17();
			test.testReportGeneration();
		} catch (InvalidRequestException e) {
			System.err.println(e);
		}
	}

}
