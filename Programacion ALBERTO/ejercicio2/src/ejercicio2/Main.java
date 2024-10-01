package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* Programa 1
		 * Pedir por teclado un nombre de alumno
		 * Pedir por teclado 5 notas
		 * Mostrar la media
		 * Mostrar si el alumno aprueba el año (para que se apto tiene que aprobar todo)
		 * EJEMPLO: El alumno Alberto tiene una media de 5.5 y es apto.
		 * Programa 2
		 * Pedir por teclado el tipo de cliente(regular, socio, VIP)
		 * Pedir por teclado el importe de la compra
		 * Mostrar el total a pagar por el cliente
		 * Sabiendo que regular no se aplica descuento, socio es un 5% y el VIP es un 20%
		 */
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Introduzca su nombre");
	String alumno = entrada.next();
	
	System.out.println("Introduzca su nota de Programacíon");
	double nota1 = entrada.nextDouble();
	
	System.out.println("Introduzca su nota de Base de Datos");
	double nota2 = entrada.nextDouble();
	
	System.out.println("Introduzca su nota de Lenguaje de Marcas");
	double nota3 = entrada.nextDouble();
	
	System.out.println("Introduzca su nota de Analisis");
	double nota4 = entrada.nextDouble();
	
	System.out.println("Introduzca su nota de Ingles técnico");
	double nota5 = entrada.nextDouble();
	
	Double media = ((nota1 + nota2 + nota3 + nota4 + nota5)/5);
	
	if((nota1<=4)||(nota2<=4)||(nota3<=4)||(nota4<=4)||(nota5<=4)) {
		System.out.println("El almuno " + alumno + " tiene una media de " + media + " y NO es apto." ); 		
	} else {
		System.out.println("El almuno " + alumno + " tiene una media de " + media + " y es apto.");
	}
	
	}

}
