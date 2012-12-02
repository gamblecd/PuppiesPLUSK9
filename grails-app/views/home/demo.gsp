<%@ page contentType="text/html;charset=UTF-8" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
        <meta name="layout" content="main"/>
        <title>Page Demos</title>
        
	</head>
<body>
    <div id="header"></div>
    <div id="content">
        <content name="mainNav">
            <div id="navigation" class="page_body transparent">
                <ul>
                    <li class="nav_option"><p>Home</p></li>
                    <li class="nav_option"><p>${(new puppiesplusk9.HomeController()).about()}</p></li>
                    <li class="nav_option"><p>What I Do</p></li>
                    <li class="nav_selection nav_option">${(new puppiesplusk9.HomeController()).index()}</p></li>
                    <li class="nav_option"><p>${(new puppiesplusk9.HomeController()).testimonials()}</p></li>
                    <li class="nav_option"><p>Events</p></li>
                    <li class="nav_option last"><p>Contact</p></li>
                </ul>
            </div>
        </content>
	<div id="index" class="page_body page_content transparent"></div>
	</div>
	<div id="footer"></div>
</body>
</html>