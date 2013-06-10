<g:applyLayout name="main" >
	<g:set var="mainNav">
	    <div id="navigation" class="page_body transparent">
            <ul>
            <g:set var="highlighted" value="${pageProperty(name: 'page.highlighted')}"/>
                <li id="nav-Home" class="nav_option"><g:link controller="web" action="index">Home</g:link></li>
                <li id="nav-About" class="nav_option"><g:link controller="web" action="about">About Me</g:link></li>
                <li id="nav-WhatIDo" class="nav_option"><g:link controller="web" action="whatIDo">What I Do</g:link></li>
                <g:if env="development">
                	<li id="nav-Testimonials" class="nav_option"><g:link controller="web" action="testimonials">Testimonials</g:link></li>
                	<li id="nav-Events" class="nav_option"><g:link controller="web" action="events">Upcoming Events</g:link></li>
                </g:if>
                <li id="nav-Contact" class="nav_option last"><g:link controller="web" action="contact">Contact</g:link></li>
                <!-- Write GSP to highlight the id set by highlighted -->
            <% %>
            </ul>
        </div>
    </g:set>
    <title><g:layoutTitle /> | PuppiesPLUS K9 Training</title>
	<content tag="header">
		<div id="header" role="banner">
			<a href="#"><img src="${resource(dir: 'images/logo', file: 'ppklogow640.png')}" alt="PuppiesPlusLogo" height='100px'/></a>
			<h1 class="pagetitle"><g:pageProperty name="page.pagetitle" /></h1>
		</div>
	</content>
	<content tag="navigation">
			<g:pageProperty name="page.navigation" default="${mainNav}" />
		</content>
		
		<content tag="content">
			<div id="pageContent" class="page_body page_content transparent">
				<g:layoutBody />
			</div>
		</content>
	</div>
	<content tag="footer">
		<div class="footer" role="contentinfo"></div>
	</content>
</g:applyLayout>