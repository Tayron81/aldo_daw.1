package ejercicio4_factorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in); //generamos un sacnner
		System.out.println("Introduzca un numero POSITIVO"); //pedimos la introduccion de un numero POSITIVO en la consola

		int numero = entrada.nextInt();// se crea una variable que defina el limite de la factorial o en este caso el bucle "for"
		int factorial = 1; //se crea una variable que guarda el resultado de las multiplicaciones de la factorial
		
		for(int i = 1; i<=numero;i++) {
			factorial = factorial * i; //aquí se multiplica el resultado por el siguiente numero del bucle
		} /*cada vez que "factorial" se multiplica, la variable cambia, es de decir, en la primera vuelta, factorial es igual a 1
		en la siguiente vuelta factorial se ha multiplicado por 2 (1*2 = 2) y así sucesivamente.
		*/
		System.out.println("La factorial de "+ numero +" es "+ factorial);
		System.out.println("Los multiplos de "+numero+" son:");
		for(int i = 1;i<999999999;i++) {
			if(numero%i==0) {
				System.out.println(i);
			}
		}
		
		

	}

}

