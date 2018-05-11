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
    <style>
        h1{
            color:#000000;
            margin-top:4%;
            margin-left: 13%;
            
            text-decoration: underline;
        } 
       #a1{
         margin-left: 23%;
         margin-top: 7%;
        }
        a{
            text-decoration:none;
            
            font-weight: bold; 
        }
        body{
            background-image: url("back3.jpg");
            background-repeat: no-repeat;
            background-size: 100% 50.4%;
         }
    </style>
</head>
<body>
  <h1>Accountant Panel</h1>  <ul>
      <div id="a1" style="  font-size: 23; " ><li><a style=" color:#556666;" href="saddact.jsp">Add Student</a></li><br>
 <li> <a style=" color:#556666;" href="sshowAct.jsp" >View Student</a></li>
  </div></ul>
</body><br><br><br><br><br><br><br><br><br><br>
<%@include file="footer.jsp" %>