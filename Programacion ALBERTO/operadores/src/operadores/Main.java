package operadores;

public class Main {

	public static void main(String[] args) {
		/*operadores aritmeticos*/
		// + Sumar dos valores
		int n1 = 3;
		int n2 = 4;
		
		System.out.println(n1+n2);
		
		int n3 = 6;
		float n4 = 3.5f; //usando un "double" te ahorras colocar la "f" al final
		
		System.out.println(n3+n4);
		
		// - resta do valores
		
		int n5 = 8;
		int n6 = 14;
		
		System.out.println(n6-n5);
		
		// / divide dos valores
		// * multiplica dos valores
		// % devuelve el RESTO de una division
		
		System.out.println(n5%n6);
		
		// ++ Aumento
		int n7 = 8;
		n7 = n7 + 1;
		n7++;
		
		// -- Decremento
		n7 = n7 - 1;
		n7--;
		
		/* operadores de comparación (devuelven un true o un false*/  
		
		//== igual que...
		System.out.println(1 == 1); //true
		System.out.println(1 == 2); //false
		
		//!= diferente que...
		System.out.println(1 != 1); //false
		System.out.println(1 != 2); //true
		
		//>  mayor que...
		System.out.println(1 > 1); //false
		System.out.println(1 > 2); //true
		
		//<  menor que...
		System.out.println(1 > 1); //false
		System.out.println(2 > 1); //true
		
		//>= mayor o igual que...
		System.out.println(1 >= 1); //true
		System.out.println(2 >= 1); //true
		System.out.println(0 >= 1); //false
		
		//<= menor o igual que...
		System.out.println(1 <= 1); //true
		System.out.println(2 <= 1); //false
		System.out.println(0 <= 1); //true
		
		/*operadores de lógicos*/
		//&&
		System.out.println((1 < 0) && (1 < 2)); //false : evalua las dos, en cuanto una es falsa la otra no se evalua
		
		//||
		System.out.println((1 < 0) || (1 < 2)); //true : con que una sea true ya es suficiente para que sea verdadero
		
		//!
		System.out.println(!(1<=0)); //true : niega la comparacion, es decir si es falsa dira true y si es verdadera dira false

	}

}
