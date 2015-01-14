/**
 * 
 */
package com.pharmacy.store;

import java.util.Date;

import com.pharmacy.constants.Constants;

/**
 * @author Rohit2
 *
 */
public class InvoiceCommand {

	String invoiceId;
	Date invoiceDate;
	String invoiceCode;
	long invoiceNumber;
	String distributorId;
	byte orderStatus;
	byte paymentType;
	
	/**
	 * @param invoiceId
	 * @param invoiceDate
	 * @param invoiceCode
	 * @param invoiceNumber
	 * @param distributorId
	 * @param orderStatus
	 * @param paymentType
	 */
	public InvoiceCommand(String invoiceId, Date invoiceDate,
			String invoiceCode, long invoiceNumber, String distributorId,
			byte orderStatus, byte paymentType) {
		super();
		this.invoiceId = invoiceId;
		this.invoiceDate = invoiceDate;
		this.invoiceCode = invoiceCode;
		this.invoiceNumber = invoiceNumber;
		this.distributorId = distributorId;
		this.orderStatus = orderStatus;
		this.paymentType = paymentType;
	}
	
	public InvoiceCommand(boolean check) {
		super();
		if(check) {
		this.invoiceId = ""+Math.random();
		this.invoiceDate = new Date();
		this.invoiceCode = ""+Math.random();
		this.invoiceNumber = 0;
		this.distributorId = ""+Math.random();
		this.orderStatus = Constants.status_PURCHASE_ORDER_PLACED;
		this.paymentType = 2;
		}
	}
	
	public InvoiceCommand() {
		super();
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
	 * @return the invoiceDate
	 */
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	/**
	 * @param invoiceDate the invoiceDate to set
	 */
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	/**
	 * @return the invoiceCode
	 */
	public String getInvoiceCode() {
		return invoiceCode;
	}
	/**
	 * @param invoiceCode the invoiceCode to set
	 */
	public void setInvoiceCode(String invoiceCode) {
		this.invoiceCode = invoiceCode;
	}
	/**
	 * @return the invoiceNumber
	 */
	public long getInvoiceNumber() {
		return invoiceNumber;
	}
	/**
	 * @param invoiceNumber the invoiceNumber to set
	 */
	public void setInvoiceNumber(long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	/**
	 * @return the distributorId
	 */
	public String getDistributorId() {
		return distributorId;
	}
	/**
	 * @param distributorId the distributorId to set
	 */
	public void setDistributorId(String distributorId) {
		this.distributorId = distributorId;
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
	
}
