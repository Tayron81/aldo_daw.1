package view;

import model.Cancion;

public class App {

	
	
	public static void main(String[] args) {
		//Crear objeto: NombreClase nombreObjeto = new NombreClase
		Cancion c1 = new Cancion();
		c1.nombre = "El Rap de CSgo";
		c1.letra = "Yo yo empieza la partida empiezo a rapear delante de tu madre que se va a cagar yo yo el rap de CSgo let's go, ";
		c1.duracion = 150;
		
		Cancion c2 = new Cancion();
		c2.nombre = "El Rap de CSgo";
		c2.letra = "kan j dajdiasjdi ajs adjskja kjdas hkjdas kjd akjda";
		c2.duracion = 150;
		
		System.out.println(c1.letra);
		
		Cancion c3 = new Cancion("Caca", "me cagoooo...",150);
		System.out.println(c3.duracion);
		
		
		
	}

}
