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
public class InventoryCommand {

	String inventoryId;
	String brandId;
	String storeId;
	String batch;
	Date expiry;
	double unitCost;
	double mrp;
	double VAT;
	int quantity;
	double discountAmount;
	int itemsPerUnit;
	int itemsRemaining;
	int numberOfUnitsPurchased;
	boolean isDeleted;
	long lastUpdatedTimeStamp;
	String invoiceId;
	String brandName;
	
	/**
	 * @param inventoryId
	 * @param brandId
	 * @param storeId
	 * @param batch
	 * @param expiry
	 * @param unitCost
	 * @param mrp
	 * @param vAT
	 * @param quantity
	 * @param discountAmount
	 * @param itemsPerUnit
	 * @param itemsRemaining
	 * @param numberOfUnitsPurchased
	 * @param isDeleted
	 * @param lastUpdatedTimeStamp
	 * @param invoiceId
	 * @param brandName
	 */
	public InventoryCommand(String inventoryId, String brandId, String storeId,
			String batch, Date expiry, double unitCost, double mrp, double vAT,
			int quantity, double discountAmount, int itemsPerUnit,
			int itemsRemaining, int numberOfUnitsPurchased, boolean isDeleted,
			long lastUpdatedTimeStamp, String invoiceId, String brandName) {
		super();
		this.inventoryId = inventoryId;
		this.brandId = brandId;
		this.storeId = storeId;
		this.batch = batch;
		this.expiry = expiry;
		this.unitCost = unitCost;
		this.mrp = mrp;
		VAT = vAT;
		this.quantity = quantity;
		this.discountAmount = discountAmount;
		this.itemsPerUnit = itemsPerUnit;
		this.itemsRemaining = itemsRemaining;
		this.numberOfUnitsPurchased = numberOfUnitsPurchased;
		this.isDeleted = isDeleted;
		this.lastUpdatedTimeStamp = lastUpdatedTimeStamp;
		this.invoiceId = invoiceId;
		this.brandName = brandName;
	}
	
	public InventoryCommand(boolean check) {
		super();
		if(check) {
		this.inventoryId = "";
		this.brandId = ""+Math.random();
		this.storeId = ""+Math.random();
		this.batch = ""+Math.random();
		this.expiry = new Date();
		this.unitCost = 435;
		this.mrp = 544;
		VAT = 2;
		this.quantity = 2;
		this.discountAmount = 23;
		this.itemsPerUnit = 12;
		this.itemsRemaining = 23;
		this.numberOfUnitsPurchased = 45;
		this.isDeleted = false;
		this.lastUpdatedTimeStamp = 0;
		this.invoiceId = ""+Math.random();
		this.brandName = ""+Math.random();
		}
	}
	
	public InventoryCommand() {
		super();
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
	 * @return the brandId
	 */
	public String getBrandId() {
		return brandId;
	}
	/**
	 * @param brandId the brandId to set
	 */
	public void setBrandId(String brandId) {
		this.brandId = brandId;
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
	 * @return the expiry
	 */
	public Date getExpiry() {
		return expiry;
	}
	/**
	 * @param expiry the expiry to set
	 */
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	/**
	 * @return the unitCost
	 */
	public double getUnitCost() {
		return unitCost;
	}
	/**
	 * @param unitCost the unitCost to set
	 */
	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}
	/**
	 * @return the mrp
	 */
	public double getMrp() {
		return mrp;
	}
	/**
	 * @param mrp the mrp to set
	 */
	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
	/**
	 * @return the vAT
	 */
	public double getVAT() {
		return VAT;
	}
	/**
	 * @param vAT the vAT to set
	 */
	public void setVAT(double vAT) {
		VAT = vAT;
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
	 * @return the itemsPerUnit
	 */
	public int getItemsPerUnit() {
		return itemsPerUnit;
	}
	/**
	 * @param itemsPerUnit the itemsPerUnit to set
	 */
	public void setItemsPerUnit(int itemsPerUnit) {
		this.itemsPerUnit = itemsPerUnit;
	}
	/**
	 * @return the itemsRemaining
	 */
	public int getItemsRemaining() {
		return itemsRemaining;
	}
	/**
	 * @param itemsRemaining the itemsRemaining to set
	 */
	public void setItemsRemaining(int itemsRemaining) {
		this.itemsRemaining = itemsRemaining;
	}
	/**
	 * @return the numberOfUnitsPurchased
	 */
	public int getNumberOfUnitsPurchased() {
		return numberOfUnitsPurchased;
	}
	/**
	 * @param numberOfUnitsPurchased the numberOfUnitsPurchased to set
	 */
	public void setNumberOfUnitsPurchased(int numberOfUnitsPurchased) {
		this.numberOfUnitsPurchased = numberOfUnitsPurchased;
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
	/**
	 * @return the invoiceId
	 */
	public String getInvoiceId() {
		return invoiceId;
	}
	/**
	 * @param invoiceId the invoiceId to set
	 */
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	/**
	 * @return the brandName
	 */
	public String getBrandName() {
		return brandName;
	}
	/**
	 * @param brandName the brandName to set
	 */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	
}
