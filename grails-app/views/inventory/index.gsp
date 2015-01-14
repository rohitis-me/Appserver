
<%@ page import="com.pharmacy.store.Inventory" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'inventory.label', default: 'Inventory')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-inventory" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-inventory" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="VAT" title="${message(code: 'inventory.VAT.label', default: 'VAT')}" />
					
						<g:sortableColumn property="batch" title="${message(code: 'inventory.batch.label', default: 'Batch')}" />
					
						<g:sortableColumn property="brandId" title="${message(code: 'inventory.brandId.label', default: 'Brand Id')}" />
					
						<g:sortableColumn property="brandName" title="${message(code: 'inventory.brandName.label', default: 'Brand Name')}" />
					
						<g:sortableColumn property="discountAmount" title="${message(code: 'inventory.discountAmount.label', default: 'Discount Amount')}" />
					
						<g:sortableColumn property="expiry" title="${message(code: 'inventory.expiry.label', default: 'Expiry')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${inventoryInstanceList}" status="i" var="inventoryInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${inventoryInstance.id}">${fieldValue(bean: inventoryInstance, field: "VAT")}</g:link></td>
					
						<td>${fieldValue(bean: inventoryInstance, field: "batch")}</td>
					
						<td>${fieldValue(bean: inventoryInstance, field: "brandId")}</td>
					
						<td>${fieldValue(bean: inventoryInstance, field: "brandName")}</td>
					
						<td>${fieldValue(bean: inventoryInstance, field: "discountAmount")}</td>
					
						<td><g:formatDate date="${inventoryInstance.expiry}" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${inventoryInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
