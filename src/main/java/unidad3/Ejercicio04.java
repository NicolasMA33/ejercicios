package unidad3;

public class Ejercicio04 {

	public static void main(String[] args) {
		String s1 = IO.readln("Primera cadena: ");
		String s2 = IO.readln("Segunda cadena: ");

		System.out.println(s1.indexOf(s2));
		String palabra = "";
		for (int i = 0; i < s1length(); i++) {
			char c = s1.charAt(i);
			if (c != ' ' && i != s1.length() - 1)
				palabra += c;
			else {
				if (c != ' ')
					palabra += c;
				int n = Ejercicio03.númeroDeVecesQueEstáContenida(s2, palabra);
				System.out.println(palabra + " se repite " + n + " veces");
				palabra = "";
			}

		}

	}

}
