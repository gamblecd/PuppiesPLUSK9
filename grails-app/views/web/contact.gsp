<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<meta name="layout" content="headeredLayout"/>
<title>Contact</title>
</head>
<g:set var="highlighted" value="navContact"/>
<content tag="pagetitle">Contact Me</content>
<body>
  <div class="body contact">
    <div class="contact_info">
          <h1>Contact Information</h1>
          <h3>Marchele</h3>
          <br />
          <p>Phone: 425.418.6131</p>
          <p>Email: marchele@puppiesplusk9.com</p>
      </div>

    <div class="contact_email_form">
       <g:form name="email_form" controller="web" >
       <fieldset class="email_form">
       <legend class="form_title">Email</legend>
	       <p><label for="inquirer_name">Name:</label><g:textField class="form_element" name="inquirer_name" label="Name"/></p>
	       <br />
	       <p><label for="inquirer_email">Email:</label><g:textField name="inquirer_email" label="Email"/></p>
           <br />
           <p><label for="inquirer_subject">Subject:</label><g:textField name="inquirer_subject" label="Subject"/></p>
           <br />
	       <p><label for="inquirer_message">Message:</label><g:textArea width="100%" name="inquirer_message"/></p>
	       <br />
       </fieldset>
       <p class="form_submit"><g:actionSubmit action="inquire" value="Send Email" tagName="Submit"/></p>
       </g:form>
    </div>
<!-- 	 -->
  </div>
</body>
</html>