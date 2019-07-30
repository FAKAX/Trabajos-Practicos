package tp.utilitarios;

import java.util.Scanner;

public class DataEntry {
	
	public static String Letter(String mensaje) {
		
		System.out.println(mensaje);
		
		Scanner input = new Scanner(System.in);
		String valor = (input.nextLine());
		return valor;
	}

}
