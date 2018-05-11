<%@include file="aheader.jsp" %>
<%HttpSession hs=null;
hs=request.getSession(false);
            if(hs==null)
            {
                response.sendRedirect("Home.jsp");
            }
            %>
            <head><style> body{
            background-image: url("back2.jpg");
            background-repeat: no-repeat;
            background-size: 100% 51.4%;
         }
         input[type="submit"]{
             color: whitesmoke;
             background-color: #222222;
             padding:4px;
             font-weight: 700;
             height: 30px;
             width: 90px;
             margin-top:7%;
             margin-left:25%;
             border-radius: 2em;
             border-width: 0px;
             margin-bottom: 14%;
             
             
         }</style></head>
           <body ><form action="updAct" method="post">
                   <h1 style="margin-left:20%;margin-top:1%;margin-bottom: 10%;"> Update Details</h1>
           
           <u style="font-weight: 600;font-size: 1.2em;margin-left: 25%;">Enter your id : </u>
           <input style="margin-left: 3%;height:25px; " type="text" placeholder="enter your ID number" name="id">
           <br><input type="submit" value="update"></form>
           </body>
            <%@include file="footer.jsp" %>