<%@ page import="com.pharmacy.store.Inventory" %>



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
	<g:field name="brandId" type="number" value="${inventoryInstance.brandId}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: inventoryInstance, field: 'discount', 'error')} required">
	<label for="discount">
		<g:message code="inventory.discount.label" default="Discount" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="discount" type="number" value="${inventoryInstance.discount}" required=""/>

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
	<g:field name="mrp" type="number" value="${inventoryInstance.mrp}" required=""/>

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
	<g:field name="unitCost" type="number" value="${inventoryInstance.unitCost}" required=""/>

</div>

