package actividad2;

import java.util.Scanner;

public class MiSaludo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Cual es tu nombre? ");
		String nombre = input.nextLine();
		
		System.out.println("Hola "+nombre);
	}
}
