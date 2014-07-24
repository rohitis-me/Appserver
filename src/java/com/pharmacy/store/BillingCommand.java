/**
 * 
 */
package com.pharmacy.store;

import java.util.Date;

/**
 * @author Rohit
 *
 */
public class BillingCommand {

	String billingId;
	long billingNumber;
	String storeId;
	long brandId;
	String batch;
	Date billingTime;
	int quantity;
	int discount;
	int sellingPrice;
	boolean isDeleted;
	long lastUpdatedTimeStamp;
	/**
	 * @param billingId
	 * @param billingNumber
	 * @param storeId
	 * @param brandId
	 * @param batch
	 * @param billingTime
	 * @param quantity
	 * @param discount
	 * @param sellingPrice
	 * @param isDeleted
	 * @param lastUpdatedTimeStamp
	 */
	public BillingCommand(String billingId, long billingNumber, String storeId,
			long brandId, String batch, Date billingTime, int quantity,
			int discount, int sellingPrice, boolean isDeleted,
			long lastUpdatedTimeStamp) {
		super();
		this.billingId = billingId;
		this.billingNumber = billingNumber;
		this.storeId = storeId;
		this.brandId = brandId;
		this.batch = batch;
		this.billingTime = billingTime;
		this.quantity = quantity;
		this.discount = discount;
		this.sellingPrice = sellingPrice;
		this.isDeleted = isDeleted;
		this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
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
	public long getBillingNumber() {
		return billingNumber;
	}
	/**
	 * @param billingNumber the billingNumber to set
	 */
	public void setBillingNumber(long billingNumber) {
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
	 * @return the brandId
	 */
	public long getBrandId() {
		return brandId;
	}
	/**
	 * @param brandId the brandId to set
	 */
	public void setBrandId(long brandId) {
		this.brandId = brandId;
	}
	/**
	 * @return the batch
	 */
	public String getBatch() {
		return batch;
	}
	/**
	 * @param batch the batch to set
	 */
	public void setBatch(String batch) {
		this.batch = batch;
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
	 * @return the discount
	 */
	public int getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	/**
	 * @return the sellingPrice
	 */
	public int getSellingPrice() {
		return sellingPrice;
	}
	/**
	 * @param sellingPrice the sellingPrice to set
	 */
	public void setSellingPrice(int sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
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
	
}
