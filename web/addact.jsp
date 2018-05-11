
<%@include file="aheader.jsp" %>
<%HttpSession hs=null;
hs=request.getSession(false);
            if(hs==null)
            {
                response.sendRedirect("Home.jsp");
            }
            %>
<head>
    <title>Admin Panel</title>
    <link rel="stylesheet" type="text/css" href="css.css">
</head>
<body>
  <h1>Add Accountant</h1>  
<form action="actadd" method="post">
    <br> Id:<input style="margin-left: 73px;" type="text" placeholder="enter your id" name="id" >
 <br> Name:<input style="margin-left: 45px;" type="text" placeholder="enter your name" name="name">
 <br> Email:<input style="margin-left: 44px;" type="email" placeholder="enter your email" name="email">
 <br> Password:<input  type="password" placeholder="enter your password" name="pass">
 <br> Address:<input style="margin-left: 27px;" type="text" placeholder="enter your city" name="add">
 <br> Contact:<input style="margin-left: 30px;" type="text" placeholder="enter your contact" name="con">
 <br><input type="submit" value="submit"> <br>
  </form>
</body><div style="margin-top: 20%;"><%@include file="footer.jsp" %>