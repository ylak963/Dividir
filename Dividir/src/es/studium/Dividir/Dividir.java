package es.studium.Dividir;

import java.util.Scanner;

public class Dividir {


	public static void main(String[] args) {
		int dividendo, divisor;
		double cociente;

		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce el dividendo: ");
		dividendo=teclado.nextInt();

		System.out.println("Introduce el divisor: ");
		divisor=teclado.nextInt();
		cociente=funcionDividir(dividendo, divisor);
		System.out.println("La división vale:"+" "+cociente);
		teclado.close();
	}

	//La función recibe dos enteros y devuelve un double.
	public static double funcionDividir(int a, int b) {
		double resultado;

		//Fozar a los numeros que sean doubles con un casting
		resultado=(double)a/(double)b;
		return resultado;
	}

}
