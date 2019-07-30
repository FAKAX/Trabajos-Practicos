package tp.utilitarios;

import java.util.Scanner;

public class NumEntry {
	
	public static int Usernum(String mensaje) {
		
		System.out.println(mensaje);
		
		Scanner input = new Scanner(System.in);
		int valor = Integer.parseInt(input.nextLine());
		return valor;
	}

}
