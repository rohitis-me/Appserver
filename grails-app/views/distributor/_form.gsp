<%@ page import="com.pharmacy.store.Distributor" %>



<div class="fieldcontain ${hasErrors(bean: distributorInstance, field: 'addressLine1', 'error')} required">
	<label for="addressLine1">
		<g:message code="distributor.addressLine1.label" default="Address Line1" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="addressLine1" required="" value="${distributorInstance?.addressLine1}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: distributorInstance, field: 'addressLine2', 'error')} required">
	<label for="addressLine2">
		<g:message code="distributor.addressLine2.label" default="Address Line2" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="addressLine2" required="" value="${distributorInstance?.addressLine2}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: distributorInstance, field: 'circle', 'error')} required">
	<label for="circle">
		<g:message code="distributor.circle.label" default="Circle" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="circle" required="" value="${distributorInstance?.circle}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: distributorInstance, field: 'city', 'error')} required">
	<label for="city">
		<g:message code="distributor.city.label" default="City" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="city" required="" value="${distributorInstance?.city}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: distributorInstance, field: 'distributorId', 'error')} required">
	<label for="distributorId">
		<g:message code="distributor.distributorId.label" default="Distributor Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="distributorId" required="" value="${distributorInstance?.distributorId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: distributorInstance, field: 'phoneNumber1', 'error')} required">
	<label for="phoneNumber1">
		<g:message code="distributor.phoneNumber1.label" default="Phone Number1" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="phoneNumber1" required="" value="${distributorInstance?.phoneNumber1}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: distributorInstance, field: 'phoneNumber2', 'error')} required">
	<label for="phoneNumber2">
		<g:message code="distributor.phoneNumber2.label" default="Phone Number2" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="phoneNumber2" required="" value="${distributorInstance?.phoneNumber2}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: distributorInstance, field: 'pinCode', 'error')} required">
	<label for="pinCode">
		<g:message code="distributor.pinCode.label" default="Pin Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="pinCode" required="" value="${distributorInstance?.pinCode}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: distributorInstance, field: 'state', 'error')} required">
	<label for="state">
		<g:message code="distributor.state.label" default="State" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="state" required="" value="${distributorInstance?.state}"/>

</div>

