
<%@ page import="com.pharmacy.store.Pharmacy" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'pharmacy.label', default: 'Pharmacy')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-pharmacy" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-pharmacy" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list pharmacy">
			
				<g:if test="${pharmacyInstance?.addressLine1}">
				<li class="fieldcontain">
					<span id="addressLine1-label" class="property-label"><g:message code="pharmacy.addressLine1.label" default="Address Line1" /></span>
					
						<span class="property-value" aria-labelledby="addressLine1-label"><g:fieldValue bean="${pharmacyInstance}" field="addressLine1"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pharmacyInstance?.addressLine2}">
				<li class="fieldcontain">
					<span id="addressLine2-label" class="property-label"><g:message code="pharmacy.addressLine2.label" default="Address Line2" /></span>
					
						<span class="property-value" aria-labelledby="addressLine2-label"><g:fieldValue bean="${pharmacyInstance}" field="addressLine2"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pharmacyInstance?.chainId}">
				<li class="fieldcontain">
					<span id="chainId-label" class="property-label"><g:message code="pharmacy.chainId.label" default="Chain Id" /></span>
					
						<span class="property-value" aria-labelledby="chainId-label"><g:fieldValue bean="${pharmacyInstance}" field="chainId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pharmacyInstance?.circle}">
				<li class="fieldcontain">
					<span id="circle-label" class="property-label"><g:message code="pharmacy.circle.label" default="Circle" /></span>
					
						<span class="property-value" aria-labelledby="circle-label"><g:fieldValue bean="${pharmacyInstance}" field="circle"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pharmacyInstance?.city}">
				<li class="fieldcontain">
					<span id="city-label" class="property-label"><g:message code="pharmacy.city.label" default="City" /></span>
					
						<span class="property-value" aria-labelledby="city-label"><g:fieldValue bean="${pharmacyInstance}" field="city"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pharmacyInstance?.latitude}">
				<li class="fieldcontain">
					<span id="latitude-label" class="property-label"><g:message code="pharmacy.latitude.label" default="Latitude" /></span>
					
						<span class="property-value" aria-labelledby="latitude-label"><g:fieldValue bean="${pharmacyInstance}" field="latitude"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pharmacyInstance?.longitude}">
				<li class="fieldcontain">
					<span id="longitude-label" class="property-label"><g:message code="pharmacy.longitude.label" default="Longitude" /></span>
					
						<span class="property-value" aria-labelledby="longitude-label"><g:fieldValue bean="${pharmacyInstance}" field="longitude"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pharmacyInstance?.state}">
				<li class="fieldcontain">
					<span id="state-label" class="property-label"><g:message code="pharmacy.state.label" default="State" /></span>
					
						<span class="property-value" aria-labelledby="state-label"><g:fieldValue bean="${pharmacyInstance}" field="state"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pharmacyInstance?.storeId}">
				<li class="fieldcontain">
					<span id="storeId-label" class="property-label"><g:message code="pharmacy.storeId.label" default="Store Id" /></span>
					
						<span class="property-value" aria-labelledby="storeId-label"><g:fieldValue bean="${pharmacyInstance}" field="storeId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pharmacyInstance?.storeName}">
				<li class="fieldcontain">
					<span id="storeName-label" class="property-label"><g:message code="pharmacy.storeName.label" default="Store Name" /></span>
					
						<span class="property-value" aria-labelledby="storeName-label"><g:fieldValue bean="${pharmacyInstance}" field="storeName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${pharmacyInstance?.type}">
				<li class="fieldcontain">
					<span id="type-label" class="property-label"><g:message code="pharmacy.type.label" default="Type" /></span>
					
						<span class="property-value" aria-labelledby="type-label"><g:fieldValue bean="${pharmacyInstance}" field="type"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:pharmacyInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${pharmacyInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
