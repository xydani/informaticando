package it.unica.informaticando.model;

import java.util.Objects;

public class Utente {
    private String username;
    private String password;
    private String nome;
    private String cognome;
    private String email;
    private String citta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }
    
    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }
    
    public String getName(){
        return nome;
    }

    public void setName(String name){
        this.nome = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.username);
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
        final Utente other = (Utente) obj;
        return Objects.equals(this.username, other.username);
    }
    
    
}