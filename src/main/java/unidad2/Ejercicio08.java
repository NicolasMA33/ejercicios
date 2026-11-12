package unidad2;

public class Ejercicio08 {

	static String triangulos() {
		int a = Integer.parseInt(IO.readln("Introduce el primer lado: "));
		int b = Integer.parseInt(IO.readln("Introduce el segundo lado: "));
		int c = Integer.parseInt(IO.readln("Introduce el tercer lado: "));
		if ((a + b) < c || (a + c) < b || (b + c) < a) {
			return "Es un triangulo imposible";
		} else if (a == b && b == c) {
			return "Es un triangulo equilatero";
		} else if ((a == b || c == b || a == c) && (a != b || a != c || c != b)) {
			return "Es triangulo isósceles";
		} else // (a != b && b != c && a != c) {
			return "Es escaleno.";
	}

	public static void main(String[] args) {
		String t = triangulos();
		System.out.println(t);

	}

}
