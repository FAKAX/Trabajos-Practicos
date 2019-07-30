package tp1.ej7;

import tp.utilitarios.NumEntry;

public class Ejercicio7 {

	public static void main(String[] args) {

		int cantidadDeManzanas;
		int cantidadDeCajones;

		cantidadDeManzanas = NumEntry.Usernum("Ingrese el numero de Manzanas:");
		cantidadDeCajones = 8;

		dividir(cantidadDeManzanas, cantidadDeCajones);
	}

	public static void dividir(int cantidadDeManzanas, int cantidadDeCajones) {
		int Sobrantes;
		int ResultadoCajones;
		
		if (cantidadDeManzanas == 0) {
			
		System.out.println("Necesitamos màs Manzanas -_-");
				
	} else { ResultadoCajones = cantidadDeManzanas/cantidadDeCajones;
	Sobrantes = cantidadDeManzanas%cantidadDeCajones;
	System.out.println("Se necesitaràn "+ResultadoCajones+" Cajones, y te sobraràn "+Sobrantes+" Manzanas para hacer purè :D");
	}
		
	}

}