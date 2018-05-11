
package pack;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Riyazuddin khan
 */
@WebServlet(name = "updAct2", urlPatterns = {"/updAct2"})
public class updAct2 extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
          Connection con=MyCon.getCon();
            PreparedStatement pst = con.prepareStatement("update accountant set name=?,email=?,password=?,address=?,contact=? where id=?");
             int id=Integer.parseInt(request.getParameter("id2"));
             pst.setInt(6, id);
                pst.setString(1, request.getParameter("name2"));
                 pst.setString(2, request.getParameter("email2"));
                  pst.setString(3, request.getParameter("pass2"));
                   pst.setString(4, request.getParameter("add2"));
                    pst.setString(5, request.getParameter("con2"));
                     
                     
                     int i=pst.executeUpdate();
        
  if(i>0){
         RequestDispatcher rd=request.getRequestDispatcher("updAct.jsp");
  out.println("<div  style= position:absolute;margin-top:21%;margin-left:37%;color:green;font-weight:700; font-size:1.4em; >Data updated....</div>");
  rd.include(request, response);
  }
  else {  RequestDispatcher rd=request.getRequestDispatcher("updAct.jsp");
      out.println("<div style= position:absolute;margin-top:21%;margin-left:37%;color:red;font-weight:700; font-size:1.4em; >!!! Data not updated</div>");
  rd.include(request, response);
  }
        }
        catch(Exception e){ RequestDispatcher rd=request.getRequestDispatcher("updAct.jsp");
               out.println("<div style=position:absolute;margin-top:21%;margin-left:37%;color:red;font-weight:700; font-size:1.4em;>!!! Data not updated</div>");
                rd.include(request, response);
                System.out.println(e.getMessage());
           
                }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
