
<%@ page import="com.pharmacy.store.Distributor" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'distributor.label', default: 'Distributor')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-distributor" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-distributor" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list distributor">
			
				<g:if test="${distributorInstance?.addressLine1}">
				<li class="fieldcontain">
					<span id="addressLine1-label" class="property-label"><g:message code="distributor.addressLine1.label" default="Address Line1" /></span>
					
						<span class="property-value" aria-labelledby="addressLine1-label"><g:fieldValue bean="${distributorInstance}" field="addressLine1"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${distributorInstance?.addressLine2}">
				<li class="fieldcontain">
					<span id="addressLine2-label" class="property-label"><g:message code="distributor.addressLine2.label" default="Address Line2" /></span>
					
						<span class="property-value" aria-labelledby="addressLine2-label"><g:fieldValue bean="${distributorInstance}" field="addressLine2"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${distributorInstance?.circle}">
				<li class="fieldcontain">
					<span id="circle-label" class="property-label"><g:message code="distributor.circle.label" default="Circle" /></span>
					
						<span class="property-value" aria-labelledby="circle-label"><g:fieldValue bean="${distributorInstance}" field="circle"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${distributorInstance?.city}">
				<li class="fieldcontain">
					<span id="city-label" class="property-label"><g:message code="distributor.city.label" default="City" /></span>
					
						<span class="property-value" aria-labelledby="city-label"><g:fieldValue bean="${distributorInstance}" field="city"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${distributorInstance?.distributorId}">
				<li class="fieldcontain">
					<span id="distributorId-label" class="property-label"><g:message code="distributor.distributorId.label" default="Distributor Id" /></span>
					
						<span class="property-value" aria-labelledby="distributorId-label"><g:fieldValue bean="${distributorInstance}" field="distributorId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${distributorInstance?.phoneNumber1}">
				<li class="fieldcontain">
					<span id="phoneNumber1-label" class="property-label"><g:message code="distributor.phoneNumber1.label" default="Phone Number1" /></span>
					
						<span class="property-value" aria-labelledby="phoneNumber1-label"><g:fieldValue bean="${distributorInstance}" field="phoneNumber1"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${distributorInstance?.phoneNumber2}">
				<li class="fieldcontain">
					<span id="phoneNumber2-label" class="property-label"><g:message code="distributor.phoneNumber2.label" default="Phone Number2" /></span>
					
						<span class="property-value" aria-labelledby="phoneNumber2-label"><g:fieldValue bean="${distributorInstance}" field="phoneNumber2"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${distributorInstance?.pinCode}">
				<li class="fieldcontain">
					<span id="pinCode-label" class="property-label"><g:message code="distributor.pinCode.label" default="Pin Code" /></span>
					
						<span class="property-value" aria-labelledby="pinCode-label"><g:fieldValue bean="${distributorInstance}" field="pinCode"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${distributorInstance?.state}">
				<li class="fieldcontain">
					<span id="state-label" class="property-label"><g:message code="distributor.state.label" default="State" /></span>
					
						<span class="property-value" aria-labelledby="state-label"><g:fieldValue bean="${distributorInstance}" field="state"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:distributorInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${distributorInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
