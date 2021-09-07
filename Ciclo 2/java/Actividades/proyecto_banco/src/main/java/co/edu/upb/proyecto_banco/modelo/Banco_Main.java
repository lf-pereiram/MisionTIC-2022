/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.upb.proyecto_banco.modelo;

import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);

        System.out.println("Cual es tu nombre? ");
        String nombre = input.nextLine();

        System.out.println("Ingresa tú salario ");
        String salario = input.nextLine();

        if (validarNumero(salario) && Integer.parseInt(salario) > 0) {
            Empleado empleado = new Empleado(nombre, Integer.parseInt(salario));

            double liquidacionPrestacion = Banco.liquidarPrestacionesEmp(empleado);
            System.out.println("Hola " + empleado.getNombre() + " Su liquidación es: $" + liquidacionPrestacion);

            double liquidacionSegSocial = Banco.liquidarSegSocialEmp(empleado);
            System.out.println("Su prestacion social es: $" + liquidacionSegSocial);

            double nomina = Banco.liquidarNominaEmp(empleado);
            System.out.println("Su nomina es: $" + nomina);

            double paraf = Banco.liquidarParafiscalesEmp(empleado);
            System.out.println("Sus descuentos de parafiscales es: $" + paraf);

            double costoEmpresa = Banco.costoEmpleadoParaLaEmpresa(empleado);
            System.out.println("El costo del empleado es: $" + costoEmpresa);
        }
    }

    public static boolean validarNumero(String dato) {
        char unCaract = dato.charAt(0);
        if (!Character.isDigit(unCaract) || unCaract == '.') {
            return false;
        }

        for (int i = 1; i < dato.length(); i++) {
            unCaract = dato.charAt(i);
            if (!Character.isDigit(unCaract)) {
                return false;
            }
        }

        return true;
    }

}
