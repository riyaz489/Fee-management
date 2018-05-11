/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@WebServlet(name = "supdAct2", urlPatterns = {"/supdAct2"})
public class supdAct2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
          PrintWriter out = response.getWriter();
        try  {
          Connection con=MyCon.getCon();
            PreparedStatement pst = con.prepareStatement("update student set name=?,email=?,sex=?,course=?,fee=?,paid=?,address=?,contact=? where rollno=?");
             int id=Integer.parseInt(request.getParameter("id2"));
             pst.setInt(9, id);
                pst.setString(1, request.getParameter("name2"));
                 pst.setString(2, request.getParameter("email2"));
                  pst.setString(3, request.getParameter("sex2"));
                  pst.setString(4, request.getParameter("course2"));
                  pst.setDouble(5, Double.parseDouble(request.getParameter("fee2")));
                  pst.setDouble(6, Double.parseDouble(request.getParameter("paid2")));
                   pst.setString(7, request.getParameter("add2"));
                    pst.setString(8, request.getParameter("con2"));
                     
                     
                     int i=pst.executeUpdate();
        
  if(i>0){
         RequestDispatcher rd=request.getRequestDispatcher("supdAct.jsp");
  out.println("<div  style= position:absolute;margin-top:21%;margin-left:37%;color:white;font-weight:700; font-size:1.4em; >Data updated....</div>");
  rd.include(request, response);
  }
  else {  RequestDispatcher rd=request.getRequestDispatcher("supdAct.jsp");
      out.println("<div style= position:absolute;margin-top:21%;margin-left:37%;color:red;font-weight:700; font-size:1.4em; >!!! Data not updated</div>");
  rd.include(request, response);
  }
        }
        catch(Exception e){ RequestDispatcher rd=request.getRequestDispatcher("supdAct.jsp");
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
