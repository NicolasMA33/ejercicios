package unidad2;

public class Ejercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mes= IO.readln("Nombre del mes: ");
	
		switch(mes.toLowerCase()) {	
	case "enero", "marzo","mayo","julio","agosto","octubre","diciembre":
		System.out.println("El mes "+ mes + " tiene 31 días");
		break;
	case "febrero":
		System.out.println("Febrero teine 28 días");
		break;
	default:
		System.out.println("Este mes no existe");
		break;
	case "abril", "junio","septiembre","noviembre":
		System.out.println("El mes "+ mes + " tiene 31 días");
		break;
		}
	
		if (mes =="enero"|| mes=="marzo"|| mes=="mayo"|| mes=="julio"|| mes=="agosto"|| mes=="octubre"|| mes=="diciembre");
		System.out.println("El mes"+ mes + "tiene 31 días");
	}
}
