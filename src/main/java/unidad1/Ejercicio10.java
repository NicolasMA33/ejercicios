package unidad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Escribe tu nombre: ");
		double t0 = System.currentTimeMillis();
		String nombre = in.readLine();
		long t1 = System.currentTimeMillis();
		double t = (t1-t0)/1000d;
		System.out.printf("Hola %s, has tardado %.2f segundos en introducir tu nombre\n", nombre, t);
	
	}

}
