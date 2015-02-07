<g:applyLayout name="main" >
	<g:set var="mainNav"><nav id="navigation" class="page_body transparent">
            <g:set var="highlighted" value="${pageProperty(name: 'page.highlighted')}"/>
                <g:link id="nav-Home" class="nav_option soft-border" controller="web" action="index">Home</g:link>
                <g:link id="nav-About" class="nav_option soft-border" controller="web" action="about">About Me</g:link>
                <g:link id="nav-WhatIDo" class="nav_option soft-border" controller="web" action="whatIDo">What I Do</g:link>
                <g:if env="development">
                	<g:link id="nav-Testimonials" class="nav_option soft-border" controller="web" action="testimonials">Testimonials</g:link>
                	<g:link id="nav-Events" class="nav_option soft-border" controller="web" action="events">Upcoming Events</g:link>
                </g:if>
				<g:link id="nav-Contact" class="nav_option soft-border" controller="web" action="contact">Contact</g:link>
                <!-- Write GSP to highlight the id set by highlighted -->
            <% %>
            </nav></g:set>
    <title><g:layoutTitle /> | PuppiesPLUS K9 Training</title>
	<content tag="header"><div id="header" role="banner">
			<a href="#"><img src="${resource(dir: 'images/logo', file: 'ppklogow640.png')}" alt="PuppiesPlusLogo" height='100px'/></a>
			<h1 class="pagetitle"><g:pageProperty name="page.pagetitle" /></h1>
		</div></content><content tag="navigation">
			<g:pageProperty name="page.navigation" default="${mainNav}" />
		</content><content tag="content"><div id="pageContent" class="page_body page_content transparent">
				<g:layoutBody />
			</div></content>
	</div>
	<content tag="footer">
		<div class="footer" role="contentinfo"></div>
	</content>
</g:applyLayout>