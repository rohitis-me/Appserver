<%@ page import="com.pharmacy.store.Billing" %>



<div class="fieldcontain ${hasErrors(bean: billingInstance, field: 'batch', 'error')} required">
	<label for="batch">
		<g:message code="billing.batch.label" default="Batch" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="batch" required="" value="${billingInstance?.batch}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: billingInstance, field: 'billingId', 'error')} required">
	<label for="billingId">
		<g:message code="billing.billingId.label" default="Billing Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="billingId" required="" value="${billingInstance?.billingId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: billingInstance, field: 'billingNumber', 'error')} required">
	<label for="billingNumber">
		<g:message code="billing.billingNumber.label" default="Billing Number" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="billingNumber" type="number" value="${billingInstance.billingNumber}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: billingInstance, field: 'billingTime', 'error')} required">
	<label for="billingTime">
		<g:message code="billing.billingTime.label" default="Billing Time" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="billingTime" precision="day"  value="${billingInstance?.billingTime}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: billingInstance, field: 'brandId', 'error')} required">
	<label for="brandId">
		<g:message code="billing.brandId.label" default="Brand Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="brandId" type="number" value="${billingInstance.brandId}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: billingInstance, field: 'discount', 'error')} required">
	<label for="discount">
		<g:message code="billing.discount.label" default="Discount" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="discount" type="number" value="${billingInstance.discount}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: billingInstance, field: 'isDeleted', 'error')} ">
	<label for="isDeleted">
		<g:message code="billing.isDeleted.label" default="Is Deleted" />
		
	</label>
	<g:checkBox name="isDeleted" value="${billingInstance?.isDeleted}" />

</div>

<div class="fieldcontain ${hasErrors(bean: billingInstance, field: 'lastUpdatedTimeStamp', 'error')} required">
	<label for="lastUpdatedTimeStamp">
		<g:message code="billing.lastUpdatedTimeStamp.label" default="Last Updated Time Stamp" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="lastUpdatedTimeStamp" type="number" value="${billingInstance.lastUpdatedTimeStamp}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: billingInstance, field: 'quantity', 'error')} required">
	<label for="quantity">
		<g:message code="billing.quantity.label" default="Quantity" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="quantity" type="number" value="${billingInstance.quantity}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: billingInstance, field: 'sellingPrice', 'error')} required">
	<label for="sellingPrice">
		<g:message code="billing.sellingPrice.label" default="Selling Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="sellingPrice" type="number" value="${billingInstance.sellingPrice}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: billingInstance, field: 'storeId', 'error')} required">
	<label for="storeId">
		<g:message code="billing.storeId.label" default="Store Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="storeId" required="" value="${billingInstance?.storeId}"/>

</div>

