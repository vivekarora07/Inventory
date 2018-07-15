package com.inventory.util;

import java.text.DecimalFormat;

public class InventoryUtil {
	
	public static String RoundTo2DecimalsString(double val) {
		DecimalFormat df2 = new DecimalFormat("#0.00");
		return df2.format(val);
	}

}
