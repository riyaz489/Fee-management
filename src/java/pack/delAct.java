
package pack;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "delAct", urlPatterns = {"/delAct"})
public class delAct extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Connection con=MyCon.getCon();
            PreparedStatement pst =con.prepareStatement("delete from accountant where id = ?");
            String id=request.getParameter("id");
                 pst.setString(1, id);
            int i=pst.executeUpdate();
            RequestDispatcher rd=request.getRequestDispatcher("/showAct.jsp");
            if(i>0){       
  out.println("<div style=position:absolute;margin-top:12%;margin-left:73%;color:green;font-weight:700; font-size:1.4em; >Data deleted....</div>");
  rd.include(request, response);
            }
            else{
             out.println("<div  style=position:absolute;margin-top:12%;margin-left:73%;color:red;font-weight:700; font-size:1.4em;>!!! Data not deleted</div>");
              rd.include(request, response);
        }
        }
        catch(Exception e){
       System.out.println("<div  style=position:absolute;margin-top:12%;margin-left:73%;color:red;font-weight:700; font-size:1.4em;>!!! Data not deleted</div>");
        RequestDispatcher rd=request.getRequestDispatcher("/showAct.jsp");
  rd.include(request, response);
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
