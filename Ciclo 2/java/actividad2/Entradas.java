package actividad2;

import java.util.Scanner;

public class Entradas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite un n�mero: ");
		int opcion = Integer.parseInt(input.nextLine());
		
		if(opcion > 0) {
			System.out.println("Feliz d�a");
		}
		else if(opcion == 0) {
			System.out.println("Vas muy bien");
		}
		else {
			System.out.println("Para atr�s ni para coger impulso");
		}
	}

}
