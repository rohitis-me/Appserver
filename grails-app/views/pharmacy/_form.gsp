<%@ page import="com.pharmacy.store.Pharmacy" %>
<%@ page import="com.pharmacy.constants.StringConstants" %>



<div class="fieldcontain ${hasErrors(bean: pharmacyInstance, field: 'address', 'error')} required">
	<label for="address">
		<g:message code="pharmacy.address.label" default="Address" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="address" required="" value="${pharmacyInstance?.address}"/>

</div>

<%--<div class="fieldcontain ${hasErrors(bean: pharmacyInstance, field: 'chainId', 'error')} required">
	<label for="chainId">
		<g:message code="pharmacy.chainId.label" default="Chain Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="chainId" type="number" value="${pharmacyInstance.chainId}" required=""/>

</div>

--%>
<g:hiddenField name="chainId" value="${1 }"/>

<div class="fieldcontain ${hasErrors(bean: pharmacyInstance, field: 'circle', 'error')} required">
	<label for="circle">
		<g:message code="pharmacy.circle.label" default="Circle" />
		<span class="required-indicator">*</span>
	</label><%--
	<g:textField name="circle" required="" value="${pharmacyInstance?.circle}"/>
	
	--%>
	<g:select name="circle" from="${StringConstants.circle }" value="${pharmacyInstance.circle }"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pharmacyInstance, field: 'city', 'error')} required">
	<label for="city">
		<g:message code="pharmacy.city.label" default="City" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="city" required="" value="${pharmacyInstance?.city}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pharmacyInstance, field: 'latitude', 'error')} required">
	<label for="latitude">
		<g:message code="pharmacy.latitude.label" default="Latitude" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="latitude" required="" value="${pharmacyInstance?.latitude}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pharmacyInstance, field: 'longitude', 'error')} required">
	<label for="longitude">
		<g:message code="pharmacy.longitude.label" default="Longitude" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="longitude" required="" value="${pharmacyInstance?.longitude}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pharmacyInstance, field: 'state', 'error')} required">
	<label for="state">
		<g:message code="pharmacy.state.label" default="State" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="state" required="" value="${pharmacyInstance?.state}"/>

</div>

<%--<div class="fieldcontain ${hasErrors(bean: pharmacyInstance, field: 'storeId', 'error')} required">
	<label for="storeId">
		<g:message code="pharmacy.storeId.label" default="Store Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="storeId" type="number" value="${pharmacyInstance.storeId}" required=""/>

</div>

--%>
<div class="fieldcontain ${hasErrors(bean: pharmacyInstance, field: 'storeName', 'error')} required">
	<label for="storeName">
		<g:message code="pharmacy.storeName.label" default="Store Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="storeName" required="" value="${pharmacyInstance?.storeName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: pharmacyInstance, field: 'type', 'error')} required">
	<label for="type">
		<g:message code="pharmacy.type.label" default="Type" />
		<span class="required-indicator">*</span>
	</label>
	<%--<g:field name="type" type="number" value="${pharmacyInstance.type}" required=""/>
	
	--%>
	<g:select name="type" from="${StringConstants.storeTypes }" keys="${StringConstants.storeNum }" value="${pharmacyInstance.type }"/>

</div>

