
<%@ page import="com.pharmacy.store.Patient" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'patient.label', default: 'Patient')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-patient" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-patient" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="addressLine1" title="${message(code: 'patient.addressLine1.label', default: 'Address Line1')}" />
					
						<g:sortableColumn property="addressLine2" title="${message(code: 'patient.addressLine2.label', default: 'Address Line2')}" />
					
						<g:sortableColumn property="age" title="${message(code: 'patient.age.label', default: 'Age')}" />
					
						<g:sortableColumn property="circle" title="${message(code: 'patient.circle.label', default: 'Circle')}" />
					
						<g:sortableColumn property="city" title="${message(code: 'patient.city.label', default: 'City')}" />
					
						<g:sortableColumn property="doctorName" title="${message(code: 'patient.doctorName.label', default: 'Doctor Name')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${patientInstanceList}" status="i" var="patientInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${patientInstance.id}">${fieldValue(bean: patientInstance, field: "addressLine1")}</g:link></td>
					
						<td>${fieldValue(bean: patientInstance, field: "addressLine2")}</td>
					
						<td>${fieldValue(bean: patientInstance, field: "age")}</td>
					
						<td>${fieldValue(bean: patientInstance, field: "circle")}</td>
					
						<td>${fieldValue(bean: patientInstance, field: "city")}</td>
					
						<td>${fieldValue(bean: patientInstance, field: "doctorName")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${patientInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
