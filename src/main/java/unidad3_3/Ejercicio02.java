package unidad3_3;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio02 {

	public static void main(String[] args) {
		Random r = new Random();
		int tamaño = r.nextInt(41) + 10;
		int v[] = new int[tamaño];
		for (int i = 0; i < v.length; i++) {
			int valor = 0;
			boolean seRepite;
			do {
				valor = r.nextInt(201) - 100;
				seRepite = false;
				// comprobar si se repite (entonces seRepite pasa de false a true)
				for (int j=0; j<i; j++) {
					if (v[j] == valor)
						seRepite = true;
				}
			} while (seRepite);
			v[i] = valor;

		}
		System.out.println(Arrays.toString(v));
	}

}
