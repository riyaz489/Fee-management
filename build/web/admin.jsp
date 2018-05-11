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
    <style>
        h1{
            color:#000000;
            margin-top:4%;
            margin-left: 13%;
            font-size:35;
            text-decoration: underline;
        } 
       #a1{color:#222222;
         margin-left: 23%;
         margin-top: 7%;
        }
        a{
            text-decoration:none;
            color:#112211;
            font-weight: bold; 
        }
        body{
            background-image: url("back2.jpg");
            background-repeat: no-repeat;
            background-size: 100% 51.4%;
         }
    </style>
</head>
<body>
  <h1>Admin Panel</h1>  <ul>
      <div id="a1" style="  font-size: 23; "><li><a href="addact.jsp">Add Accountant</a></li><br>
 <li> <a href="showAct.jsp" >View Accountant</a></li>
  </div></ul>
</body><br><br><br><br><br><br><br><br><br><br>
<%@include file="footer.jsp" %>