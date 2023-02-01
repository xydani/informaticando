/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unica.informaticando.utils;

import it.unica.informaticando.exceptions.InvalidParamException;
import java.time.*;

/**
 *
 * @author danny
 */
public class Utils {
    
    public static void checkNull(String name, String param) throws InvalidParamException{
        
        if(param == null){
            throw new InvalidParamException("Valore del campo " + name + " mancante");
        }
    }
    
    public static void checkString(String name, String param, int min, int max) throws InvalidParamException{
        
        checkNull(name, param);
        if(param.length() < min || param.length() > max){
            
            throw new InvalidParamException("Il valore del campo " + name +
                    " non rispetta la dimensione richiesta tra " + min + " e " +
                    max +  " caratteri.");
        }
    }
    
    public static void checkInteger(String name, String param, int min, int max) throws InvalidParamException{
        
        checkNull(name, param);
        try{
            int valore= Integer.valueOf(param);
            
            if(valore<min||valore>max)
                throw new InvalidParamException("Il campo "+ name + " deve avere un valore composto tra "+min+" e "+max);
            
        }catch(NumberFormatException e){
            throw new InvalidParamException("Il campo "+ name + " deve contenere un numero intero");
        }
    }
    
    public static void checkIntegerNoMax(String name, String param, int min) throws InvalidParamException{
        
        checkNull(name, param);
        try{
            int valore= Integer.valueOf(param);
            
            if(valore<min)
                throw new InvalidParamException("Il campo "+ name + " deve avere un valore di almeno "+min);
            
        }catch(NumberFormatException e){
            throw new InvalidParamException("Il campo "+ name + " deve contenere un numero intero");
        }
    }
    
    public static String convertTime(long time){
        LocalDateTime localDt=LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneOffset.UTC);
        return localDt.toString();
    }
}
