<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta name="layout" content="headeredLayout" />
<title>Thank You</title>
</head>
<g:set var="highlighted" value="navHome" scope="session" />
<content tag="pagetitle">Thank You!</content>

<body>
	<div class="body">
		<h1>
			Good News,
			${ sender }!
		</h1>
		<br />
		<p>
			Your message has been sent! A copy has also been sent to
			${ email }
		</p>
		<p>I will do my best to respond as soon as possible. Thank you for
			your interest.</p>

	</div>
</body>
</html>