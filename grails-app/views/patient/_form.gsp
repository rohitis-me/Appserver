<%@ page import="com.pharmacy.store.Patient" %>



<div class="fieldcontain ${hasErrors(bean: patientInstance, field: 'addressLine1', 'error')} required">
	<label for="addressLine1">
		<g:message code="patient.addressLine1.label" default="Address Line1" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="addressLine1" required="" value="${patientInstance?.addressLine1}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: patientInstance, field: 'addressLine2', 'error')} required">
	<label for="addressLine2">
		<g:message code="patient.addressLine2.label" default="Address Line2" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="addressLine2" required="" value="${patientInstance?.addressLine2}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: patientInstance, field: 'age', 'error')} required">
	<label for="age">
		<g:message code="patient.age.label" default="Age" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="age" required="" value="${patientInstance?.age}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: patientInstance, field: 'circle', 'error')} required">
	<label for="circle">
		<g:message code="patient.circle.label" default="Circle" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="circle" required="" value="${patientInstance?.circle}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: patientInstance, field: 'city', 'error')} required">
	<label for="city">
		<g:message code="patient.city.label" default="City" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="city" required="" value="${patientInstance?.city}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: patientInstance, field: 'doctorName', 'error')} required">
	<label for="doctorName">
		<g:message code="patient.doctorName.label" default="Doctor Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="doctorName" required="" value="${patientInstance?.doctorName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: patientInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="patient.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${patientInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: patientInstance, field: 'patientCode', 'error')} required">
	<label for="patientCode">
		<g:message code="patient.patientCode.label" default="Patient Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="patientCode" required="" value="${patientInstance?.patientCode}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: patientInstance, field: 'patientId', 'error')} required">
	<label for="patientId">
		<g:message code="patient.patientId.label" default="Patient Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="patientId" required="" value="${patientInstance?.patientId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: patientInstance, field: 'state', 'error')} required">
	<label for="state">
		<g:message code="patient.state.label" default="State" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="state" required="" value="${patientInstance?.state}"/>

</div>

