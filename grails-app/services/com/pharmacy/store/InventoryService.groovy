package com.pharmacy.store

import java.util.Date;

import grails.transaction.Transactional

import com.common.Utility

@Transactional
class InventoryService {

	def userService
	
    def serviceMethod() {

    }
	
	def insertInvoiceDetails(InvoiceDetails invoiceDetails) {
		InvoiceCommand invoiceCommand = invoiceDetails.getInvoiceDetails()
		DistributorCommand distributorCommand = invoiceDetails.getDistributorDetails()
		def distributorId = insertOrUpdateDistributor(distributorCommand)
		def invoiceId = insertOrUpdateInvoice(invoiceCommand, distributorId)
		
		return invoiceId
	}
	
	//Invoice
	private String insertOrUpdateInvoice(InvoiceCommand invoiceCommand, String distributorId) {
		invoiceCommand = populateIdFieldsForInvoice(invoiceCommand, distributorId)
		Invoice invoice = populateInvoiceFieldsFromInvoiceCommand(invoiceCommand)
		if(invoice.save(flush:true)) {
			log.info "Invoice saved"
			return invoice.invoiceId
		}
		else {
			invoice.errors.each {it->
				println "invoice NOT saved: "+it
			}
		}
	}
	
	private InvoiceCommand populateIdFieldsForInvoice(InvoiceCommand invoiceCommand, String distributorId) {
		invoiceCommand.setDistributorId(distributorId)
		invoiceCommand.setInvoiceId(Utility.getInvoiceId(invoiceCommand.getInvoiceId()))
		return invoiceCommand
	}
	
	private Invoice populateInvoiceFieldsFromInvoiceCommand(InvoiceCommand invoiceCommand) {
		Invoice invoice = new Invoice()
		invoice.invoiceId = invoiceCommand.getInvoiceId()
		invoice.invoiceDate = invoiceCommand.getInvoiceDate()
		invoice.invoiceCode = invoiceCommand.getInvoiceCode()
		invoice.invoiceNumber = invoiceCommand.getInvoiceNumber()
		invoice.distributorId = invoiceCommand.getDistributorId()
		invoice.orderStatus = invoiceCommand.getOrderStatus()
		invoice.paymentType = invoiceCommand.getPaymentType()
		return invoice
	}
	
	// Distributor 
	private String insertOrUpdateDistributor(DistributorCommand distributorCommand) {
		Distributor distributor = populateDistributorFromDistributorCommand(distributorCommand)
		if(distributor.save(flush:true)) {
			log.info("Distributor saved")
			return distributor.distributorId
		}
		else {
			distributor.errors.each {it->
				println "Error in insertOrUpdateDistributor: "+it
			}
			return null
		}
	}
	
	def populateDistributorFromDistributorCommand(DistributorCommand distributorCommand) {
		Distributor distributor = new Distributor()
		distributor.distributorId = Utility.getDistributorId(distributorCommand.getDistributorId())
		distributor.distributorTIN = distributorCommand.getDistributorTIN()
		distributor.AddressLine1 = distributorCommand.getAddressLine1()
		distributor.AddressLine2 = distributorCommand.getAddressLine2()
		distributor.circle = distributorCommand.getCircle()
		distributor.city = distributorCommand.getCity()
		distributor.state = distributorCommand.getState()
		distributor.pinCode = distributorCommand.getPinCode()
		distributor.phoneNumber1 = distributorCommand.getPhoneNumber1()
		distributor.phoneNumber2 = distributorCommand.getPhoneNumber2()
		return distributor
	}
	
	//Order status
	
	def updateOrderStatus(byte orderStatus, String invoiceId) {
		Invoice invoice = Invoice.get(invoiceId)
		
		if(!invoice) {
			//FIXME This is a temp fix
			println "IN NULL invoice"
			invoice = Invoice.first()
		}
		
		
		invoice.orderStatus = orderStatus
		if(invoice.save(flush:true)) {
			log.info "Bill order status changed"
			return 1
		}
		else {
			log.error "Error in BillingService.updateOrderStatus "
			invoice.errors.each { it->
				log.error ""+it
			}
			return 0
		}
	}
	
	def getOrderStatus(String inventoryId) {
		Inventory inventory = Inventory.findByInventoryId(inventoryId)
		
		if(!inventory) {
			//FIXME This is a temp fix
			println "IN NULL inventory: "+Inventory.count()
			inventory = Inventory.first()
		}
		
		if(inventory) {
			Invoice invoice = Invoice.findByInvoiceId(inventory.invoiceId)
			
			if(invoice) {
				return invoice.orderStatus
			}
			else {
				//FIXME This is a temp fix
				println "IN NULL invoice- getorderstatus"
				return Invoice.first().orderStatus
			}
		}
		
		else {
			println "Inventory count: "+Inventory.count()+"\n Inventory: "+Inventory?.first()
			return 0
		}
		
	}
	
	//Get request services
	
	def getInventoryList() {
		def storeId = userService.getStoreId()
		List inventoryList = new ArrayList<Inventory>()
		
		if(! Utility.isStringEmptyWhiteSpaceOrNull(storeId)) {
			inventoryList = Inventory.findAllByStoreId(storeId)
		}
		return inventoryList
	}
	
}
