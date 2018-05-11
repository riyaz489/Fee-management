
<%@include file="saheader.jsp" %>
<%HttpSession hs=null;
hs=request.getSession(false);
            if(hs==null)
            {
                response.sendRedirect("Home.jsp");
            }
            %>
<head>
    <title>Accountant Panel</title>
    <link rel="stylesheet" type="text/css" href="css.css">
      <style> body{
            background-image: url("back3.jpg");
            background-repeat: no-repeat;
            background-size: 100%60.4%;
         }</style>
</head>
<body>
  <h1>Add Student</h1>  
<form action="sactadd" method="post">
    <br> Roll No. :<input style="margin-left: 73px;" type="text" placeholder="enter roll no" name="rollno" >
 <br> Name:<input style="margin-left: 96px;" type="text" placeholder="enter  name" name="name">
 <br> Email:<input style="margin-left: 96px;" type="email" placeholder="enter your email" name="email">
 <br> Sex:<input style="margin-left: 115px;"  type="text" placeholder="enter sex" name="sex">
  <br> Course:<input style="margin-left: 83px;" type="text" placeholder="enter course" name="course">
   <br> Fee:<input style="margin-left: 112px;" type="text" placeholder="enter fee" name="fee">
 <br> Paid:<input style="margin-left: 100px;" type="text" placeholder="enter paid fee" name="paid">
   <br> Address:<input style="margin-left: 69px;" type="text" placeholder="enter  city" name="add">
 <br> Contact:<input style="margin-left: 69px;" type="text" placeholder="enter  contact number" name="contact">
 <br><input type="submit" value="submit"> <br>
  </form>
</body><div style="margin-top: 40%;"><%@include file="footer.jsp" %>