
<%@ page import="com.pharmacy.store.Billing" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'billing.label', default: 'Billing')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-billing" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-billing" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list billing">
			
				<g:if test="${billingInstance?.batch}">
				<li class="fieldcontain">
					<span id="batch-label" class="property-label"><g:message code="billing.batch.label" default="Batch" /></span>
					
						<span class="property-value" aria-labelledby="batch-label"><g:fieldValue bean="${billingInstance}" field="batch"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${billingInstance?.billingId}">
				<li class="fieldcontain">
					<span id="billingId-label" class="property-label"><g:message code="billing.billingId.label" default="Billing Id" /></span>
					
						<span class="property-value" aria-labelledby="billingId-label"><g:fieldValue bean="${billingInstance}" field="billingId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${billingInstance?.billingNumber}">
				<li class="fieldcontain">
					<span id="billingNumber-label" class="property-label"><g:message code="billing.billingNumber.label" default="Billing Number" /></span>
					
						<span class="property-value" aria-labelledby="billingNumber-label"><g:fieldValue bean="${billingInstance}" field="billingNumber"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${billingInstance?.billingTime}">
				<li class="fieldcontain">
					<span id="billingTime-label" class="property-label"><g:message code="billing.billingTime.label" default="Billing Time" /></span>
					
						<span class="property-value" aria-labelledby="billingTime-label"><g:formatDate date="${billingInstance?.billingTime}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${billingInstance?.brandId}">
				<li class="fieldcontain">
					<span id="brandId-label" class="property-label"><g:message code="billing.brandId.label" default="Brand Id" /></span>
					
						<span class="property-value" aria-labelledby="brandId-label"><g:fieldValue bean="${billingInstance}" field="brandId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${billingInstance?.discount}">
				<li class="fieldcontain">
					<span id="discount-label" class="property-label"><g:message code="billing.discount.label" default="Discount" /></span>
					
						<span class="property-value" aria-labelledby="discount-label"><g:fieldValue bean="${billingInstance}" field="discount"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${billingInstance?.isDeleted}">
				<li class="fieldcontain">
					<span id="isDeleted-label" class="property-label"><g:message code="billing.isDeleted.label" default="Is Deleted" /></span>
					
						<span class="property-value" aria-labelledby="isDeleted-label"><g:formatBoolean boolean="${billingInstance?.isDeleted}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${billingInstance?.lastUpdatedTimeStamp}">
				<li class="fieldcontain">
					<span id="lastUpdatedTimeStamp-label" class="property-label"><g:message code="billing.lastUpdatedTimeStamp.label" default="Last Updated Time Stamp" /></span>
					
						<span class="property-value" aria-labelledby="lastUpdatedTimeStamp-label"><g:fieldValue bean="${billingInstance}" field="lastUpdatedTimeStamp"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${billingInstance?.quantity}">
				<li class="fieldcontain">
					<span id="quantity-label" class="property-label"><g:message code="billing.quantity.label" default="Quantity" /></span>
					
						<span class="property-value" aria-labelledby="quantity-label"><g:fieldValue bean="${billingInstance}" field="quantity"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${billingInstance?.sellingPrice}">
				<li class="fieldcontain">
					<span id="sellingPrice-label" class="property-label"><g:message code="billing.sellingPrice.label" default="Selling Price" /></span>
					
						<span class="property-value" aria-labelledby="sellingPrice-label"><g:fieldValue bean="${billingInstance}" field="sellingPrice"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${billingInstance?.storeId}">
				<li class="fieldcontain">
					<span id="storeId-label" class="property-label"><g:message code="billing.storeId.label" default="Store Id" /></span>
					
						<span class="property-value" aria-labelledby="storeId-label"><g:fieldValue bean="${billingInstance}" field="storeId"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:billingInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${billingInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
