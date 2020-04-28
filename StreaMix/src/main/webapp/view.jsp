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

    <div class="viewContainer">
        <div class="screen">
            <iframe src="https://www.youtube.com/embed/Pux2u8rLnHo" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
        </div>
        <div class="social">
            <div class="scroll">
                <div>
                    <c:forEach var="tweet" items="${requestScope.tweets}" >
                                <c:out value="${tweet}"></c:out>
                        </c:forEach>
                </div>
                <div>
                    <c:forEach var="rp" items="${requestScope.redditPosts}" >
                                <c:out value="${rp}"></c:out>
                        </c:forEach>
                </div>
            </div>

            <div class="socialPicker">
            </div>
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