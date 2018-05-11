<%-- 
    Document   : updAct2
    Created on : Jul 20, 2017, 7:40:37 PM
    Author     : Riyazuddin khan
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.jdbc.ResultSetRow"%>
<%@page import="pack.MyCon"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@include file="saheader.jsp" %>
<head><link rel="stylesheet" type="text/css" href="css.css">
<style>body{
            background-image: url("back3.jpg");
            background-repeat: no-repeat;
            background-size: 100% 96.4%;
            height:155%;
         }</style></head>

<%HttpSession hs=null;
hs=request.getSession(false);
            if(hs==null)
            {
                response.sendRedirect("Home.jsp");
            }
          %>  <%
                       try{ Connection con= MyCon.getCon();
                  PreparedStatement pst =con.prepareStatement("select * from student where rollno=?");
                  pst.setInt(1, Integer.parseInt(request.getParameter("id")));
                  ResultSet rs =pst.executeQuery();
                    
                    while(rs.next()){
            %>
            <h2 style="margin-left:25%;text-decoration: underline; ">Update Here</h2>
            <form action="supdAct2" method="post">
                
                <br> Id:<input style="margin-left: 75px;" type="text" value="<%=rs.getInt(1)%>" name="id2"   >
 <br> Name:<input style="margin-left: 47px;" type="text" value="<%=rs.getString(2)%>"  name="name2">
 <br> Email:<input style="margin-left: 47px;" type="email" value="<%=rs.getString(3)%>"  name="email2">
 <br> Sex:<input style="margin-left: 68px;"  type="text" value="<%=rs.getString(4)%>" name="sex2">
 <br> Course:<input  type="text" style="margin-left: 38px;"value="<%=rs.getString(5)%>" name="course2">
  <br> Fee:<input  type="text" style="margin-left: 71px;"value="<%=rs.getString(6)%>" name="fee2">
   <br> Paid:<input  type="text" style="margin-left: 61px;" value="<%=rs.getString(7)%>" name="paid2">
 <br> Address:<input style="margin-left: 34px;" type="text" value="<%=rs.getString(8)%>" name="add2">
 <br> Contact:<input style="margin-left: 36px;" type="text" value="<%=rs.getString(9)%>" name="con2">
 <br><input style="margin-top:3%;" type="submit" value="Update"> <br>
  </form>
     
                   <%} }

              catch(Exception e){ 
RequestDispatcher rd=request.getRequestDispatcher("supdAct.jsp");
      out.println("<div style= position:absolute;margin-top:21%;margin-left:37%;color:red;font-weight:700; font-size:1.4em; >!!! please enter valid ID</div>");
  rd.include(request, response);
              System.out.print(e.getMessage());
              } %>
                 
             <%@include file="footer.jsp" %>