package model;

public class Cancion {
	/*Atributos / Variables (estas son las caracteristicas que tienen todos los objetos)
	 */
	//TipoDato NombreDeVariable [= valor]
		public String nombre;
		public String letra; //la letra completa
		public int duracion; //duracion en segundos
		
	//Contrucciones (NombreClase(arg...)
		public Cancion() {
			
		}
		
		public Cancion(String Letra, String Cancion, int Duracion) {
			this.nombre = nombre;
			this.letra = letra;
			
			if (duracion <=0) {
				duracion = 100;
				this.duracion = duracion;
			}
			
			this.duracion = duracion;
		}
		
	//Comportamientos/Metodos
		//visibilidad retorno NombreDeMetodo (argumentos)
		public void mostrarLetra() {
			System.out.println("Mostrando letra de la cancion");
		}
	
	
	
}
