/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.mi1erproyjava;

/**
 *
 * @author luisa
 */
public class ValidaDatos {
    
    public static boolean validarNumero(String dato){
        char unCaract = dato.charAt(0);
        if(!Character.isDigit(unCaract) || unCaract != '+' || unCaract != '-'){
            return false;
        }
        
        for (int i = 1; i < dato.length(); i++) {
            unCaract = dato.charAt(i);
            if(!Character.isDigit(unCaract)){
                return false;
            }
        }
        
        return true;
    }
    
}
