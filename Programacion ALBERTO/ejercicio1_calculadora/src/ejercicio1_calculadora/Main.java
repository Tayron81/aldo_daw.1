package ejercicio1_calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Introduce n�mero");
	int n1 = entrada.nextInt();
	
	System.out.println("Introduce la operaci�n");
	String operacion = entrada.next();
	
	System.out.println("Introduce n�mero");
	int n2 = entrada.nextInt();
	
	switch(operacion) {
	case "+":
		System.out.println("Resultado");
		System.out.println((n1+n2));
		break;
	case "-":
		System.out.println("Resultado");
		System.out.println((n1-n2));
		break;
	case "*":
		System.out.println("Resultado");
		System.out.println((n1*n2));
		break;
	case "/":
		System.out.println("Resultado");
		System.out.println((n1/n2));
		break;
	default:
		System.out.println("Operaci�n no valida");
	}

	}

}
