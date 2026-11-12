package unidad2;

import java.util.Random;

public class Ejercicio12 {

//	public static void main(String[] args) {
//		Random r = new Random();
//		int max = Integer.parseInt(IO.readln("Introduce un número entero mayor que 0: "));
//		int numero = 0;
//		int contador = 0;
//		
//		if(max>0) {
//			do {
//				int i = r.nextInt(900) + 100;
//				numero += i;
//				contador++;
//			}	while (numero <= max);
//			
//		System.out.println("El resultado de la suma es: " + numero);
//		System.out.println("Cantidad de valores acumulados: " + contador);
//		} else {
//			System.out.println("Has introducido un numero menor o igual a 0");
//		}
//
//	}
	
	
	
	public static void main(String[] args) {
		Random r = new Random();
		int max = Integer.parseInt(IO.readln("Introduce un número entero mayor que 0: "));
		int numero = 0;
		int contador = 0;
		
		while ( max<=0) {
			System.out.println("no has introducido un número mayor que cer.");
			System.out.println("Introducelo de nuevo: ");
			max = Integer.parseInt(IO.readln("Introduce un número entero mayor que 0: "));
		}
		
		if(max>0) {
			do {
				int i = r.nextInt(900) + 100;
				numero += i;
				contador++;
			}	while (numero <= max);
			
		System.out.println("El resultado de la suma es: " + numero);
		System.out.println("Cantidad de valores acumulados: " + contador);
		} else {
			System.out.println("Has introducido un numero menor o igual a 0");
		}

	}
}
