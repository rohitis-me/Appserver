/**
 * 
 */
package com.pharmacy.store;

import java.util.Date;

import com.common.Utility;

/**
 * @author Rohit
 *
 */
public class BillingCommand {

	String billingId;
	String billingNumber;
	String storeId;
	Date billingTime;
	int quantity;
	double discountAmount;
	double finalAmount;
	//double sellingPrice;
	boolean isDeleted;
	long lastUpdatedTimeStamp;
	String inventoryId;
	String patientId;
	double vatAmount;
	byte orderStatus;
	byte paymentType;
	
	
	
	/**
	 * @param billingId
	 * @param billingNumber
	 * @param storeId
	 * @param billingTime
	 * @param quantity
	 * @param discountAmount
	 * @param finalAmount
	 * @param sellingPrice
	 * @param isDeleted
	 * @param lastUpdatedTimeStamp
	 * @param inventoryId
	 * @param patientId
	 * @param vatAmount
	 * @param orderStatus
	 * @param paymentType
	 */
	public BillingCommand(String billingId, String billingNumber,
			String storeId, Date billingTime, int quantity,
			double discountAmount, double finalAmount, int sellingPrice,
			boolean isDeleted, long lastUpdatedTimeStamp, String inventoryId,
			String patientId, double vatAmount, byte orderStatus,
			byte paymentType) {
		super();
		this.billingId = billingId;
		this.billingNumber = billingNumber;
		this.storeId = storeId;
		this.billingTime = billingTime;
		this.quantity = quantity;
		this.discountAmount = discountAmount;
		this.finalAmount = finalAmount;
//		this.sellingPrice = sellingPrice;
		this.isDeleted = isDeleted;
		this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
		this.inventoryId = inventoryId;
		this.patientId = patientId;
		this.vatAmount = vatAmount;
		this.orderStatus = orderStatus;
		this.paymentType = paymentType;
	}
	
	public BillingCommand(boolean chk) {
		super();
		if(chk) {
		this.billingId = Utility.getBilling();
		this.billingNumber = Utility.getBilling();
		this.storeId = "1";
		this.billingTime = new Date();
		this.quantity = 4;
		this.discountAmount = 2;
		this.finalAmount = 50;
//		this.sellingPrice = 52;
		this.isDeleted = false;
		this.lastUpdatedTimeStamp = 0;
		this.inventoryId = Utility.getInventory();
		this.patientId = "patientID"+Math.random();
		this.vatAmount = Math.random();
		this.orderStatus = 2;
		this.paymentType = 2;
		}
	}
	/**
	 * @return the billingId
	 */
	public String getBillingId() {
		return billingId;
	}
	/**
	 * @param billingId the billingId to set
	 */
	public void setBillingId(String billingId) {
		this.billingId = billingId;
	}
	/**
	 * @return the billingNumber
	 */
	public String getBillingNumber() {
		return billingNumber;
	}
	/**
	 * @param billingNumber the billingNumber to set
	 */
	public void setBillingNumber(String billingNumber) {
		this.billingNumber = billingNumber;
	}
	/**
	 * @return the storeId
	 */
	public String getStoreId() {
		return storeId;
	}
	/**
	 * @param storeId the storeId to set
	 */
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	/**
	 * @return the billingTime
	 */
	public Date getBillingTime() {
		return billingTime;
	}
	/**
	 * @param billingTime the billingTime to set
	 */
	public void setBillingTime(Date billingTime) {
		this.billingTime = billingTime;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the discountAmount
	 */
	public double getDiscountAmount() {
		return discountAmount;
	}
	/**
	 * @param discountAmount the discountAmount to set
	 */
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	/**
	 * @return the finalAmount
	 */
	public double getFinalAmount() {
		return finalAmount;
	}
	/**
	 * @param finalAmount the finalAmount to set
	 */
	public void setFinalAmount(double finalAmount) {
		this.finalAmount = finalAmount;
	}
//	/**
//	 * @return the sellingPrice
//	 */
//	public double getSellingPrice() {
//		return sellingPrice;
//	}
//	/**
//	 * @param sellingPrice the sellingPrice to set
//	 */
//	public void setSellingPrice(double sellingPrice) {
//		this.sellingPrice = sellingPrice;
//	}
	/**
	 * @return the isDeleted
	 */
	public boolean isDeleted() {
		return isDeleted;
	}
	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	/**
	 * @return the lastUpdatedTimeStamp
	 */
	public long getLastUpdatedTimeStamp() {
		return lastUpdatedTimeStamp;
	}
	/**
	 * @param lastUpdatedTimeStamp the lastUpdatedTimeStamp to set
	 */
	public void setLastUpdatedTimeStamp(long lastUpdatedTimeStamp) {
		this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
	}
	/**
	 * @return the inventoryId
	 */
	public String getInventoryId() {
		return inventoryId;
	}
	/**
	 * @param inventoryId the inventoryId to set
	 */
	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}
	/**
	 * @return the patientId
	 */
	public String getPatientId() {
		return patientId;
	}
	/**
	 * @param patientId the patientId to set
	 */
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	/**
	 * @return the vatAmount
	 */
	public double getVatAmount() {
		return vatAmount;
	}
	/**
	 * @param vatAmount the vatAmount to set
	 */
	public void setVatAmount(double vatAmount) {
		this.vatAmount = vatAmount;
	}
	/**
	 * @return the orderStatus
	 */
	public byte getOrderStatus() {
		return orderStatus;
	}
	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(byte orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * @return the paymentType
	 */
	public byte getPaymentType() {
		return paymentType;
	}
	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(byte paymentType) {
		this.paymentType = paymentType;
	}
	
//	public void Clear() {
//		this.billingId = null;
//		this.billingNumber = null;
//		this.billingTime = null;
//		this.
//	}
	
}
