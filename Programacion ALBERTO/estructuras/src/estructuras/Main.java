package estructuras;

import java.util.Scanner;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// ESTRUCTURAS CONTROL DE FLUJO

		// condicionales
		Scanner entrada = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Introduce tu edad");
		int edad = entrada.nextInt();

		if (edad >= 16 && edad < 18) {
			System.out.println("Acceso permitido con tutor");
		} else if (edad >= 18) {
			System.out.println("Acceso permitido");
		} else {
			System.out.println("Acceso denegado");
		}

		if (edad < 18) {
			System.out.println("Acceso denegado");
		}

		System.out.println("Introcuce tu color de piel");
		String dia = entrada.next();
		switch (dia) {
		case "negro":
			System.out.println("Acceso denegado");
			break;
		default:
			System.out.println("Tenga un buen dia");
		}

		// repetitivas - bucles (for, while, do...while)
		// for (inicializa9cion;condicion;cadaVuelta)

		System.out.println("Introduzca su nombre: ");
		String nombre = entrada.next();
		  for(int i=0;i<nombre.length();i++){ System.out.println(nombre.charAt(i)); }
		  for(int i=nombre.length()-1;i>-1;i--){ System.out.println(nombre.charAt(i));
		  }
		  
		 
		// while
		int numeroOculto = (int) (Math.random() * 10);
		while (true) { // evalua la condicion true antes de entrar al bucle que se repite hasta que la
						// comparacion deje de ser true/false
			System.out.println("Introduce un numero del 0 - 10");
			int numeroUsuario = entrada.nextInt();

			if (numeroUsuario == numeroOculto) {
				System.out.println("Has acertado!");
				break;
			}
		}

		// do...while (se usa cuando necesitemos que el codigo de arriba se repita por
		// lo menos una vez)
		int numeroUsuario = 0;
		do {
			System.out.println("Introduce un numero");
			numeroUsuario = entrada.nextInt();
		} while (numeroUsuario != numeroOculto);
		{
			System.out.println("Has acertado");
			System.out.println("Fin del programa");
			entrada.close();
		}

	}

}
