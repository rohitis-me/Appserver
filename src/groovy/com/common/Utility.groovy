/**
 * 
 */
package com.common

import com.pharmacy.store.Billing
import com.pharmacy.store.BillingCommand
import com.pharmacy.store.Distributor
import com.pharmacy.store.Inventory
import com.pharmacy.store.InventoryCommand

/**
 * @author Rohit2
 *
 */
public class Utility {

	public static isStringEmptyWhiteSpaceOrNull (String str) {
		if(str != null && str.trim()!= "") {
			return false
		}
		
		return true
	}
	//Temp... start
	public static String getBilling() {
		return (++(Billing.count())).toString()
	}
	
	public static String getInventory() {
		return (++(Inventory.count())).toString();
	}
	
	public static String getDistributor() {
		int idCount = ++(Distributor.count())
		return (idCount).toString()
	}
	
	public static String billingJson = """{
		"patient" : {
			"patientId" : "",
			"patientCode" : "00123",
			"name" : "Aneesh Kaur",
			"doctorName" : "Ritin Verma",
			"age" : 433,
			"addressLine1" : "45, Richie Street",
			"addressLine2" : "K.R. Road",
			"circle" : "J.P. Nagar",
			"city" : "Bangalore",
			"state" : "Karnataka"
		},
		"itemDetails" : [{
				"billingId" : "",
				"billingNumber" : "345",
				"storeId" : "63",
				"billingTime" : "Jan 4, 2015 3:53:25 PM",
				"quantity" : 4,
				"discountAmount" : 1.50,
				"finalAmount" : 5.07,
				"isDeleted" : false,
				"lastUpdatedTimeStamp" : 0,
				"inventoryId" : "23",
				"patientId" : "",
				"vatAmount" : 0.24,
				"orderStatus" : 2,
				"paymentType" : 2
			}, {
				"billingId" : "",
				"billingNumber" : "346",
				"storeId" : "63",
				"billingTime" : "Jan 4, 2015 3:53:25 PM",
				"quantity" : 4,
				"discountAmount" : 1.80,
				"finalAmount" : 50.00,
				"isDeleted" : false,
				"lastUpdatedTimeStamp" : 0,
				"inventoryId" : "24",
				"patientId" : "",
				"vatAmount" : 0.36,
				"orderStatus" : 2,
				"paymentType" : 2
			}
		]
	}"""
	
	public static String purchaseJson = """{
	"invoiceData" : {
		"invoiceDetails" : {
			"invoiceId" : "",
			"invoiceDate" : "Jan 4, 2015 3:56:13 PM",
			"invoiceCode" : "0036",
			"invoiceNumber" : 13,
			"distributorId" : "123",
			"orderStatus" : 11,
			"paymentType" : 2
		},
		"distributorDetails" : {
			"distributorId" : "123",
			"distributorTIN" : "012334232123",
			"AddressLine1" : "23, Lingi Chetty Street",
			"AddressLine2" : "Bannerghatta Road",
			"circle" : "Bannerghatta",
			"city" : "Bangalore",
			"state" : "Karnataka",
			"pinCode" : "560035",
			"phoneNumber1" : "08027342345",
			"phoneNumber2" : "9432334235"
		}
	},
	"inventoryList" : [{
			"inventoryId" : "34",
			"brandId" : "20",
			"storeId" : "63",
			"batch" : "AFRS12",
			"expiry" : "Jan 4, 2015 3:56:13 PM",
			"unitCost" : 435.0,
			"mrp" : 544.0,
			"VAT" : 2.0,
			"quantity" : 2,
			"discountAmount" : 23.0,
			"itemsPerUnit" : 12,
			"itemsRemaining" : 23,
			"numberOfUnitsPurchased" : 45,
			"isDeleted" : false,
			"lastUpdatedTimeStamp" : 0,
			"invoiceId" : "1",
			"brandName" : "Amlogard 10mg"
		}, {
			"inventoryId" : "35",
			"brandId" : "22",
			"storeId" : "63",
			"batch" : "DFGESE23",
			"expiry" : "Jan 4, 2015 3:56:13 PM",
			"unitCost" : 435.0,
			"mrp" : 544.0,
			"VAT" : 2.0,
			"quantity" : 2,
			"discountAmount" : 23.0,
			"itemsPerUnit" : 12,
			"itemsRemaining" : 23,
			"numberOfUnitsPurchased" : 45,
			"isDeleted" : false,
			"lastUpdatedTimeStamp" : 0,
			"invoiceId" : "1",
			"brandName" : "Becosules 10ml"
		}
	]
}"""
	//end
	
	private static String generateId() {
		return (new Date()).calendarDate.millis.toString()
	}
	
	//Generate Id For new Bill
	public static generateNewBillingId() {
		return generateId()
	}
	
	//Generate Id For new Inventory
	public static generateNewInventoryId() {
		return generateId()
	}
	
	//Generate Id For new Patient
	public static generateNewPatientId() {
		return generateId()
	}
	
	//Get StoreId
	public static getStoreId(BillingCommand bill) {
		String str = bill.getStoreId()
		
		if(! isStringEmptyWhiteSpaceOrNull(str))
		return str
		
		else
		return generateId()
	}
	
	public static getStoreId(InventoryCommand item) {
		String str =item.getStoreId()
		
		if(! isStringEmptyWhiteSpaceOrNull(str))
		return str
		
		else
		return generateId()
	}
	
	//Distributor utility
	public static String getDistributorId(String distributorId) {
		if(isStringEmptyWhiteSpaceOrNull(distributorId)) {
			return generateNewDistributorId()
		}
		
		else
		return distributorId
	}
	
	private static String generateNewDistributorId() {
		return generateId()
	}
	
	//Invoice utility
	public static String getInvoiceId(String invoiceId) {
		if(isStringEmptyWhiteSpaceOrNull(invoiceId)) {
			return generateNewInvoiceId()
		}
		
		else
		return invoiceId
	}
	
	private static String generateNewInvoiceId() {
		return generateId()
	}
	
	// Bill Utility
	public static BillingCommand populateIdFieldsForBill(BillingCommand bill, String patientId) {
		println "patientId: "+patientId
		bill.setPatientId(patientId);
		bill.setBillingId(getBillingId(bill.getBillingId()))
		bill.setStoreId(getStoreId(bill))
		return bill
	}
	
	private static String getBillingId(String billingId) {
		if(isStringEmptyWhiteSpaceOrNull(billingId)) {
			return generateNewBillingId()
		}
		
		else 
		return billingId
	}
	
	public static populateBillingFromBillingCommand(Billing bill, BillingCommand billingCommand) {
		//TODO..
		bill = new Billing()
		bill.billingId = billingCommand.getBillingId()
		bill.billingNumber = billingCommand.getBillingNumber()
		bill.storeId = billingCommand.getStoreId()
		//bill.brandId = billingCommand.getBrandId()
		//bill.batch = billingCommand.getBatch()
		bill.billingTime = billingCommand.getBillingTime()
		bill.quantity = billingCommand.getQuantity()
		bill.discountAmount = billingCommand.getDiscountAmount()
		bill.finalAmount = billingCommand.getFinalAmount()
		bill.isDeleted = billingCommand.isDeleted()
		bill.lastUpdatedTimeStamp = getCurrentTimeStamp()
		bill.inventoryId = billingCommand.getInventoryId()
		bill.patientId = billingCommand.getPatientId()
		bill.vatAmount = billingCommand.getVatAmount()
		bill.orderStatus = billingCommand.getOrderStatus();
		bill.paymentType = billingCommand.getPaymentType();
		return bill
	}
	
	// Inventory Utility
	public static InventoryCommand populateIdFieldsForInventory(InventoryCommand item, String invoiceId) {
		item.setInventoryId(getInventoryId(item.getInventoryId()))
		item.setStoreId(getStoreId(item))
		item.setInvoiceId(invoiceId)
		return item
	}
	
	public static getCurrentTimeStamp() {
		return System.currentTimeMillis()
	}
	
	private static String getInventoryId(String inventoryId) {
		if(isStringEmptyWhiteSpaceOrNull(inventoryId)) {
			return generateNewInventoryId()
		}
		
		else
		return inventoryId
	}
	
	public static populateInventoryFromInventoryCommand(Inventory item, InventoryCommand inventoryCommand) {
		item = new Inventory()
		item.inventoryId = inventoryCommand.getInventoryId()
		item.brandId = inventoryCommand.getBrandId()
		item.storeId = inventoryCommand.getStoreId()
		item.batch = inventoryCommand.getBatch()
		item.expiry = inventoryCommand.getExpiry()
		item.unitCost = inventoryCommand.getUnitCost()
		item.mrp = inventoryCommand.getMrp()
		item.quantity = inventoryCommand.getQuantity()
		item.discountAmount = inventoryCommand.getDiscountAmount()
		item.itemsPerUnit = inventoryCommand.getItemsPerUnit()
		item.isDeleted = inventoryCommand.isDeleted()
		item.lastUpdatedTimeStamp = getCurrentTimeStamp()
		item.VAT = inventoryCommand.getVAT()
		item.itemsRemaining = inventoryCommand.getItemsRemaining()
		item.numberOfUnitsPurchased = inventoryCommand.getNumberOfUnitsPurchased()
		item.invoiceId = inventoryCommand.getInvoiceId()
		item.brandName = inventoryCommand.getBrandName()
		return item
	}
}
