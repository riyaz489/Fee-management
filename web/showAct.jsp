<%-- 
    Document   : showAct
    Created on : Jul 17, 2017, 12:28:25 PM
    Author     : Riyazuddin khan
--%>


<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="pack.MyCon"%>
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
  <h1> Accountant Details</h1>  

<center><table border="1" style="height:30%;width:70%;background-color: #333333;color:white;">
    <thead>
        <tr>
            <th>USER ID</th>
            <th>NAME</th>
            <th>EMAIL ADDRESS</th>
            <th>PASSWORD</th>
            <th>ADDRESS</th>
            <th>CONTACT</th>
             <th>DELETE</th>
             

</tr>
    </thead><tbody>
    <%  try{
        Connection con= MyCon.getCon();
        PreparedStatement pst=con.prepareStatement("select * from accountant");
        ResultSet rs=pst.executeQuery();
        while(rs.next()){ %>
    <form action="delAct" method="post">
        <tr>
            <td><%=rs.getInt(1)%></td>
            <td><%=rs.getString(2)%></td>
            <td><%=rs.getString(3)%></td>
            <td><%=rs.getString(4)%></td>
            <td><%=rs.getString(5)%></td>
            <td><%=rs.getString(6)%></td>
            <td><input type="hidden" value="<%=rs.getInt(1)%>" name="id"><input style="margin:0px; width:100%;padding:0px;border-radius: 0em; color:red;" type="SUBMIT" value="DELETE"></td>
        </tr>
        </form>
   <%     }
    }
    catch(Exception e)
    {
    }
    %>
    
    
    </tbody>
</table>
  
    </center>
  
  
  
</body><div style="margin-top: 20%;"><%@include file="footer.jsp" %>