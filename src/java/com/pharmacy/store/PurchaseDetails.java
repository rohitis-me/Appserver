/**
 * 
 */
package com.pharmacy.store;

import java.util.ArrayList;

/**
 * @author Rohit2
 *
 */
public class PurchaseDetails {

	InvoiceDetails invoiceData;
	ArrayList<InventoryCommand> inventoryList;
	/**
	 * @param invoiceData
	 * @param inventoryList
	 */
	public PurchaseDetails(InvoiceDetails invoiceData,
			ArrayList<InventoryCommand> inventoryList) {
		super();
		this.invoiceData = invoiceData;
		this.inventoryList = inventoryList;
	}
	
	public PurchaseDetails() {
		super();
		this.invoiceData = new InvoiceDetails();
		this.inventoryList = new ArrayList<InventoryCommand>();
	}
	
	public PurchaseDetails(boolean check) {
		super();
		if(check) {
		this.invoiceData = new InvoiceDetails(true);
		ArrayList<InventoryCommand> itemList = new ArrayList<InventoryCommand>();
		itemList.add(new InventoryCommand(true));
		itemList.add(new InventoryCommand(true));
		this.inventoryList = itemList;
		}
	}

	/**
	 * @return the invoiceData
	 */
	public InvoiceDetails getInvoiceData() {
		return invoiceData;
	}

	/**
	 * @param invoiceData the invoiceData to set
	 */
	public void setInvoiceData(InvoiceDetails invoiceData) {
		this.invoiceData = invoiceData;
	}

	/**
	 * @return the inventoryList
	 */
	public ArrayList<InventoryCommand> getInventoryList() {
		return inventoryList;
	}

	/**
	 * @param inventoryList the inventoryList to set
	 */
	public void setInventoryList(ArrayList<InventoryCommand> inventoryList) {
		this.inventoryList = inventoryList;
	}
	
}
