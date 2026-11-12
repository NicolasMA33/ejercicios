package unidad2;

public class Ejercicio09 {

	static String diaSemana() {
		int ndiaSemana = Integer.parseInt(IO.readln("Intrpuce el número de un dia de la semana: "));
		switch (ndiaSemana) {
		case 1:
			return "Lunes";
		case 2:
			return "Martes";
		case 3:
			return "Miercoles";
		case 4:
			return "Jueves";
		case 5:
			return "Viernes";
		case 6:
			return "Sábado";
		case 7:
			return "Domingo";
		default:
			return "Error!";
			
		}
	}
	
	
	public static void main(String[] args) {
		String nombredia = diaSemana();
		int contadorerr = 0;
		while (nombredia.equalsIgnoreCase("Error!")) {
			contadorerr++;
			System.out.println("Numero incorrecto! Debe ser del 1 al 7.");
			nombredia = diaSemana();
		}
		System.out.println(nombredia);
		System.out.println("Has introducido "+ contadorerr + " datos erroneos");
		}

	
}
