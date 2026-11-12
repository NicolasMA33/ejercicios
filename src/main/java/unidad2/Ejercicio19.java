package unidad2;

public class Ejercicio19 {

	public static void main(String[] args) {
		int fila = Integer.parseInt(IO.readln("Introduce el numero de filas deseado: "));
		int n = 1;
		int max = 0;
		int digitos = 0;
		String formato = String.format( "%%-%dd", digitos);
		for (int i = 0; i <= fila; i++) {
			for (int j = 0; j < i; j++) {
				System.out.printf(formato, n);
				n++;
			}
			System.out.println();
		}
	}

}
