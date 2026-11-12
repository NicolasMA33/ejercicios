package unidad2;

public class Ejercicio03 {

	static boolean esPar() {
		int numero = Integer.parseInt(IO.readln("Introduce un número: "));
		boolean par1 = (numero%2==0);
		return par1;

	}
	
	
	public static void main(String[] args) {
		
		boolean resultado = esPar();
		
		if (resultado) {
			System.out.println("El número introducido es par");
		} else
			System.out.println("El número introducido es impar");
		

	}

}
