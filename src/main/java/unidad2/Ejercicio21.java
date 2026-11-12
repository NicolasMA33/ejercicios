package unidad2;

public class Ejercicio21 {

	static int fibonacci() {		
		int n1 = 0;
		int n2 = 1;
		for (int i = 0; i<10; i++) {
			int suma = n1+ n2;
			n1 = n2;
			n2 = suma;
		}
		return n1;
	}
	
	
	public static void main(String[] args) {
		int result = fibonacci();
		System.out.println(result);
	}

}
