package it.unica.informaticando.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Prodotto {
    private String nome;
    private String descrizione;
    private int prezzo;
    private int id;
    private String foto;
    private String creatore;

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
    private LocalDateTime data;
    
    public String getCreatore(){
        return creatore;
    }

    public void setCreatore(String creatore){
        this.creatore = creatore;
    }
    
    public String getFoto(){
        return foto;
    }

    public void setFoto(String foto){
        this.foto = foto;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    
    public String getDescrizione(){
        return descrizione;
    }

    public void setDescrizione(String descrizione){
        this.descrizione=descrizione;
    }
    
    public int getPrezzo(){
        return prezzo;
    }

    public void setPrezzo(int Prezzo){
        this.prezzo = Prezzo;
    }
    
    public int getId(){
        return id;
    }

    public void setId(int Id){
        this.id = Id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prodotto other = (Prodotto) obj;
        return Objects.equals(this.nome, other.nome);
    }
    
    
}