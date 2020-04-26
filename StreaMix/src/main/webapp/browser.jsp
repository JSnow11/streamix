<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <link rel="icon" href="images/Logo.png">
    <link rel="stylesheet" href="style.css">
    <title>StreaMix</title>
</head>

<body>
    <div class="container">
        <div class="browser">
            <a href="index.html"><img src="images/Logo.png" alt="logo"></a>
            <br>
            <form action="search" method="GET">
                <input type="search" id="searchQuery" name="searchQuery" placeholder="Search" /><br>
            </form>
        </div>
        <div class="trend">
            <h2>TRENDING</h2>
            <div class="twitchTrending">
                <h3>Streaming</h3>
                
            </div>
            <div class="twitterTrending">
                <h3>Topics</h3>
                <div class="scroll">
	                <c:forEach items="${requestScope.trends}" var="trend">
						<a href="/search?searchQuery='hola'"><c:out value="${trend.getName().toString()}"></c:out></a>    
	                </c:forEach>
                </div>
            </div>
        </div>
    </div>
    <footer>
        <a href="https://github.com/JSnow11/streamix/projects/1"><img src="images/GitHubIcon.png" alt="git" width="30"></a>
        <a href="about.html"><img src="images/about.png" alt="about" width="30"></a>
    </footer>


</body>

</html>