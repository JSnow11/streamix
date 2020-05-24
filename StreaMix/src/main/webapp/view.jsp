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

<script>
	function show(b) {
		var twitter = document.getElementById("twitterPosts");
		var reddit = document.getElementById("redditPosts");
		var chat = document.getElementById("chatPosts");

		if (b == 1) {
			twitter.style.display = "block";
			reddit.style.display = "none";
			chat.style.display = "none";

		} else if (b == 2) {
			twitter.style.display = "none";
			reddit.style.display = "block";
			chat.style.display = "none";

		} else if (b == 3) {
			twitter.style.display = "none";
			reddit.style.display = "none";
			chat.style.display = "block";
		}
	}
</script>
</head>

<body>
	<div class="smallBrowser">
		<a class="left" href="index.html"><img src="images/Logo.png"
			alt="logo" width="50"></a>
		<form action="/search" method="GET">
			<input type="search" id="searchQuery" name="searchQuery"
				placeholder="Search" />
		</form>
		<a href="https://github.com/JSnow11/streamix/projects/1"><img
				src="images/GitHubIcon.png" alt="git" width="30"></a> <a
				href="about.html"><img src="images/about.png" alt="about"
				width="30"></a>
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
				allowfullscreen="true"> 
			</iframe>
			<%
				}
			%>
		</div>

		<div class="social">
			<div class="scroll">
				<div id="twitterPosts">
					<c:forEach var="tweet" items="${requestScope.tweets}">
						<div>${tweet}</div>
					</c:forEach>
				</div>
				<div id="redditPosts">
					<c:forEach var="rp" items="${requestScope.redditPosts}">
						<div class="redditPost">${rp}</div>
					</c:forEach>
				</div>
				<div id="chatPosts">
					<%
						if (request.getAttribute("videoID") != null) {
					%>
					<c:forEach var="comment" items="${requestScope.comments}">
						<div class="ytComment">
							<img
								src="${comment.snippet.topLevelComment.snippet.authorProfileImageUrl}">
							<b>${comment.snippet.topLevelComment.snippet.authorDisplayName }</b>
							<br> <br>
							${comment.snippet.topLevelComment.snippet.textOriginal}
						</div>
					</c:forEach>
					<br>
					<br>
					<div>
						<form action="/comment" method="post">
							Comentar: <input type="text" name="comentario"> <input
								hidden type="text" name="videoID"
								value="${requestScope.videoID}"> <input hidden
								type="text" name="pickedTopic"
								value="${requestScope.pickedTopic}"> <input
								type="submit">
						</form>
					</div>
					<%
						} else {
					%>
						<iframe 
							frameborder="0" scrolling="no"
							id="chat_embed" src="https://www.twitch.tv/embed/${requestScope.streamID}/chat?streamernews.example.com" 
							width="30"
							height="80"> 
						</iframe>
					<%
						}
					%>
				</div>
			</div>
			<div class="socialPicker">
				<img onclick="show(1)" src="images/twitterIcon.png" width="50px">
				<img onclick="show(2)" src="images/reddit.png" width="50px"> 
				<img onclick="show(3)" src="images/chatIcon.png" width="50px">
			</div>
		</div>

	</div>
</body>
</html>

