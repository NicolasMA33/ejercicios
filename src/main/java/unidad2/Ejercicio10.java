package unidad2;

public class Ejercicio10 {

	static void caractaresComprendidos(char char1, char char2 ) {
		char inicio = (char1<char2) ? char1 : char2;
		char finl = (char1>char2) ? char1 : char2;
		
		for (char c = (char) (inicio + 1) ; c < finl ; c++) {
			System.out.println(c + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		String text1 = IO.readln("Introduce el primer caracter: ");
		String text2 = IO.readln("Introduce el segundo caracter: ");
		
		char c1 = text1.charAt(0);
		char c2 = text2.charAt(0);
		
		System.out.println("Los caracteres comprendidos son :");
		caractaresComprendidos(c1,c2);
		
	}

}
