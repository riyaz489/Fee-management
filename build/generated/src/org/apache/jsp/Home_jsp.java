package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header1.jsp", out, false);
      out.write("\n");
      out.write("<div id=\"body1\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Fee Management</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"home.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"block1\">\n");
      out.write("           <form action=\"lauth\" method=\"post\"> <h2>Admin Login Form</h2>\n");
      out.write("               <input type=\"email\" name=\"an\" size=\"30\" ><br>\n");
      out.write("            <input type=\"password\" name=\"ap\" size=\"30\"><br>\n");
      out.write("            <input type=\"submit\" value=\"Login\"><br><br>\n");
      out.write("           </form>\n");
      out.write("    </div>\n");
      out.write("        <div id=\"block2\">\n");
      out.write("            <form action=\"lauth2\" method=\"post\"> <h2> Accountant Login Form</h2>\n");
      out.write("            <input type=\"email\" name=\"acn\" size=\"30\"><br>\n");
      out.write("            <input type=\"password\" name=\"acp\" size=\"30\"><br>\n");
      out.write("            <input type=\"submit\" value=\"Login\"><br><br>\n");
      out.write("           </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html></div><br><br><br>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    ");
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
