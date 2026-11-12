package unidad2;

import java.util.Random;

public class Ejercicio22 {

	public static void main(String[] args) {
		String opcion;
		do {
		int nveces = Integer
				.parseInt(IO.readln("Introduce el número de veces que se simulara el lanzamiento de un dado: "));
		Random r = new Random();
		int dado;
		int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0, contador5 = 0, contador6 = 0;
		for (int i = 0; i < nveces; i++) {
			dado = r.nextInt(6)+1;
			switch (dado) {
			case 1:
				contador1++;
				break;
			case 2:
				contador2++;
				break;
			case 3:
				contador3++;
				break;
			case 4:
				contador4++;
				break;
			case 5:
				contador5++;
				break;
			case 6:
				contador6++;
				break;
			}
		}
		System.out.printf("Te han salido: %d unos, %d doses, %d treses, %d cuatros, %d cincos y %d seises.", contador1,contador2,contador3,contador4,contador5,contador6);
		System.out.println();
		opcion = IO.readln("Quieres volver a jugar? (S/N): ");

	} while (opcion.equalsIgnoreCase("S"));
		System.out.println("Programa finalizado");
		
	}

}
