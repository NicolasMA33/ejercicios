package unidad3_3;

public class Ejercicio09 {

	static Integer centro(int[] v) {
		for (int c = 0; c < v.length; c++) {
			int sumaIzq = 0;
			for (int i = 0; i < c; i++) {
				sumaIzq += (c - i) * v[i];
			}
			int sumaDcha = 0;
			for (int j = c+1; j < v.length; j++) {
				sumaDcha += (j - c) * v[j];
			}
			if (sumaIzq == sumaDcha)
				return c;
		}

		return null;
	}

	public static void main(String[] args) {
		int [] v = {6,2,3,0,1};
		Integer centro = centro(v);
		IO.println(centro != null ? "Centro= " + centro : "El vector no tiene centro");
	}

}
