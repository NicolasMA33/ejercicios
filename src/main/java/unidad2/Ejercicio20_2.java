package unidad2;

public class Ejercicio20_2 {

	public static void main(String[] args) {
		int fila = Integer.parseInt(IO.readln("Introduce el número de filas: "));
		
		System.out.println();
		
	for (int i = 0; i < fila; i++) {
		
		for (int j = 0; j < fila - i; j++) { 
            System.out.print("*"); 
        } 
       
        System.out.print(" ");
		
        for (int k = 0; k < i; k++) { 
            System.out.print(" "); 
        } 
        for (int j = 0; j < fila - i; j++) { 
            System.out.print("*"); 
        } 
        System.out.print(" ");
		
        for (int j = 0; j <= i; j++) { 
            System.out.print("*"); 
        } 
        for (int j = 0; j < fila - 1 - i; j++) {
            System.out.print(" ");
        }
        System.out.print(" ");
        
        
		
		System.out.println();
		}
	
	}
}


