<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
    <meta name="layout" content="headeredLayout"/>
    <title>Error</title>
    
</head>
<body>

<g:applyLayout name="headeredLayout">  
<content tag="pagetitle">Uh Oh!</content>
   <h1>Error: ${ code }</h1>
   <p>${ message }</p>
</g:applyLayout>
</body>
</html>
