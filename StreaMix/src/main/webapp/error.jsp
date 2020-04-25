<!--  header -->

<body>
	<div class="smallBrowser">
        <a class="left" href="index.html"><img src="images/Logo.png" alt="logo" width="50"></a>
        <form action="/search" method="GET">
            <input type="search" id="searchQuery" name="searchQuery" placeholder="Search" />
        </form>
    </div>
	<h1>Hemos tenido los siguientes errores:</h1>
	<c:forEach items="${requestScope.errors}" var="error">
        <p>Error:
			<c:out value="${error}"></c:out>
        </p>
    </c:forEach>

	<div class="container">
	<a href="index.html" class="button">Go to main view</a>
	</div>
</body>