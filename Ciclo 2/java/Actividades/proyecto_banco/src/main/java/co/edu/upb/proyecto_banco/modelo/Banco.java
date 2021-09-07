package co.edu.upb.proyecto_banco.modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author luisa pereira
 */
public class Banco {

    private ArrayList<Empleado> empleados;

    public static double liquidarPrestacionesEmp(Empleado empleado) {

        //Obtenemos el salario del empleado para realizar los pertinentes calculos
        int salario = empleado.getSalario();

        //Calculo de Prima (total devengado x 8.33%)
        double prima = salario * 0.0833;
        //Calculo Cesantias (total devengado x 8.33%)
        double cesantias = salario * 0.0833;
        //Calculo interes sobre las cesantias (cesantias x 12%)
        double interesCes = cesantias * 0.12;
        //Calculo vacaciones (salario x 4.16%)
        double vacaciones = salario * 0.0416;

        //Calculo de la liquidacion equivale a la suma de los valores previamente calculados
        double liquidacion = prima + cesantias + interesCes + vacaciones;

        return liquidacion;
    }

    public static double liquidarSegSocialEmp(Empleado empleado) {
        //Obtenemos el salario del empleado para realizar los pertinentes calculos
        int salario = empleado.getSalario();

        //Calculo concepto de salud
        double salud = salario * 0.085;
        //Calculo concepto de la pension
        double pension = salario * 0.12;
        //Calculo concepto de ARL
        double arl = salario * 0.0052;

        //Calculo de la liquidacion equivale a la suma de los valores previamente calculados
        double liquidacionSegSocial = salud + pension + arl;

        return liquidacionSegSocial;
    }

    public static double liquidarNominaEmp(Empleado empleado) {
        int salario = empleado.getSalario();

        //Calculo concepto de descuento de salud
        double salud = salario * 0.04;
        //Calculo concepto de descuento de pension
        double pension = salario * 0.04;

        //Calculo de nomina
        double nomina = salario - salud - pension;
        return nomina;
    }

    public static double liquidarParafiscalesEmp(Empleado empleado) {
        int salario = empleado.getSalario();

        //Calculo concepto de descuento de compensacion familiar
        double compFami = salario * 0.04;
        //Calculo concepto de descuento de ICBF
        double icbf = salario * 0.03;
        //Calculo concepto de descuento de sena
        double sena = salario * 0.02;

        //Calculo de nomina
        double parafiscal = compFami + icbf + sena;
        return parafiscal;
    }

    public static double costoEmpleadoParaLaEmpresa(Empleado empleado) {
        int salario = empleado.getSalario();
        
        double total = liquidarNominaEmp(empleado)+liquidarSegSocialEmp(empleado)+liquidarParafiscalesEmp(empleado)+liquidarPrestacionesEmp(empleado);
        return total;
    }

    //Metodos getter y setter
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

}
