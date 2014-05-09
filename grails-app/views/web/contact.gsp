<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta name="layout" content="headeredLayout" />
<title>Contact</title>
</head>
<g:set var="highlighted" value="navContact" />
<content tag="pagetitle">Contact Me</content>
<body>
	<div class="contact_info">
		<div class="content-header">
			<h1>Contact Information</h1>
			<h3>Marchele</h3>
		</div>
		<br />
		<p>Phone: 425.418.6131</p>
		<p>Email: marchele@puppiesplusk9.com</p>
	</div>

	<div class="contact_email_form left-border">
		<g:form name="email_form" controller="web">
			<fieldset class="email_form">
				<legend class="form_title content-header">Email</legend>
				<span class="input-item">
					<label for="inquirer_name">Name:</label>
					<g:textField name="inquirer_name" label="Name" />
				</span>
				
				<span class="input-item">
					<label for="inquirer_email">Email:</label>
					<g:textField name="inquirer_email" label="Email" />
				</span>
				<span class="input-item">
					<label for="inquirer_subject">Subject:</label>
					<g:textField name="inquirer_subject" label="Subject" />
				</span>
				<span class="input-item">
					<label for="inquirer_message">Message:</label>
					<g:textArea width="100%" name="inquirer_message" />
				</span>
			</fieldset>
			<p class="form_submit">
				<g:actionSubmit action="inquire" value="Send Email" tagName="Submit" />
			</p>
		</g:form>
	</div>
	<!-- 	 -->
</body>
</html>