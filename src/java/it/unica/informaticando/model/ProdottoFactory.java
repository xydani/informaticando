package it.unica.informaticando.model;

import it.unica.informaticando.db.DatabaseManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;

public class ProdottoFactory{
    private static ProdottoFactory instance;
    
    private ProdottoFactory(){}
    
    public static ProdottoFactory getInstance(){
        if(instance==null)
            instance= new ProdottoFactory();  
        return instance;
    }

    public List<Prodotto> getAllProdotti(){
        Connection conn= null;
        PreparedStatement stmt=null;
        ResultSet set = null;
        List<Prodotto> prodotti = new ArrayList<>();
        
        try{
            conn = DatabaseManager.getInstance().getDbConnection();
            
            String query = "SELECT * FROM prodotto";
            stmt = conn.prepareStatement(query);
            set = stmt.executeQuery();
            
            while(set.next()){
                Prodotto prodotto = new Prodotto();
                prodotto.setId(set.getInt("id"));
                prodotto.setNome(set.getString("nome"));
                prodotto.setDescrizione(set.getString("descrizione"));
                prodotto.setPrezzo(set.getInt("prezzo"));
                prodotto.setFoto(set.getString("foto"));
                prodotto.setCreatore(set.getString("creatore"));
                prodotti.add(prodotto);
            }
            return prodotti;
        }catch(SQLException e){
            Logger.getLogger(UtenteFactory.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            
            try{set.close();}catch(Exception e){}
            try{stmt.close();}catch(Exception e){}
            try{conn.close();}catch(Exception e){}
        }
        return null;
    }
    
    /*Metodo che inserisce un nuovo prodotto nel database*/
    public void setProductFromForm(String nome, String descrizione, String prezzo,
            String foto, String creatore){
        
        Connection conn= null;
        PreparedStatement stmt=null;
        ResultSet set = null;
        
        try{
            conn = DatabaseManager.getInstance().getDbConnection();
            
            String query = "INSERT INTO prodotto "
                    + "(nome, descrizione, prezzo, foto, creatore) "
                    + "VALUES "
                    + "(?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, nome);
            stmt.setString(2, descrizione);
            stmt.setString(3, prezzo);
            stmt.setString(4, foto);
            stmt.setString(5, creatore);
            
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
