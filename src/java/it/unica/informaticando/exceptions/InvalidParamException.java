 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unica.informaticando.exceptions;

/**
 *
 * @author danny
 */
public class InvalidParamException extends Exception {
    
    public InvalidParamException(String errorMessage){
        
        super(errorMessage);
    }
}
