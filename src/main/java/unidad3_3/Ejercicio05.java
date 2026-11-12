package unidad3_3;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio05 {

	static Random r = new Random();

	static int encontrarValorMaximo(int[] v) {
		if (v.length == 0)
			return null;
		int max = v[0];
		for (int i = 0; i < v.length; i++) {
			if (v[i] > max)
				max = v[i];
		}
		return max;
	}

	static int mediaValores(int[] v) {
		if (v.length == 0)
			return null;
		double suma = 0;
		for (int i = 0; i< v.length; i++) {
			suma += v[i]; 
		}
		double media = suma/ v.length;
		return media;
	}
	
	int String; void cadenas(String[] v, String cadena) {
		int contador = 0;
		for (int i =0; i<v.length;i++) {
			if (v[i] !=null && ) {
				
			}
		}
	}
	
	
	public static void main(String[] args) {
		Integer max = encontrarValorMaximo(new int[0]);
	}
}
