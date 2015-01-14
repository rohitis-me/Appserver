<%@ page import="com.pharmacy.store.Invoice" %>



<div class="fieldcontain ${hasErrors(bean: invoiceInstance, field: 'distributorId', 'error')} required">
	<label for="distributorId">
		<g:message code="invoice.distributorId.label" default="Distributor Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="distributorId" required="" value="${invoiceInstance?.distributorId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: invoiceInstance, field: 'invoiceCode', 'error')} required">
	<label for="invoiceCode">
		<g:message code="invoice.invoiceCode.label" default="Invoice Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="invoiceCode" required="" value="${invoiceInstance?.invoiceCode}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: invoiceInstance, field: 'invoiceDate', 'error')} required">
	<label for="invoiceDate">
		<g:message code="invoice.invoiceDate.label" default="Invoice Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="invoiceDate" precision="day"  value="${invoiceInstance?.invoiceDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: invoiceInstance, field: 'invoiceId', 'error')} required">
	<label for="invoiceId">
		<g:message code="invoice.invoiceId.label" default="Invoice Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="invoiceId" required="" value="${invoiceInstance?.invoiceId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: invoiceInstance, field: 'invoiceNumber', 'error')} required">
	<label for="invoiceNumber">
		<g:message code="invoice.invoiceNumber.label" default="Invoice Number" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="invoiceNumber" type="number" value="${invoiceInstance.invoiceNumber}" required=""/>

</div>

