
<%@ page import="com.pharmacy.store.Patient" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'patient.label', default: 'Patient')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-patient" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-patient" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list patient">
			
				<g:if test="${patientInstance?.addressLine1}">
				<li class="fieldcontain">
					<span id="addressLine1-label" class="property-label"><g:message code="patient.addressLine1.label" default="Address Line1" /></span>
					
						<span class="property-value" aria-labelledby="addressLine1-label"><g:fieldValue bean="${patientInstance}" field="addressLine1"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${patientInstance?.addressLine2}">
				<li class="fieldcontain">
					<span id="addressLine2-label" class="property-label"><g:message code="patient.addressLine2.label" default="Address Line2" /></span>
					
						<span class="property-value" aria-labelledby="addressLine2-label"><g:fieldValue bean="${patientInstance}" field="addressLine2"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${patientInstance?.age}">
				<li class="fieldcontain">
					<span id="age-label" class="property-label"><g:message code="patient.age.label" default="Age" /></span>
					
						<span class="property-value" aria-labelledby="age-label"><g:fieldValue bean="${patientInstance}" field="age"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${patientInstance?.circle}">
				<li class="fieldcontain">
					<span id="circle-label" class="property-label"><g:message code="patient.circle.label" default="Circle" /></span>
					
						<span class="property-value" aria-labelledby="circle-label"><g:fieldValue bean="${patientInstance}" field="circle"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${patientInstance?.city}">
				<li class="fieldcontain">
					<span id="city-label" class="property-label"><g:message code="patient.city.label" default="City" /></span>
					
						<span class="property-value" aria-labelledby="city-label"><g:fieldValue bean="${patientInstance}" field="city"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${patientInstance?.doctorName}">
				<li class="fieldcontain">
					<span id="doctorName-label" class="property-label"><g:message code="patient.doctorName.label" default="Doctor Name" /></span>
					
						<span class="property-value" aria-labelledby="doctorName-label"><g:fieldValue bean="${patientInstance}" field="doctorName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${patientInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="patient.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${patientInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${patientInstance?.patientCode}">
				<li class="fieldcontain">
					<span id="patientCode-label" class="property-label"><g:message code="patient.patientCode.label" default="Patient Code" /></span>
					
						<span class="property-value" aria-labelledby="patientCode-label"><g:fieldValue bean="${patientInstance}" field="patientCode"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${patientInstance?.patientId}">
				<li class="fieldcontain">
					<span id="patientId-label" class="property-label"><g:message code="patient.patientId.label" default="Patient Id" /></span>
					
						<span class="property-value" aria-labelledby="patientId-label"><g:fieldValue bean="${patientInstance}" field="patientId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${patientInstance?.state}">
				<li class="fieldcontain">
					<span id="state-label" class="property-label"><g:message code="patient.state.label" default="State" /></span>
					
						<span class="property-value" aria-labelledby="state-label"><g:fieldValue bean="${patientInstance}" field="state"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:patientInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${patientInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
