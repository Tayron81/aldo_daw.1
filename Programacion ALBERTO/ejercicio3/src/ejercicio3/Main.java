package ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el tipo de cliente");
		System.out.println("1- Cliente Socio");
		System.out.println("2- Cliente VIP");
		System.out.println("3- Cliente Regular");
		int cliente = entrada.nextInt();
		if ((cliente > 3) || (cliente < 1)) {
			System.out.println("No se reconoce el tipo de cliente");
		} else {
			System.out.println("Introduzca el importe de la compra");
			double compra = entrada.nextDouble();
			
			double pVIP = (compra - (compra*0.2));
			double pSoc = (compra - (compra*0.05));
			
			switch (cliente) {
			case 1:
				System.out.println("Importe TOTAL = "+pSoc+"€");
				break;
			case 2:
				System.out.println("Importe TOTAL = "+pVIP+"€");
				break;
			case 3:
				System.out.println("Importe TOTAL = "+compra+"€");
				break;
			}
		}
		
	}

}
