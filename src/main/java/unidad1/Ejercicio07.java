package unidad1;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double vi=5d;		//no hace falta d
		double a=2d;
		double d;
		double t=Double.parseDouble(IO.readln("Tiempo: "));
		d= (vi * t) + ((a * t * t)/2);		//se puede prescindir de las dos primeras variables y poner 5d y 2d en sus respectivos lugares en print
		System.out.print("Distancia: " + d + " metros");
	}

}
