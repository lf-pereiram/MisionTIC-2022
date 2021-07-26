/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package co.edu.upb.proyecto_banco;

/**
 *
 * @author luisa pereira
 */
public class Banco {
    
    public static double liquidarPrestaciones(int salario, int comision, int auxilioTransporte){
        int total;
        double prima, cesantias, interesCesantias, vacaciones, liquidacion;
        
        //Calculo total devengado
        total = salario + comision + auxilioTransporte;
        
        //Calculo de Prima (total devengado x 8.33%)
        prima = total * 0.0833;
        //Calculo Cesantias (total devengado x 8.33%)
        cesantias = total * 0.0833;
        //Calculo interes sobre las cesantias (cesantias x 12%)
        interesCesantias = cesantias * 0.12;
        //Calculo vacaciones (salario x 4.16%)
        vacaciones = salario * 0.0416;
        
        
         //Calculo de la liquidacion equivale a la suma de los valores previamente calculados
         liquidacion = prima+cesantias+interesCesantias+vacaciones;
                
        return liquidacion;
    }
    
    
    
    
}
