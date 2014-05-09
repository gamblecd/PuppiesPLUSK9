<%@ page contentType="text/html;charset=UTF-8"%>
<div class="calendarEvent">
	<div class="cal-header">
		<h3>${ event.summary }</h3>
		<h4>
			<g:each in="${event.start}" var="eventStart">
            	${eventStart.dateTime}
        	</g:each>
       	</h4>
	</div>
	<div class="cal-body">
		<h5 class="location">${ event.location }</h5>
		<p class="description">${ event.description }</p>
	</div>
</div>