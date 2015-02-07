<%@ page contentType="text/html;charset=UTF-8"%>
<div class="calendarEvent">
	<h5 class="time"><g:formatDate format='MM/dd/yy h:mma' date='${event.start.dateTime}'/></h5>
    <h3 class="title">${ event.summary }</h3>
	<hr />
	<h5 class="location">${ event.location }</h5>
	<p class="description">${ event.description }</p>
</div>