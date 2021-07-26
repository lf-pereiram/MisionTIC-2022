/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.upb.proyecto_banco;

import javax.swing.JOptionPane;

/**
 *
 * @author luisa
 */
public class Banco_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String salario, comision, auxilioTransporte;
        double liquidacion=0;
        
        salario = JOptionPane.showInputDialog(null, "Ingresa tú salario: ");
        if(validarNumero(salario) && Integer.parseInt(salario)>0){
            comision = JOptionPane.showInputDialog(null, "Ingresa tú comisión: ");
            if(validarNumero(comision) && Integer.parseInt(comision)>=0){
                auxilioTransporte = JOptionPane.showInputDialog(null, 
                        "Ingresa el auxilio de transporte que recibes: ");
                if(validarNumero(auxilioTransporte) && Integer.parseInt(auxilioTransporte)>=0){
                    liquidacion = Banco.liquidarPrestaciones(Integer.parseInt(salario), 
                            Integer.parseInt(comision), Integer.parseInt(auxilioTransporte));
                    JOptionPane.showMessageDialog(null, "Su liquidación es: "+liquidacion);
                }
            }
        }
    }
    
    public static boolean validarNumero(String dato){
        char unCaract = dato.charAt(0);
        if(!Character.isDigit(unCaract) || unCaract == '.'){
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
