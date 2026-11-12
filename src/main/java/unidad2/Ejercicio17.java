package unidad2;

import java.util.Random;

public class Ejercicio17 {

	public static void main(String[] args) {
		Random r = new Random();
		int n1 = r.nextInt((98999) + 1000);
		int n2 = r.nextInt((n1) + 1);
		int contador = 0;
		int n;
		System.out.println("He pensado un número entre 1 y N, adivina cuál es.");
		do {
			n = Integer.parseInt(IO.readln("Introduce el número: "));
			contador++;
			
			if (n<n2) {
				System.out.println("El número introducido es menor que el correcto");
			} 
			else if (n>n2) {
				System.out.println("El número introducido es mayor que el correcto");
			}
	
			
		} while (n != n2);
		System.out.println("Has acertado!");
		System.out.println("Te llevo " + contador + " intentos");

	}
}