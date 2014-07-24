
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
					
						<g:sortableColumn property="batch" title="${message(code: 'inventory.batch.label', default: 'Batch')}" />
					
						<g:sortableColumn property="brandId" title="${message(code: 'inventory.brandId.label', default: 'Brand Id')}" />
					
						<g:sortableColumn property="discount" title="${message(code: 'inventory.discount.label', default: 'Discount')}" />
					
						<g:sortableColumn property="expiry" title="${message(code: 'inventory.expiry.label', default: 'Expiry')}" />
					
						<g:sortableColumn property="inventoryId" title="${message(code: 'inventory.inventoryId.label', default: 'Inventory Id')}" />
					
						<g:sortableColumn property="isDeleted" title="${message(code: 'inventory.isDeleted.label', default: 'Is Deleted')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${inventoryInstanceList}" status="i" var="inventoryInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${inventoryInstance.id}">${fieldValue(bean: inventoryInstance, field: "batch")}</g:link></td>
					
						<td>${fieldValue(bean: inventoryInstance, field: "brandId")}</td>
					
						<td>${fieldValue(bean: inventoryInstance, field: "discount")}</td>
					
						<td><g:formatDate date="${inventoryInstance.expiry}" /></td>
					
						<td>${fieldValue(bean: inventoryInstance, field: "inventoryId")}</td>
					
						<td><g:formatBoolean boolean="${inventoryInstance.isDeleted}" /></td>
					
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
