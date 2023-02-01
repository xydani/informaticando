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
import it.unica.informaticando.model.ProdottoFactory;
import it.unica.informaticando.utils.Utils;
import javax.servlet.http.HttpSession;


@WebServlet(name = "InserimentoProdottoServlet", urlPatterns = {"/InserimentoProdottoServlet"})
public class InserimentoProdottoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nome = request.getParameter("nomeProdotto");
        String descrizione = request.getParameter("descrizioneProdotto");
        String prezzo = request.getParameter("prezzoProdotto");
        
        
        String foto = "placeholder.jpg";
        
        HttpSession session = request.getSession(false);
        String creatore = (String)session.getAttribute("user");
        
        try{
            
            int minSize = 4;
            int maxSize = 50;
            Utils.checkString("Nome", nome, minSize, maxSize);
            Utils.checkString("Descrizione", descrizione, 5, 325);
            Utils.checkIntegerNoMax("Prezzo", prezzo, 100);
            
            ProdottoFactory.getInstance().setProductFromForm(nome, descrizione,
                    prezzo, foto, creatore);
            
            request.getRequestDispatcher("prodottoInserito.jsp").forward(request, response);
            
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
