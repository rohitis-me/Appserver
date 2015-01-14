/**
 * 
 */
package com.pharmacy.constants;

/**
 * @author Rohit
 *
 */
public class Constants {

	public static String[] storeTypes = {"Small individual", "Large individual"};
	public static int[] storeNum = {1,2};
	
	public static String[] circle = {"Adyar", "Thiruvanmiyur", "ECR", "Kotturpuram"};
	
	public static byte status_SALES_ORDER_RECEIVED = 1;
	public static byte status_SALES_ORDER_APPROVED = 2;
	public static byte status_SALES_ORDER_TRANSIT = 3;
	public static byte status_SALES_ORDER_DELIVERED = 4;

	public static byte status_PURCHASE_ORDER_PLACED = 11;
	public static byte status_PURCHASE_ORDER_RECEIVED = 14;
	
	public static byte payment_CASH = 1;
	public static byte payment_CHEQUE = 2;
	public static byte payment_CREDIT = 3;
	public static byte payment_CREDITCARD = 4;
	public static byte payment_DEBITCARD = 5;
	public static byte payment_NETBANKING = 6;
	
}
