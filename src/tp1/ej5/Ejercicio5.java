package tp1.ej5;

import tp.utilitarios.NumEntry;

public class Ejercicio5 {

	public static void main(String[] args) {
	int num1;
	int num2;
	
	num1 = NumEntry.Usernum("Ingrese un numero a dividir");
	num2 = NumEntry.Usernum("Ingrese el numero divisor");
	
	dividir(num1 , num2);

	}
	
	public static void dividir(int num1, int num2) {
	int resultado;
	
	if (num2 == 0) {
		System.out.println("No se puede dividir por cero");
	
	} else {
		resultado = num1 / num2;
		System.out.println(num1+"/"+num2+"="+resultado);
	}
		
	}
}
