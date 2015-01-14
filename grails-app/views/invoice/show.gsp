
<%@ page import="com.pharmacy.store.Invoice" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'invoice.label', default: 'Invoice')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-invoice" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-invoice" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list invoice">
			
				<g:if test="${invoiceInstance?.distributorId}">
				<li class="fieldcontain">
					<span id="distributorId-label" class="property-label"><g:message code="invoice.distributorId.label" default="Distributor Id" /></span>
					
						<span class="property-value" aria-labelledby="distributorId-label"><g:fieldValue bean="${invoiceInstance}" field="distributorId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${invoiceInstance?.invoiceCode}">
				<li class="fieldcontain">
					<span id="invoiceCode-label" class="property-label"><g:message code="invoice.invoiceCode.label" default="Invoice Code" /></span>
					
						<span class="property-value" aria-labelledby="invoiceCode-label"><g:fieldValue bean="${invoiceInstance}" field="invoiceCode"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${invoiceInstance?.invoiceDate}">
				<li class="fieldcontain">
					<span id="invoiceDate-label" class="property-label"><g:message code="invoice.invoiceDate.label" default="Invoice Date" /></span>
					
						<span class="property-value" aria-labelledby="invoiceDate-label"><g:formatDate date="${invoiceInstance?.invoiceDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${invoiceInstance?.invoiceId}">
				<li class="fieldcontain">
					<span id="invoiceId-label" class="property-label"><g:message code="invoice.invoiceId.label" default="Invoice Id" /></span>
					
						<span class="property-value" aria-labelledby="invoiceId-label"><g:fieldValue bean="${invoiceInstance}" field="invoiceId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${invoiceInstance?.invoiceNumber}">
				<li class="fieldcontain">
					<span id="invoiceNumber-label" class="property-label"><g:message code="invoice.invoiceNumber.label" default="Invoice Number" /></span>
					
						<span class="property-value" aria-labelledby="invoiceNumber-label"><g:fieldValue bean="${invoiceInstance}" field="invoiceNumber"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:invoiceInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${invoiceInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
