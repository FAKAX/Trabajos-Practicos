package tp1.ej4;

import tp.utilitarios.NumEntry;

public class Ejercicio4 {

	public static void main(String[] args) {
	int num1;
	int num2;
	
	num1 = NumEntry.Usernum("ingresa un numero para sumar");
	num2 = NumEntry.Usernum("Ingresa otro numero para sumar");
	
	sumar(num1 , num2);

	}
	
	public static void sumar(int num1, int num2) {
		
		int resultado;
		resultado = num1 + num2;
		
		System.out.println("La suma entre "+num1+" y "+num2+" da como resultado: "+resultado);
	}

}
