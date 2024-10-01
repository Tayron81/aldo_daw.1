package variables;

public class Main {

	public static void main(String[] args) {
	/*PRIMITIVOS: 
	 * byte 
	 * short
	 * long
	 * int
	 * float
	 * double
	 * char
	 * boolean
	 */
		
	/*REFERENCIA: 
	 * Byte 
	 * Short
	 * Long
	 * Int
	 * Float
	 * Double
	 * Char
	 * Boolean
	 */
	
	double numero = 3; //double ocupa menos espacio que int
	char caracter = 'a';
    Double numero2 =3.0;
    String cadena = "Aldo Arrieta";
    
   
    
    for(int index=0;index<cadena.length();index++) {
    	//System.out.println(index);
    	System.out.println(cadena.charAt(index));
    }
   

	}

}
