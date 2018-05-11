package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.ResultSet;
import com.mysql.jdbc.ResultSetRow;
import pack.MyCon;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class updAct2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/aheader.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"b1\"><head><link rel=\"stylesheet\" type=\"text/css\" href=\"newcss2.css\"></head>\n");
      out.write("<body><div class=\"head\">\n");
      out.write("   \n");
      out.write(" <Strong>   Fee Report</Strong>\n");
      out.write("    <a  class=\"limg\"  href=\"admin.jsp\">Home</a>\n");
      out.write("         <a  class=\"limg\"  href=\"addact.jsp\">Add Account</a>\n");
      out.write("   <a  class=\"limg\"  href=\"showAct.jsp\">View Account</a>\n");
      out.write("    <a  class=\"limg\"  href=\"logout\">Logout</a>\n");
      out.write("    </div></body>  </div>  \n");
      out.write("    \n");
      out.write("  \n");
      out.write("\n");
      out.write("<head><link rel=\"stylesheet\" type=\"text/css\" href=\"css.css\"></head>\n");
      out.write("\n");
HttpSession hs=null;
hs=request.getSession(false);
            if(hs==null)
            {
                response.sendRedirect("Home.jsp");
            }
          
      out.write(' ');
      out.write(' ');

                       try{ Connection con= MyCon.getCon();
                  PreparedStatement pst =con.prepareStatement("select * from accountant where id=?");
                  pst.setInt(1, Integer.parseInt(request.getParameter("id")));
                  ResultSet rs =pst.executeQuery();
                
  
        if(rs.next()){
                  
                    while(rs.next()){
            
      out.write("\n");
      out.write("            <h2 style=\"margin-left:25%;text-decoration: underline; \">Update Here</h2>\n");
      out.write("            <form action=\"updAct2\" method=\"post\">\n");
      out.write("                \n");
      out.write("                <br> Id:<input style=\"margin-left: 73px;\" type=\"text\" value=\"");
      out.print(rs.getInt(1));
      out.write("\" name=\"id2\"   >\n");
      out.write(" <br> Name:<input style=\"margin-left: 45px;\" type=\"text\" value=\"");
      out.print(rs.getString(2));
      out.write("\"  name=\"name2\">\n");
      out.write(" <br> Email:<input style=\"margin-left: 44px;\" type=\"email\" value=\"");
      out.print(rs.getString(3));
      out.write("\"  name=\"email2\">\n");
      out.write(" <br> Password:<input  type=\"text\" value=\"");
      out.print(rs.getString(4));
      out.write("\" name=\"pass2\">\n");
      out.write(" <br> Address:<input style=\"margin-left: 27px;\" type=\"text\" value=\"");
      out.print(rs.getString(5));
      out.write("\" name=\"add2\">\n");
      out.write(" <br> Contact:<input style=\"margin-left: 30px;\" type=\"text\" value=\"");
      out.print(rs.getString(6));
      out.write("\" name=\"con2\">\n");
      out.write(" <br><input style=\"margin-top:3%;\" type=\"submit\" value=\"Update\"> <br>\n");
      out.write("  </form>\n");
      out.write("     \n");
      out.write("                   ");
} }

else{RequestDispatcher rd=request.getRequestDispatcher("updAct.jsp");
      out.println("<div  >!!! please enter valid ID</div>");
  rd.include(request, response);}
}

              catch(Exception e){ 
RequestDispatcher rd=request.getRequestDispatcher("updAct.jsp");
      out.println("<div style= position:absolute;margin-top:21%;margin-left:37%;color:red;font-weight:700; font-size:1.4em; >!!! please enter valid ID</div>");
  rd.include(request, response);
              System.out.print(e.getMessage());
              } 
      out.write("\n");
      out.write("                 \n");
      out.write("             ");
      out.write("<head><link rel=\"stylesheet\" type=\"text/css\" href=\"css1.css\">\n");
      out.write("</head>\n");
      out.write("<div id=\"foot\" >\n");
      out.write("    \n");
      out.write("    <center> <br>      <img src=\"logo.jpg\" height=\"110px \" width=\"155px\"><br>\n");
      out.write("                   <pre>DIT University\n");
      out.write("Mussourie-Diversion Road,\n");
      out.write("Dehradun, Uttarakhand-248009, India\n");
      out.write("0135-3000300</center></pre>\n");
      out.write("   <div id=\"box1\"> <address>\n");
      out.write("     <center>    \n");
      out.write("       <br><br>   <div class=\"img\">   <a href=\"https://www.youtube.com\"><img src=\"y.jpg\" height=\"25px\" width=\"25px\"></a>\n");
      out.write("             &nbsp;<a href=\"https://www.twitter.com\"><img src=\"t.jpg\" height=\"25px\"width=\"25px\"></a>\n");
      out.write("             &nbsp;<a href=\"https://www.facebook.com\"><img src=\"f.jpg   \"height=\"25px\" width=\"25px\"></a>\n");
      out.write("            &nbsp;   <a href=\"https://www.googleplus.com\"><img src=\"g.jpg\" height=\"25px\" width=\"25px\"></a>\n");
      out.write(" \n");
      out.write("         </div><br>\n");
      out.write("  For more details, contact<br>\n");
      out.write("  <a  href=\"mailto:riyaz489.rk@gmail.com\">Riyazuddin Khan</a>.\n");
      out.write("     </center></address>\n");
      out.write("        <center><p><small>© copyright 2018 FeeManagement riyaz Corp.</small></p></center>\n");
      out.write("   </div> </div>\n");
      out.write("    \n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
