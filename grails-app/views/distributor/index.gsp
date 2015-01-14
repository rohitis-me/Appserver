
<%@ page import="com.pharmacy.store.Distributor" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'distributor.label', default: 'Distributor')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-distributor" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-distributor" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="addressLine1" title="${message(code: 'distributor.addressLine1.label', default: 'Address Line1')}" />
					
						<g:sortableColumn property="addressLine2" title="${message(code: 'distributor.addressLine2.label', default: 'Address Line2')}" />
					
						<g:sortableColumn property="circle" title="${message(code: 'distributor.circle.label', default: 'Circle')}" />
					
						<g:sortableColumn property="city" title="${message(code: 'distributor.city.label', default: 'City')}" />
					
						<g:sortableColumn property="distributorId" title="${message(code: 'distributor.distributorId.label', default: 'Distributor Id')}" />
					
						<g:sortableColumn property="phoneNumber1" title="${message(code: 'distributor.phoneNumber1.label', default: 'Phone Number1')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${distributorInstanceList}" status="i" var="distributorInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${distributorInstance.id}">${fieldValue(bean: distributorInstance, field: "addressLine1")}</g:link></td>
					
						<td>${fieldValue(bean: distributorInstance, field: "addressLine2")}</td>
					
						<td>${fieldValue(bean: distributorInstance, field: "circle")}</td>
					
						<td>${fieldValue(bean: distributorInstance, field: "city")}</td>
					
						<td>${fieldValue(bean: distributorInstance, field: "distributorId")}</td>
					
						<td>${fieldValue(bean: distributorInstance, field: "phoneNumber1")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${distributorInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
