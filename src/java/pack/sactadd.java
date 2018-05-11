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
@WebServlet(name = "sactadd", urlPatterns = {"/sactadd"})
public class sactadd extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
          try{ Connection con=MyCon.getCon();
  PreparedStatement pst= con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?)");
  int id=Integer.parseInt(request.getParameter("rollno"));
  String name=request.getParameter("name");
  String email=request.getParameter("email");
  String sex=request.getParameter("sex");
  String course=request.getParameter("course");
  double fee=Double.parseDouble(request.getParameter("fee"));
  double paid=Double.parseDouble(request.getParameter("paid"));
  String add=request.getParameter("add");
  String contact=request.getParameter("contact");
  
  
  pst.setInt(1, id);
  pst.setString(2,name);
  pst.setString(3,email);
  pst.setString(4,sex);
  pst.setString(5, course);
  pst.setDouble(6, fee);
  pst.setDouble(7, paid);
  pst.setString(8, add);
  pst.setString(9, contact);
  int i=pst.executeUpdate();
          RequestDispatcher rd=request.getRequestDispatcher("saddact.jsp");
  if(i>0){
      
  out.println("<div id=res >Data inserted....</div>");
  rd.include(request, response);
  }
  else {  out.println("<div id=res2 >!!! Data not inserted</div>");
  rd.forward(request, response);
  }}
  catch(Exception e){    RequestDispatcher rd=request.getRequestDispatcher("saddact.jsp");
    out.println("<div id=res2>!!! Data not inserted</div>");
  rd.include(request, response);
  System.out.println("some exception is come in adding record :"+e.getMessage());
  }
  
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
