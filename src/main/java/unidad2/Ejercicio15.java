package unidad2;

import java.math.BigInteger;

public class Ejercicio15 {

	public static void main(String[] args) {
//		int n = 1;
//		int producto = n;
//		for (int i = 1; i < 199999; i++) {
//			n += 2;
//			producto = producto * n;
//		}
		BigInteger producto = new BigInteger("1");
		int n = 3;
		int cont = 1 ;
		while (cont < 200000) {
			if (!esPar(n)) {
				producto =producto.multiply(BigInteger.valueOf(n));// PREGUNTA EXAMEN no se promociona n se promociona el valor de n ¿?
				cont++;
			}
			n++;
		}
		System.out.println(producto);
	}

	static boolean esPar(int n) {
//		if (n % 2 == 0)
//			return true;
//		else se puede quitar poque si no se cumple el if ya se pone el return
//		return
//		Mas simplificado->
		return n % 2 == 0;
	}

}
