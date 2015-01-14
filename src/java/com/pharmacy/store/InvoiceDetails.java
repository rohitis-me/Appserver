/**
 * 
 */
package com.pharmacy.store;

/**
 * @author Rohit2
 *
 */
public class InvoiceDetails {

	InvoiceCommand invoiceDetails;
	DistributorCommand distributorDetails;
	/**
	 * @param invoiceDetails
	 * @param distributorDetails
	 */
	public InvoiceDetails(InvoiceCommand invoiceDetails,
			DistributorCommand distributorDetails) {
		super();
		this.invoiceDetails = invoiceDetails;
		this.distributorDetails = distributorDetails;
	}
	
	public InvoiceDetails() {
		super();
		this.invoiceDetails = new InvoiceCommand();
		this.distributorDetails = new DistributorCommand();
	}
	
	public InvoiceDetails(boolean check) {
		super();
		if(check) {
			this.invoiceDetails = new InvoiceCommand(true);
			this.distributorDetails = new DistributorCommand(true);
		}
	}

	/**
	 * @return the invoiceDetails
	 */
	public InvoiceCommand getInvoiceDetails() {
		return invoiceDetails;
	}

	/**
	 * @param invoiceDetails the invoiceDetails to set
	 */
	public void setInvoiceDetails(InvoiceCommand invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

	/**
	 * @return the distributorDetails
	 */
	public DistributorCommand getDistributorDetails() {
		return distributorDetails;
	}

	/**
	 * @param distributorDetails the distributorDetails to set
	 */
	public void setDistributorDetails(DistributorCommand distributorDetails) {
		this.distributorDetails = distributorDetails;
	}
	
}
