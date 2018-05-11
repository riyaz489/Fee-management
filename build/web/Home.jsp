<%-- 
    Document   : Home
    Created on : Jul 3, 2017, 4:39:47 PM
    Author     : Riyazuddin khan
--%>

<!DOCTYPE html>

  <jsp:include page="header1.jsp" />
<div id="body1">
<html>
    <head>
        <title>Fee Management</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="home.css">
    </head>
    <body>
        <div id="block1">
           <form action="lauth" method="post"> <h2>Admin Login Form</h2>
               <input type="email" name="an" size="30" ><br>
            <input type="password" name="ap" size="30"><br>
            <input type="submit" value="Login"><br><br>
           </form>
    </div>
        <div id="block2">
            <form action="lauth2" method="post"> <h2> Accountant Login Form</h2>
            <input type="email" name="acn" size="30"><br>
            <input type="password" name="acp" size="30"><br>
            <input type="submit" value="Login"><br><br>
           </form>
        </div>
    </body>
</html></div><br><br><br>
    <jsp:include page="footer.jsp" />
    