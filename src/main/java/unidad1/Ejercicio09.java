package unidad1;

public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double euros= Double.parseDouble(IO.readln("Euros : "));
		double dolares= (euros * 1.14);
		System.out.printf("%.2f euros son %.2f dólares", euros, dolares);
		
	}

}
