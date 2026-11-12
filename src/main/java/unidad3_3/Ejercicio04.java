package unidad3_3;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio04 {
//falta hacer un apartado
	static Random r = new Random();

	public static void main(String[] args) {
		int tamaño = Integer.parseInt("Introduce un número entre 10 y 200: ");
		while (tamaño > 200 || tamaño < 10)
			tamaño = Integer.parseInt("Tamaño incorrecto, introdúcelo de nuevo: ");
		int v[] = new int[tamaño];
		for (int i = 0; i < v.length; i++)
			v[i] = r.nextInt(201) - 100;
		int suma = 0;
		int aux = 0;
		int contador = 0;
		for (int i=0; i<v.length; i++) {
			if (v[i] !=13) {
				if (aux == 0)
					suma += v[i];
			 else {
				aux += v[i];
				contador++;
				if (contador == 14) {
					if (aux == 7)
						suma += aux;
					aux = 0;
					contador = 0;
				}
			}
		}
			else {
				aux = 13;
			}
	}
	if (aux == 7)
		suma += aux;
	System.out.println(Arrays.toString(v));
	System.out.println("Suma: " + suma);

}
}
