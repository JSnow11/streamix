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
            <div class="smallBrowser">
                <a class="left" href="index.html"><img src="images/Logo.png" alt="logo" width="50"></a>
                <form action="/search" method="GET">
                    <input type="search" id="searchQuery" name="searchQuery" placeholder="Search" />
                </form>
            </div>
            <div class=container>
                <div class="yt">
                    <h2>YouTube: </h2>
                    <br>
                    <hr><br>
                    <c:forEach items="${requestScope.ytvideos}" var="video">
                            <a href="/view?pickedTopic=hola"><c:out value="${video.snippet.title}"></c:out></a>
                    </c:forEach>
                </div>
                <div class="twitch">
                    <h2>Twitch: </h2>
                    <br>
                    <hr><br>

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