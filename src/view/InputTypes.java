package view;

import java.util.Scanner;

public class InputTypes {

	public static int readInt(Scanner scanner, String msg) {
		int valor=0;
		
		while(true) {
			try {
				System.out.print(msg);
				valor=scanner.nextInt();
				scanner.nextLine();
				break;
			}
			catch(java.util.InputMismatchException e){
				System.out.print("Ingrese un numero entero.");
				scanner.nextLine();
			}
		}
		return valor;	 
	}
	
	public static double readDouble(Scanner scanner, String msg) {
		double valor=0;
		
		while(true) {
			try {
				System.out.print(msg);
				valor=scanner.nextDouble();
				scanner.nextLine();
				break;
			}
			catch(java.util.InputMismatchException e){
				System.out.print("Ingrese un numero.");
				scanner.nextLine();
			}
		}
		return valor;	
	}
	
	public static String readString(Scanner scanner, String msg) { //No se si es adecuado tener el try-catch
		String texto;
		System.out.print(msg);
		texto=scanner.nextLine();
		return texto;	
	}
	
	
		
		
	
	
}
