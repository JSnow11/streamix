<!--  header -->
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
		<a class="left" href="index.html"><img src="images/Logo.png"
			alt="logo" width="50"></a>
		<form action="/search" method="GET">
			<input type="search" id="searchQuery" name="searchQuery"
				placeholder="Search" />
		</form>
		<a href="https://github.com/JSnow11/streamix/projects/1"><img src="images/GitHubIcon.png" alt="git" width="30"></a>
        <a href="about.html"><img src="images/about.png" alt="about" width="30"></a>    
	</div>
	<div class="container">
		<div class="errorContainer">
			<h1>Hemos tenido algún error, disculpa las molestias.</h1>
			<a href="index.html" class="button"><button>Volver al inicio</button></a>
			<c:forEach items="${requestScope.errors}" var="error">
				<p>
					Error:
					<c:out value="${error}"></c:out>
				</p>
			</c:forEach>
		</div>
	</div>
</body>
</html>