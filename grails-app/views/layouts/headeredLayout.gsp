<g:applyLayout name="main" >
	<g:set var="mainNav">
	    <div id="navigation" class="page_body transparent">
            <ul>
            <g:set var="highlighted" value="${pageProperty(name: 'page.highlighted')}"/>
                <li id="navHome" class="nav_option"><a href="/home/index">Home</a></li>
                <li id="navAbout" class="nav_option"><a href="/home/about">About Me</a></li>
                <li id="navWhatIDo" class="nav_option"><a href="/home/whatIDo">What I Do</a></li>
                <li id="navTestimonials" class="nav_option"><a href="/home/testimonials">Testimonials</a></li>
                <li id="navEvents" class="nav_option"><a href="/home/events">Events</a></li>
                <li id="navContact" class="nav_option last"><a href="/home/contact">Contact</a></li>
                <!-- Write GSP to highlight the id set by highlighted -->
            <% %>
            </ul>
        </div>
    </g:set>
    <title><g:layoutTitle /></title>
	<content tag="header">
		<div id="header" role="banner">
			<a href="#"><img src="${resource(dir: 'images/logo', file: 'ppklogow640.png')}" alt="PuppiesPlusLogo" height='100px'/></a>
			<div class="contact" >
				<p>Marchele Gamble</p>
				<p>Phone: 425.XXX.XXXX</p>
			</div>
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