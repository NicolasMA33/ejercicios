package unidad2;

public class Ejercicio14 {
//no entendi nada de lo de linea
	public static void main(String[] args) {
		int suma = 0;
		float media;
		int menores = 0;
		int contador = 0;
		String linea = IO.readln("Introduce la edad de un alumno: ");
		while (linea != null) {
			int edad = Integer.parseInt(linea);
			suma = suma + edad;
			contador++;
			if (edad < 18)
				menores++;
			linea = IO.readln("Introduce la edad de otro alumno: ");
		}
		media = (float) suma / (float) contador;
		System.out.printf("\nSuma de todas las edades: %d\n", suma);
		System.out.printf("Edad media: %f\n", media);
		System.out.printf("Número de alumnos menores de edad: %d\n", menores);
	}

}
