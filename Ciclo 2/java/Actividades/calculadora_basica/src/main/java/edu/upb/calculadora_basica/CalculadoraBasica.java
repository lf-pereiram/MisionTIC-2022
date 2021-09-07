/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.calculadora_basica;

import javax.swing.JOptionPane;

/**
 *
 * @author luisa
 */
public class CalculadoraBasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1, num2;
        double resp;
        String msj;
        
        String mensaje = "Ingrese una opción: \n\r1. Suma (+) \n\r2. Resta (-) \n\r3. Multiplicación (*) \n\r4. División (/) \n\r5. Residuo (%) \n\r6. Salir";
        String opcion = JOptionPane.showInputDialog(null, mensaje);
        
        int opt = Integer.parseInt(opcion);
        
        
        switch (opt) {
            case 1:
                num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Numero 1:"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Numero 2:"));

                resp = num1 + num2;
                msj = ""+num1+"+"+num2+"="+resp;
                JOptionPane.showMessageDialog(null, msj);
                System.out.println("El resultado es: "+(num1+num2));
                break;
            case 2: 
                num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Numero 1:"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Numero 2:"));

                resp = num1 - num2;
                msj = ""+num1+"-"+num2+"="+resp;
                JOptionPane.showMessageDialog(null, msj);
                break;
            case 3: 
                num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Numero 1:"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Numero 2:"));

                resp = num1 * num2;
                msj = ""+num1+"*"+num2+"="+resp;
                JOptionPane.showMessageDialog(null, msj);
                break;

            case 4: 
                num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Numero 1:"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Numero 2:"));

                resp = num1 / num2;
                msj = ""+num1+"/"+num2+"="+resp;
                JOptionPane.showMessageDialog(null, msj);
                break;

            case 5: 
                num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Numero 1:"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Numero 2:"));

                resp = num1 % num2;
                msj = ""+num1+"%"+num2+"="+resp;
                JOptionPane.showMessageDialog(null, msj);
                break;

            case 6: 
                JOptionPane.showMessageDialog(null, "Adios!");
                break;

            default: 
                JOptionPane.showMessageDialog(null, "Ingresé una opción valida dentro del menú");
        }
    }
}
