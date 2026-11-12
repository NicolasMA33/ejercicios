package unidad1;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("                    |   and  |  or  |  xor  ");
		System.out.println("--------------------------------------------");
		boolean a = true;
		boolean b = false;
		boolean c= a&&a;
		boolean d= a||a;
		boolean e= a^a;
		System.out.println(a+ "       " + a + "     |" + c + "    | " + d + " | " + e + "  ");
		boolean f= a&&b;
		boolean g= a||b;
		boolean h= a^b;
		System.out.println(a+ "       " + b + "    |" + f + "   | " + g + " | " + h + "  ");
		boolean i= b&&a;
		boolean j= b||a;
		boolean k= b^a;
		System.out.println(b+ "       " + a + "    |" + i + "   | " + j + " | " + k + "  ");
		boolean l= b&&b;
		boolean m= b||b;
		boolean n= b^b;
		System.out.println(b+ "       " + b + "   |" + l + "   | " + m + "| " + n + "  ");
	}

}
