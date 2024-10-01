package ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduzca una palabra: ");
		String palabra= entrada.next();
		String letras ="";
		for (int i = palabra.length() - 1; i > -1; i--) {
			letras = letras + palabra.charAt(i);
		} System.out.println(letras);
		if(palabra.equals(letras)) {
			System.out.println("Es Palindromo");
		} else {
			System.out.println("No es Palindromo");
		}
	}
}
