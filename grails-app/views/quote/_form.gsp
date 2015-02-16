<%@ page import="grails.rest.Quote" %>



<div class="fieldcontain ${hasErrors(bean: quoteInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="quote.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${quoteInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: quoteInstance, field: 'quotePrice', 'error')} required">
	<label for="quotePrice">
		<g:message code="quote.quotePrice.label" default="Quote Price" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="quotePrice" required="" value="${quoteInstance?.quotePrice}"/>

</div>

