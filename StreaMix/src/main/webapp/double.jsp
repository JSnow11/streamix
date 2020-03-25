<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <link rel="icon" href="favicon.ico">
    <link rel="stylesheet" href="style.css">
    <title>StreaMix</title>
</head>

<body>
    <header>
        <h1>
            <a href="index.html"><img src="images/Logo.png" alt="logo" width="50"></a>
            <form action="/search">
                <input type="search" id="search" placeholder="Search" />
            </form>
        </h1>
    </header>
    <div class=container>
        <div class="yt">
        	<c:forEach items = "${requestScope.items}" var="item">
        		<span>Video Title: <c:out value="${item.snippet.title}"></c:out></span>
        	</c:forEach>


        </div>
        <div class="twitch">

        </div>

    </div>
    <footer>
        <h2>
            <a href="https://github.com/JSnow11/streamix/projects/1"><img src="images/GitHubIcon.png" alt="git" width="30"></a>
            <a href="about.html"><img src="images/about.png" alt="about" width="30"></a>
        </h2>
    </footer>

</body>

</html>