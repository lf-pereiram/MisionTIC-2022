/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.mi1erproyjava;

import javax.swing.JOptionPane;

/**
 *
 * @author luisa
 */
public class EstructControl01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        
        final double MIN_RADIO = 0.0;
        final double MAX_RADIO = 100.0;
        final double DOS_PI = 2 * Math.PI;
        
        
        double radio = getDouble();
        double circunf;
        
        while (radio > MIN_RADIO ) {
            if(radio <= MAX_RADIO){
                circunf = DOS_PI * radio;
                System.out.println("\n\n\tUn circulo de radio "+ radio + " tiene una circunf. de "+ circunf);
            }
            else 
                System.out.println("\n\t*** El valor del radio debe estar entre (0, 100]");
            
            radio = getDouble();
        }
        System.out.println("Adios!...Gusto de servirle");
        
        
        
//        if(ValidaDatos.validarNumero(dato)){
//            radio = Double.parseDouble(dato);
//            
//            while (radio > MIN_RADIO ) {
//                if(radio <= MAX_RADIO){
//                    circunf = DOS_PI * radio;
//                    System.out.println("\n\n\tUn circulo de radio "+ radio + " tiene una circunf. de "+ circunf);
//                }
//                else {
//                    System.out.println("\n\t*** El valor del radio debe estar entre (0, 100]");
//                }
//                
//                dato = JOptionPane.showInputDialog(null, PROMPT);
//                radio = Double.parseDouble(dato);   
//            }
//            System.out.println("Adios! \n\t*** El valor del radio debe estar entre (0, 100]");
//        }
//        else
//            System.out.println("Valor debe ser numérico");
    }
    
    public static double getDouble() throws Exception{
        final String PROMPT = "Ingrese un valor entre (0, 100] para el radio ";
        String dato = "";
        try {
             dato = JOptionPane.showInputDialog(null, PROMPT);
             return Double.parseDouble(dato);
        } catch (Exception e) {
            if(!ValidaDatos.validarNumero(dato))
                System.out.println("\n\t*** El dato ingresado ("+dato+") contiene caracteres no númericos ***");
            
            return -1;
        }
    }
}
