
<%@ page import="com.pharmacy.store.Billing" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'billing.label', default: 'Billing')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-billing" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-billing" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="batch" title="${message(code: 'billing.batch.label', default: 'Batch')}" />
					
						<g:sortableColumn property="billingId" title="${message(code: 'billing.billingId.label', default: 'Billing Id')}" />
					
						<g:sortableColumn property="billingNumber" title="${message(code: 'billing.billingNumber.label', default: 'Billing Number')}" />
					
						<g:sortableColumn property="billingTime" title="${message(code: 'billing.billingTime.label', default: 'Billing Time')}" />
					
						<g:sortableColumn property="brandId" title="${message(code: 'billing.brandId.label', default: 'Brand Id')}" />
					
						<g:sortableColumn property="discount" title="${message(code: 'billing.discount.label', default: 'Discount')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${billingInstanceList}" status="i" var="billingInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${billingInstance.id}">${fieldValue(bean: billingInstance, field: "batch")}</g:link></td>
					
						<td>${fieldValue(bean: billingInstance, field: "billingId")}</td>
					
						<td>${fieldValue(bean: billingInstance, field: "billingNumber")}</td>
					
						<td><g:formatDate date="${billingInstance.billingTime}" /></td>
					
						<td>${fieldValue(bean: billingInstance, field: "brandId")}</td>
					
						<td>${fieldValue(bean: billingInstance, field: "discount")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${billingInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
