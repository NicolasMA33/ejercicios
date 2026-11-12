package unidad3_3;

import java.util.Arrays;

public class Ejercicio13MetodosOrdenacion {

	public static void main(String[] args) {
		int[] v = { 44, 55, 12, 42, 94, 18, 6, 67 };
		
		System.out.println("Insercion directa :");
		
		System.out.println(Arrays.toString(v));
		insercionDirecta(v);
		System.out.println(Arrays.toString(v));
		
		System.out.println("Seleccion directa: ");
		
		System.out.println(Arrays.toString(v));
		seleccionDirecta(v);
		System.out.println(Arrays.toString(v));
		
		System.out.println("Intercambio directo: ");
		
		System.out.println(Arrays.toString(v));
		intercambioDirecto(v);
		System.out.println(Arrays.toString(v));
	}

	public static void insercionDirecta(int[] v) {
		for (int i = 1; i < v.length; i++) {
			int j = 0;
			while (v[i] > v[j] && j < i) {
				j++;
			}
			if (j < i) {
				int aux = v[i];
				for (int k = i - 1; k >= j; k--)
					v[k + 1] = v[k];
				v[j] = aux;
			}
		}
	}

	public static void seleccionDirecta(int[] v) {
		for (int i = 0; i < v.length; i++) {
			int posMin = i;
			for (int j = i + 1; j < v.length; j++) {
				if (v[j] < v[posMin])
					posMin = j;
			}
			int aux = v[i];
			v[i] = v[posMin];
			v[posMin] = aux;
		}
	}

	public static void intercambioDirecto(int[] v) {
		for (int i = 0; i < v.length - 1; i++) {
			for (int j = 0; j < v.length - 1 - i; j++) {
				if (v[j] > v[j + 1]) {
					int aux = 0;
					v[j] = v[j + 1];
					v[j + 1] = aux;
				}
			}
		}
	}
}
