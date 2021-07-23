package actividad3;

import java.util.Scanner;


public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Elije la operacion a realizar: (1)Suma (2)Resta (3)Multiplicacion (4)División (5)Residuo (6)Salir");
		int opcion = Integer.parseInt(input.nextLine());
		
		switch (opcion) {
		case 1: {
			Scanner input1 = new Scanner(System.in);
			System.out.println("Numero 1:");
			
			//yield type;
		}
		case 2: {
			Scanner input1 = new Scanner(System.in);
			System.out.println("Numero 1:");
		}
		case 3: {
			
			
		}
		case 4: {
			
			
		}
		case 5: {
			
			
		}
		case 6: {
			
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
	}

}
