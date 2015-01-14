
<%@ page import="com.pharmacy.store.Inventory" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'inventory.label', default: 'Inventory')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-inventory" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-inventory" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list inventory">
			
				<g:if test="${inventoryInstance?.VAT}">
				<li class="fieldcontain">
					<span id="VAT-label" class="property-label"><g:message code="inventory.VAT.label" default="VAT" /></span>
					
						<span class="property-value" aria-labelledby="VAT-label"><g:fieldValue bean="${inventoryInstance}" field="VAT"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryInstance?.batch}">
				<li class="fieldcontain">
					<span id="batch-label" class="property-label"><g:message code="inventory.batch.label" default="Batch" /></span>
					
						<span class="property-value" aria-labelledby="batch-label"><g:fieldValue bean="${inventoryInstance}" field="batch"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryInstance?.brandId}">
				<li class="fieldcontain">
					<span id="brandId-label" class="property-label"><g:message code="inventory.brandId.label" default="Brand Id" /></span>
					
						<span class="property-value" aria-labelledby="brandId-label"><g:fieldValue bean="${inventoryInstance}" field="brandId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryInstance?.brandName}">
				<li class="fieldcontain">
					<span id="brandName-label" class="property-label"><g:message code="inventory.brandName.label" default="Brand Name" /></span>
					
						<span class="property-value" aria-labelledby="brandName-label"><g:fieldValue bean="${inventoryInstance}" field="brandName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryInstance?.discountAmount}">
				<li class="fieldcontain">
					<span id="discountAmount-label" class="property-label"><g:message code="inventory.discountAmount.label" default="Discount Amount" /></span>
					
						<span class="property-value" aria-labelledby="discountAmount-label"><g:fieldValue bean="${inventoryInstance}" field="discountAmount"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryInstance?.expiry}">
				<li class="fieldcontain">
					<span id="expiry-label" class="property-label"><g:message code="inventory.expiry.label" default="Expiry" /></span>
					
						<span class="property-value" aria-labelledby="expiry-label"><g:formatDate date="${inventoryInstance?.expiry}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryInstance?.inventoryId}">
				<li class="fieldcontain">
					<span id="inventoryId-label" class="property-label"><g:message code="inventory.inventoryId.label" default="Inventory Id" /></span>
					
						<span class="property-value" aria-labelledby="inventoryId-label"><g:fieldValue bean="${inventoryInstance}" field="inventoryId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryInstance?.invoiceId}">
				<li class="fieldcontain">
					<span id="invoiceId-label" class="property-label"><g:message code="inventory.invoiceId.label" default="Invoice Id" /></span>
					
						<span class="property-value" aria-labelledby="invoiceId-label"><g:fieldValue bean="${inventoryInstance}" field="invoiceId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryInstance?.isDeleted}">
				<li class="fieldcontain">
					<span id="isDeleted-label" class="property-label"><g:message code="inventory.isDeleted.label" default="Is Deleted" /></span>
					
						<span class="property-value" aria-labelledby="isDeleted-label"><g:formatBoolean boolean="${inventoryInstance?.isDeleted}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryInstance?.itemsPerUnit}">
				<li class="fieldcontain">
					<span id="itemsPerUnit-label" class="property-label"><g:message code="inventory.itemsPerUnit.label" default="Items Per Unit" /></span>
					
						<span class="property-value" aria-labelledby="itemsPerUnit-label"><g:fieldValue bean="${inventoryInstance}" field="itemsPerUnit"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryInstance?.itemsRemaining}">
				<li class="fieldcontain">
					<span id="itemsRemaining-label" class="property-label"><g:message code="inventory.itemsRemaining.label" default="Items Remaining" /></span>
					
						<span class="property-value" aria-labelledby="itemsRemaining-label"><g:fieldValue bean="${inventoryInstance}" field="itemsRemaining"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryInstance?.lastUpdatedTimeStamp}">
				<li class="fieldcontain">
					<span id="lastUpdatedTimeStamp-label" class="property-label"><g:message code="inventory.lastUpdatedTimeStamp.label" default="Last Updated Time Stamp" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdatedTimeStamp-label"><g:fieldValue bean="${inventoryInstance}" field="lastUpdatedTimeStamp"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryInstance?.mrp}">
				<li class="fieldcontain">
					<span id="mrp-label" class="property-label"><g:message code="inventory.mrp.label" default="Mrp" /></span>
					
						<span class="property-value" aria-labelledby="mrp-label"><g:fieldValue bean="${inventoryInstance}" field="mrp"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryInstance?.numberOfUnitsPurchased}">
				<li class="fieldcontain">
					<span id="numberOfUnitsPurchased-label" class="property-label"><g:message code="inventory.numberOfUnitsPurchased.label" default="Number Of Units Purchased" /></span>
					
						<span class="property-value" aria-labelledby="numberOfUnitsPurchased-label"><g:fieldValue bean="${inventoryInstance}" field="numberOfUnitsPurchased"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryInstance?.quantity}">
				<li class="fieldcontain">
					<span id="quantity-label" class="property-label"><g:message code="inventory.quantity.label" default="Quantity" /></span>
					
						<span class="property-value" aria-labelledby="quantity-label"><g:fieldValue bean="${inventoryInstance}" field="quantity"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryInstance?.storeId}">
				<li class="fieldcontain">
					<span id="storeId-label" class="property-label"><g:message code="inventory.storeId.label" default="Store Id" /></span>
					
						<span class="property-value" aria-labelledby="storeId-label"><g:fieldValue bean="${inventoryInstance}" field="storeId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${inventoryInstance?.unitCost}">
				<li class="fieldcontain">
					<span id="unitCost-label" class="property-label"><g:message code="inventory.unitCost.label" default="Unit Cost" /></span>
					
						<span class="property-value" aria-labelledby="unitCost-label"><g:fieldValue bean="${inventoryInstance}" field="unitCost"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:inventoryInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${inventoryInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
