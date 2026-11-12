package unidad2;


public class Ejercicio20 {

	public static void main(String[] args) {
		int f = Integer.parseInt(IO.readln("Introduza el número de líneas que desee: "));

		for (int i = 0; i <= f; i++) {
			for (int j = f - i + 1; j > 0; j--)
				System.out.print('*');
			System.out.println();
		}
		System.out.println();

//		for (int i = f; i > 0; i--) {
//			for (int k = 0; k < f-i; k++) {
//				System.out.print(" ");
//
//			}
//			for (int j = i; j > 0; j--) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}

		for (int i = 0; i < f; i++) {
			for (int k = 0; k < i; k++) {
				System.out.print(" ");

			}
			for (int j = 0; j < f - i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}

		for (int i = 0; i <= f; i++) {
			for (int j = 0; j < i; j++)
				System.out.print('*');
			System.out.println();
		}

		for (int i = 0; i <= f; i++) {
			for (int j = 0; j < f - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < f; i++) {
			for (int j = 0; j < f - 1 - i; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < 2 * i + 1; k++)
				System.out.print('*');

			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < f; i++) {
			for (int k = 0; k < i; k++)
				System.out.print(' ');
			for (int j = 0; j< (2 * f - 1)-(2*i); j++)
				System.out.print('*');
			System.out.println();
		}
		
	}

}
