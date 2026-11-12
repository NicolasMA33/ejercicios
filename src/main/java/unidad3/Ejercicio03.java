package unidad3;

public class Ejercicio03 {

	public static void main(String[] args) {
//		String s1 = IO.readln("Introduce una cadena: ");
//		String s2 = IO.readln("Introduce una segunda cadena: ");
//		int i = 0;
//		int contador = 0;
//		while ( (i = s1.indexOf(s2, i)) >= 0) {
//				contador++;
//				i++;
//		}
//		System.out.println("Resultado: " + contador);
		
		String s1 = IO.readln("Primera cadena: ");
		String s2 = IO.readln("Segunda cadena: ");
		System.out.println(s1.indexOf(s2));		
	}

	static int númeroDeVecesQueEstáContenida(String s1, String s2) {
		int contador = 0;
		int i = 0;
		while ((i = s1.indexOf(s2, i)) >= 0) {
			contador++;
			i++;
		}
		return contador;
	}
}
