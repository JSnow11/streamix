<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="icon" href="images/Logo.png">
<link rel="stylesheet" href="style.css">
<title>StreaMix</title>
</head>

<body>
	<div class="smallBrowser">
		<a class="left" href="index.html"><img src="images/Logo.png"
			alt="logo" width="50"></a>
		<form action="/search" method="GET">
			<input type="search" id="searchQuery" name="searchQuery"
				placeholder="Search" />
		</form>
	</div>

	<div class="viewContainer">

		<div class="screen">
			<%
				if (request.getAttribute("videoID") != null) {
			%>
			<iframe src="https://www.youtube.com/embed/${requestScope.videoID}"
				frameborder="0"
				allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture"
				allowfullscreen></iframe>
			<%
				} else {
			%>
			<iframe
				src="https://player.twitch.tv/?channel=${requestScope.streamID}&parent=streamernews.example.com"
				height="720" width="1280" frameborder="0" scrolling="no"
				allowfullscreen="true"> </iframe>
			<%
				}
			%>
		</div>

		<div class="social">
			<div class="scroll">
				<div>
					<c:forEach var="tweet" items="${requestScope.tweets}">
						<div>${tweet}</div>
					</c:forEach>
				</div>
				<div>
					<c:forEach var="rp" items="${requestScope.redditPosts}">
						<div>${rp}</div>
					</c:forEach>
				</div>
				<div>
				<c:forEach var="comment" items="${requestScope.comments}">
					<div class="ytComment">
						<img src="${comment.snippet.topLevelComment.snippet.authorProfileImageUrl}"> <b>${comment.snippet.topLevelComment.snippet.authorDisplayName }</b> <br><br>
						${comment.snippet.topLevelComment.snippet.textOriginal}
					</div>
				</c:forEach>
				
					<div>
						<form action="/CommentController" method="post">
							Comentar: <input type="text" name="comentario">
							<input hidden type="text" name="videoId" value="${requestScope.videoID }">
							<input type="submit">
						</form>
					</div>
				</div>
			</div>

			<div class="socialPicker"></div>
		</div>
	</div>


	<footer>
		<h2>
			<a href="https://github.com/JSnow11/streamix/projects/1"><img
				src="images/GitHubIcon.png" alt="git" width="30"></a> <a
				href="about.html"><img src="images/about.png" alt="about"
				width="30"></a>
		</h2>
	</footer>
</body>
</html>

