/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package it.unica.informaticando.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import it.unica.informaticando.exceptions.InvalidParamException;
import it.unica.informaticando.utils.Utils;
import it.unica.informaticando.model.UtenteFactory;

/**
 *
 * @author fpw
 */
@WebServlet(name = "RegistrazioneServlet", urlPatterns = {"/RegistrazioneServlet"})
public class RegistrazioneServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nomeReg = request.getParameter("nomeReg");
        String cognomeReg = request.getParameter("cognomeReg");
        String userReg = request.getParameter("userReg");
        String passReg = request.getParameter("passReg");
        String emailReg = request.getParameter("emailReg");
        String cittaReg = request.getParameter("cittaReg");
        
        try{
            
            int minSize = 4;
            int maxSize = 50;
            Utils.checkString("Nome", nomeReg, minSize, maxSize);
            Utils.checkString("Cognome", cognomeReg, minSize, maxSize);
            Utils.checkString("Username", userReg, minSize, maxSize);
            Utils.checkString("Password", passReg, minSize, maxSize);
            Utils.checkString("E-mail", emailReg, minSize, maxSize);
            Utils.checkString("Città", cittaReg, minSize, maxSize);
            
            
            UtenteFactory.getInstance().setUtenteFromRegistration(userReg, passReg, 
                    cittaReg, emailReg, nomeReg, cognomeReg);
            
            request.getRequestDispatcher("registrazioneEseguita.jsp").forward(request, response);
            
        } catch(InvalidParamException e){
            request.setAttribute("errorMessage", e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
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
