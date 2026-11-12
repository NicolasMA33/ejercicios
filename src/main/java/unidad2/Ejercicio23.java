package unidad2;

public class Ejercicio23 {

	static double coordenadas() {
		
			System.out.println("Primeras coordenadas:");
			int x1 = Integer.parseInt(IO.readln("Introduce la x: "));
			int y1 = Integer.parseInt(IO.readln("Introduce la y: "));
			
			System.err.println();
			
			System.out.println("Segundas coordenadas:");
			int x2 = Integer.parseInt(IO.readln("Introduce la x: "));
			int y2 = Integer.parseInt(IO.readln("Introduce la y: "));
			
			double distancia = Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1, 2)));
			return distancia;
			
		
	}
	
	
	public static void main(String[] args) {
		String opcion;
		do {
			double resultado = coordenadas();
			System.out.println("La distancia es: " + resultado );
			opcion = IO.readln("Desea acabar el programa? (S/N): ");
		} while (opcion.equalsIgnoreCase("N"));
		System.out.println("El programa ha finalizado");

	}

}
