
<%@ page import="com.pharmacy.store.Pharmacy" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'pharmacy.label', default: 'Pharmacy')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-pharmacy" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-pharmacy" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="addressLine1" title="${message(code: 'pharmacy.addressLine1.label', default: 'Address Line1')}" />
					
						<g:sortableColumn property="addressLine2" title="${message(code: 'pharmacy.addressLine2.label', default: 'Address Line2')}" />
					
						<g:sortableColumn property="chainId" title="${message(code: 'pharmacy.chainId.label', default: 'Chain Id')}" />
					
						<g:sortableColumn property="circle" title="${message(code: 'pharmacy.circle.label', default: 'Circle')}" />
					
						<g:sortableColumn property="city" title="${message(code: 'pharmacy.city.label', default: 'City')}" />
					
						<g:sortableColumn property="latitude" title="${message(code: 'pharmacy.latitude.label', default: 'Latitude')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${pharmacyInstanceList}" status="i" var="pharmacyInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${pharmacyInstance.id}">${fieldValue(bean: pharmacyInstance, field: "addressLine1")}</g:link></td>
					
						<td>${fieldValue(bean: pharmacyInstance, field: "addressLine2")}</td>
					
						<td>${fieldValue(bean: pharmacyInstance, field: "chainId")}</td>
					
						<td>${fieldValue(bean: pharmacyInstance, field: "circle")}</td>
					
						<td>${fieldValue(bean: pharmacyInstance, field: "city")}</td>
					
						<td>${fieldValue(bean: pharmacyInstance, field: "latitude")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${pharmacyInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
