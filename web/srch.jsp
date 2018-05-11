<%@include file="saheader.jsp" %>
<%HttpSession hs=null;
hs=request.getSession(false);
            if(hs==null)
            {
                response.sendRedirect("Home.jsp");
            }
            %>
            <head><style> body{
            background-image: url("back3.jpg");
            background-repeat: no-repeat;
            background-size: 100%50.4%;
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
           <body ><form action="srch" method="post">
                   <h1 style="margin-left:20%;margin-top:1%;margin-bottom: 7%;"> Find Student</h1>
           
           <u style="font-weight: 600;font-size: 1.2em;margin-left: 25%;">Enter Roll No : </u>
           <input style="margin-left: 3%;height:25px; " type="text" placeholder="enter  ID number" name="id">
           <br><input type="submit" value="Search"></form>
           </body>
            <%@include file="footer.jsp" %>