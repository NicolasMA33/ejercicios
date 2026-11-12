package unidad1;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r= Double.parseDouble(IO.readln("Radio: "));
		double p=(2* (Math.PI *r));
		double a= Math.PI * (r * r);
		System.out.println("El perimetro es : "+ p);
		System.out.println("El área es : " + a);
	}

}
