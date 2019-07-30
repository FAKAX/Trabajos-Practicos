package tp1.ej6;

import tp.utilitarios.NumEntry;

public class Ejercicio6 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;

		num1 = NumEntry.Usernum("Ingrese el primer numero a comparar");
		num2 = NumEntry.Usernum("Ingrese el segundo numero a comparar");
		num3 = NumEntry.Usernum("Ingrese el tercer numero a comparar");

		if (num1 > num2) {

			if (num1 > num3) {
				System.out.println("El mayor es: " + num1);
			}

			else {
				System.out.println("el mayor es: " + num3);
			}
		} else if (num2 > num3) {
			System.out.println("el mayor es: " + num2);
		}

		else {
			System.out.println("el mayor es: " + num3);

		}
	}
}
