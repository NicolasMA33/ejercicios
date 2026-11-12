package unidad1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r, g, b, y, i, q;
		Scanner in = new Scanner(System.in); // se puede poner in o cualquier otra cosa como teclado
		//in.useDelimiter("[,\\s]"); solo hace falta para poner las separacion por comas si no lo pones se lia, aunque lo haces con espacio
		System.out.println("Introduce componentes RGB separadas por espacios: ");// cuidado con esta clase
		r = in.nextDouble(); // si pongo teclado, en vez de in teclado
		g = in.nextDouble();
		b = in.nextDouble();
		
		y = ((0.299*r) + (0.587*g) + (0.114*b));
		i = ((0.596*r)-(0.275*g)-(0.321*b));
		q = ((0.212*r) - (0.523*g) + ( 0.311*b ));
		
		System.out.println("Y= "+ y);
		System.out.println("I= "+ i);
		System.out.println("Q= "+ q);
		
		
	}

}
