<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta name="layout" content="headeredLayout" />
<title>Calendar</title>
</head>
<g:set var="highlighted" value="navEvents" />
<content tag="pagetitle">Upcoming Events</content>

<body>
	<link rel="stylesheet" type="text/css"
		href="${resource(dir: 'css', file: 'calendar.css')}" />

	<div class="calendar_main">
		<g:render template="eventList" model="${ events }" />
	
		<div class="calendar">
			<iframe src="https://www.google.com/calendar/embed?showTitle=0&amp;showPrint=0&amp;showCalendars=0&amp;mode=WEEK&amp;height=600&amp;wkst=1&amp;bgcolor=%23ffffff&amp;src=marchele%40puppiesplusk9.com&amp;color=%23875509&amp;ctz=America%2FLos_Angeles"
				style="border: 1" width="100%" height="400px"></iframe>
		</div>
		<!-- 	 -->
	</div>
</body>
</html>