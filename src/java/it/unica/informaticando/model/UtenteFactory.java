package it.unica.informaticando.model;

import it.unica.informaticando.db.DatabaseManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UtenteFactory{
    private static UtenteFactory instance;
    
    private UtenteFactory(){}
    
    public static UtenteFactory getInstance(){
        if(instance==null)
            instance= new UtenteFactory();  
        return instance;
    }
    
    public Utente getUtenteByUserPass (String username, String password){
        Connection conn= null;
        PreparedStatement stmt=null;
        ResultSet set = null;
        
        try{
            conn = DatabaseManager.getInstance().getDbConnection();
            
            String query = "SELECT * FROM utente WHERE username = ? AND password = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            
            set = stmt.executeQuery();
            
            if(set.next()){
                Utente utente = new Utente();
                utente.setUsername(set.getString("username"));
                utente.setPassword(set.getString("password"));
                utente.setName(set.getString("nome"));
                utente.setCognome("cognome");
                utente.setEmail("email");
                utente.setCitta("citta");
                return utente;
            }
            else{
                return null;
            }
        }catch(SQLException e){
            Logger.getLogger(UtenteFactory.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            
            try{set.close();}catch(Exception e){}
            try{stmt.close();}catch(Exception e){}
            try{conn.close();}catch(Exception e){}
        }
        return null;
    }
    
    /*Metodo che inserisce un utente registrato nel database*/
    public void setUtenteFromRegistration(String username, String password, 
            String citta, String email, String nome, String cognome){
        
        Connection conn= null;
        PreparedStatement stmt=null;
        ResultSet set = null;
        
        try{
            conn = DatabaseManager.getInstance().getDbConnection();
            
            String query = "INSERT INTO utente "
                    + "(username, password, nome, cognome, email, citta) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, nome);
            stmt.setString(4, cognome);
            stmt.setString(5, email);
            stmt.setString(6, citta);
            
            set = stmt.executeQuery();
            
        }catch(SQLException e){
            Logger.getLogger(UtenteFactory.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            
            try{set.close();}catch(Exception e){}
            try{stmt.close();}catch(Exception e){}
            try{conn.close();}catch(Exception e){}
        }
    }
}
