<%@ page contentType="text/html;charset=UTF-8"%>
<div class="eventList">
	<g:each var="event" in="${ events }">
		<g:render template="calendarEvent" model="['event':event]" />
	</g:each>
</div>