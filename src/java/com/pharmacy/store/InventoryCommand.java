/**
 * 
 */
package com.pharmacy.store;

import java.util.Date;

/**
 * @author Rohit
 *
 */
public class InventoryCommand {

	String inventoryId;
	long brandId;
	String storeId;
	String batch;
	Date expiry;
	int unitCost;
	int mrp;
	int quantity;
	int discount;
	int itemsPerUnit;
	boolean isDeleted;
	long lastUpdatedTimeStamp;
	/**
	 * @param inventoryId
	 * @param brandId
	 * @param storeId
	 * @param batch
	 * @param expiry
	 * @param unitCost
	 * @param mrp
	 * @param quantity
	 * @param discount
	 * @param itemsPerUnit
	 * @param isDeleted
	 * @param lastUpdatedTimeStamp
	 */
	public InventoryCommand(String inventoryId, long brandId, String storeId,
			String batch, Date expiry, int unitCost, int mrp, int quantity,
			int discount, int itemsPerUnit, boolean isDeleted,
			long lastUpdatedTimeStamp) {
		super();
		this.inventoryId = inventoryId;
		this.brandId = brandId;
		this.storeId = storeId;
		this.batch = batch;
		this.expiry = expiry;
		this.unitCost = unitCost;
		this.mrp = mrp;
		this.quantity = quantity;
		this.discount = discount;
		this.itemsPerUnit = itemsPerUnit;
		this.isDeleted = isDeleted;
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
	public int getUnitCost() {
		return unitCost;
	}
	/**
	 * @param unitCost the unitCost to set
	 */
	public void setUnitCost(int unitCost) {
		this.unitCost = unitCost;
	}
	/**
	 * @return the mrp
	 */
	public int getMrp() {
		return mrp;
	}
	/**
	 * @param mrp the mrp to set
	 */
	public void setMrp(int mrp) {
		this.mrp = mrp;
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
