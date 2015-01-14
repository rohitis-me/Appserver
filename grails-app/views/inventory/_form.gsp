<%@ page import="com.pharmacy.store.Inventory" %>



<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'VAT', 'error')} required">
	<label for="VAT">
		<g:message code="inventory.VAT.label" default="VAT" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="VAT" value="${fieldValue(bean: inventoryInstance, field: 'VAT')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'batch', 'error')} required">
	<label for="batch">
		<g:message code="inventory.batch.label" default="Batch" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="batch" required="" value="${inventoryInstance?.batch}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'brandId', 'error')} required">
	<label for="brandId">
		<g:message code="inventory.brandId.label" default="Brand Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="brandId" required="" value="${inventoryInstance?.brandId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'brandName', 'error')} required">
	<label for="brandName">
		<g:message code="inventory.brandName.label" default="Brand Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="brandName" required="" value="${inventoryInstance?.brandName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'discountAmount', 'error')} required">
	<label for="discountAmount">
		<g:message code="inventory.discountAmount.label" default="Discount Amount" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="discountAmount" value="${fieldValue(bean: inventoryInstance, field: 'discountAmount')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'expiry', 'error')} required">
	<label for="expiry">
		<g:message code="inventory.expiry.label" default="Expiry" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="expiry" precision="day"  value="${inventoryInstance?.expiry}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'inventoryId', 'error')} required">
	<label for="inventoryId">
		<g:message code="inventory.inventoryId.label" default="Inventory Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="inventoryId" required="" value="${inventoryInstance?.inventoryId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'invoiceId', 'error')} required">
	<label for="invoiceId">
		<g:message code="inventory.invoiceId.label" default="Invoice Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="invoiceId" required="" value="${inventoryInstance?.invoiceId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'isDeleted', 'error')} ">
	<label for="isDeleted">
		<g:message code="inventory.isDeleted.label" default="Is Deleted" />
		
	</label>
	<g:checkBox name="isDeleted" value="${inventoryInstance?.isDeleted}" />

</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'itemsPerUnit', 'error')} required">
	<label for="itemsPerUnit">
		<g:message code="inventory.itemsPerUnit.label" default="Items Per Unit" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="itemsPerUnit" type="number" value="${inventoryInstance.itemsPerUnit}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'itemsRemaining', 'error')} required">
	<label for="itemsRemaining">
		<g:message code="inventory.itemsRemaining.label" default="Items Remaining" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="itemsRemaining" type="number" value="${inventoryInstance.itemsRemaining}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'lastUpdatedTimeStamp', 'error')} required">
	<label for="lastUpdatedTimeStamp">
		<g:message code="inventory.lastUpdatedTimeStamp.label" default="Last Updated Time Stamp" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="lastUpdatedTimeStamp" type="number" value="${inventoryInstance.lastUpdatedTimeStamp}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'mrp', 'error')} required">
	<label for="mrp">
		<g:message code="inventory.mrp.label" default="Mrp" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="mrp" value="${fieldValue(bean: inventoryInstance, field: 'mrp')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'numberOfUnitsPurchased', 'error')} required">
	<label for="numberOfUnitsPurchased">
		<g:message code="inventory.numberOfUnitsPurchased.label" default="Number Of Units Purchased" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="numberOfUnitsPurchased" type="number" value="${inventoryInstance.numberOfUnitsPurchased}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'quantity', 'error')} required">
	<label for="quantity">
		<g:message code="inventory.quantity.label" default="Quantity" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="quantity" type="number" value="${inventoryInstance.quantity}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'storeId', 'error')} required">
	<label for="storeId">
		<g:message code="inventory.storeId.label" default="Store Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="storeId" required="" value="${inventoryInstance?.storeId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'unitCost', 'error')} required">
	<label for="unitCost">
		<g:message code="inventory.unitCost.label" default="Unit Cost" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="unitCost" value="${fieldValue(bean: inventoryInstance, field: 'unitCost')}" required=""/>

</div>

