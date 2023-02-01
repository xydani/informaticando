/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package it.unica.informaticando.servlet;

import it.unica.informaticando.model.UtenteFactory;
import it.unica.informaticando.model.Utente;
import it.unica.informaticando.exceptions.InvalidParamException;
import it.unica.informaticando.utils.Utils;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author danny
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session=request.getSession(); //Crea una nuova sessione o recuperare quella esistente
        String user=request.getParameter("userLog"); //Recupera i dati passati da login.jsp
        String pass=request.getParameter("passLog");
        
        try{
            Utils.checkString("User", user, 4, 50);     //Controlla che User e Password siano di lunghezze accettabili
            Utils.checkString("Password", pass, 4, 50);
            
            Utente utente = UtenteFactory.getInstance().getUtenteByUserPass(user, pass);
            
            if(utente != null){  //Verifica se le credenziali sono corrette
                session.setAttribute("user", user); //Salva gli attributi della sessione
                session.setAttribute("lastLogin", Utils.convertTime(session.getLastAccessedTime())); 
                session.setMaxInactiveInterval(300); //Imposta in secondi il tempo massimo di inattività prima che la sessione scada 
                response.sendRedirect("user");  //Redirect alla servlet AreaPersonale
            }
            else{
                throw new InvalidParamException("Username o password non validi!");
            }
            
        }catch(InvalidParamException e){
            session.invalidate();   //Invalida la sessione attuale
            request.setAttribute("errorMessage", e.getMessage());
            request.setAttribute("link", "login.jsp");
            request.getRequestDispatcher("error.jsp").forward(request, response);   //Redirect alla pagina error.jsp mantenedo i valori inviati
        }
    }
        
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
