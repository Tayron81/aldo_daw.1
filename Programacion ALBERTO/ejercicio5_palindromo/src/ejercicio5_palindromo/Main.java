package ejercicio5_palindromo

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca su nombre: ");
		String nombre = entrada.next();
		for (int i = 0; i < nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}
		for (int i = nombre.length() - 1; i > -1; i--) {
			System.out.println(nombre.charAt(i));
		}

	}

}
