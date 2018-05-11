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
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Riyazuddin khan
 */
@WebServlet(name = "lauth2", urlPatterns = {"/lauth2"})
public class lauth2 extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                 Connection con=MyCon.getCon();
        PreparedStatement pst=con.prepareStatement("select * from accountant where email=? and password=?");
        pst.setString(1, request.getParameter("acn"));
        pst.setString(2,request.getParameter("acp"));
        ResultSet rs=null;
     rs=pst.executeQuery();
        if(rs.next()){
        HttpSession hs=request.getSession();
        hs.setAttribute("acn",request.getParameter("acn"));
        hs.setAttribute("acp",request.getParameter("acp"));
        
        RequestDispatcher rd=request.getRequestDispatcher("acnt.jsp");
                               rd.forward(request,response);
        }
        
           else
            {
                RequestDispatcher rd=request.getRequestDispatcher("Home.jsp");
                out.println("<font color=red>LOGIN FAILED.....!!!!</font>");
                rd.include(request, response);
            }
        }
        catch(Exception e){
        System.out.println("kuch to gadbad hai"+e.getMessage());}
        
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
