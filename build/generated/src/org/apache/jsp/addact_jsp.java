package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addact_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write("<div id=\"b1\"><head><link rel=\"stylesheet\" type=\"text/css\" href=\"newcss2.css\"></head>\n");
      out.write("<body><div class=\"head\">\n");
      out.write("   \n");
      out.write(" <Strong>   Fee Report</Strong>\n");
      out.write("    <a  class=\"limg\"  href=\"Home.jsp\">Home</a>\n");
      out.write("         <a  class=\"limg\"  href=\"add.jsp\">Add Account</a>\n");
      out.write("   <a  class=\"limg\"  href=\"view.jsp\">View Account</a>\n");
      out.write("    <a  class=\"limg\"  href=\"logout.jsp\">Logout</a>\n");
      out.write("    </div></body>  </div>  \n");
      out.write("    \n");
      out.write("  \n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <title>Admin Panel</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  <h1>Add Accountant</h1>  \n");
      out.write("<form action=\"actadd\" method=\"post\">\n");
      out.write("    <br> Id:<input style=\"margin-left: 73px;\" type=\"text\" placeholder=\"enter your id\" name=\"id\" >\n");
      out.write(" <br> Name:<input style=\"margin-left: 45px;\" type=\"text\" placeholder=\"enter your name\" name=\"name\">\n");
      out.write(" <br> Email:<input style=\"margin-left: 44px;\" type=\"email\" placeholder=\"enter your email\" name=\"email\">\n");
      out.write(" <br> Password:<input  type=\"password\" placeholder=\"enter your password\" name=\"pass\">\n");
      out.write(" <br> Address:<input style=\"margin-left: 27px;\" type=\"text\" placeholder=\"enter your city\" name=\"add\">\n");
      out.write(" <br> Contact:<input style=\"margin-left: 30px;\" type=\"text\" placeholder=\"enter your contact\" name=\"con\">\n");
      out.write(" <br><input type=\"submit\" value=\"submit\"> <br>\n");
      out.write("  </form>\n");
      out.write("</body><div style=\"margin-top: 20%;\">");
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
