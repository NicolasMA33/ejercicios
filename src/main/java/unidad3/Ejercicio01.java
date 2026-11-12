package unidad3;

public class Ejercicio01 {

	public static void main(String[] args) {
		String s = IO.readln("Introduce una cadena: ");
		int a = 0, e = 0, i = 0, o = 0, u = 0;
		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
//			switch (c) {
//			case 'a' , 'A':
//				a++;
//				break;
//			case 'e' , 'E':
//				e++;
//				break;
//			case 'i' , 'I':
//				i++;
//				break;
//			case 'o' , 'O':
//				o++;
//				break;
//			case 'u' , 'U':
//				u++;
//				break;
//			}
			if (c == 'a' || c == 'A')
				a++;
			if (c == 'e' || c == 'E')
				e++;
			if (c == 'i' || c == 'I')
				i++;
			if (c == 'o' || c == 'O')
				o++;
			if (c == 'u' || c == 'u')
				u++;

		}
		System.out.println("Hay " + a + " aes");
		System.out.println("Hay " + e + " ees");
		System.out.println("Hay " + i + " íes");
		System.out.println("Hay " + o + " oes");
		System.out.println("Hay " + u + " úes");

	}

}
