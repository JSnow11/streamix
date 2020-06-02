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
                <a href="https://github.com/JSnow11/streamix/projects/1"><img src="images/GitHubIcon.png" alt="git" width="30"></a>
                <a href="about.html"><img src="images/about.png" alt="about" width="30"></a>
            </div>
            <div class="viewContainer">
                <div class="yt">
                    <h1>  <img src="images/yt.png" height="40px"> YouTube: </h1>
                    <div class="scroll">
	                    <div class="videos">
	                        <c:forEach items="${requestScope.ytvideos}" var="video">
	                        <div class="video">
	                            <a href="/view?pickedTopic=${requestScope.searchQuery}&videoID=${video.id.videoId}">
	                            	<img src=<c:out value="${video.snippet.thumbnails.medium.url}"></c:out> width="110"><br>
	                            </a>
	                            <p><b> @ <c:out value="${video.snippet.channelTitle}"></c:out></b></p>
	                            <p><c:out value="${video.snippet.title}"></c:out></p>
	                        </div>
	                        </c:forEach>
	                    </div>
                    </div>
                </div>
                <div class="twitch">
                    <h1>  <img src="images/twitch.png" height="40px"> Twitch: </h1>
                    <div class="scroll">
						<div class="videos">
	                        <c:forEach items="${requestScope.twstreams}" var="stream">
	                        <div class="video">
	                            <a href="/view?pickedTopic=${requestScope.searchQuery}&streamID=${stream.userName}"><img src=<c:out value="${stream.getThumbnailUrl()}"></c:out>></a>
	                        	<p><b> @ <c:out value="${stream.userName}"></c:out></b></p>
	                            <p><c:out value="${stream.title}"></c:out></p>    
	                        </div>
	                        </c:forEach>
	                    </div>
					</div>
                </div>
            </div>
        </body>
</html>