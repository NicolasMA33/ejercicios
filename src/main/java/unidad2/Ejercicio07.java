package unidad2;

import java.time.LocalTime;

public class Ejercicio07 {

	static String obetnerSegundosSiguiente(int h, int m, int s) {
		s++;
		if (s==60) {
			s=0;
			m++;
		}
		if (m==60) {
			h++;
			m=0;
		}
		if (h==24)
			h=0;
		return String.format("%02d:%02:%02d",h,m,s);
	}
	
	
	
	public static void main(String[] args) {
		LocalTime horaActual = LocalTime.now(); 
		int horas = horaActual.getHour();
		int minutos = horaActual.getMinute();
		int segundos = horaActual.getSecond();
		
		while (true) {
			String horaSiguiente = obetnerSegundosSiguiente(horas,minutos,segundos);
			System.out.println("Hora actual: "+ horaSiguiente);
			 segundos++; 
	            if (segundos == 60) { segundos = 0; minutos++; }
	            if (minutos == 60) { minutos = 0; horas++; }
	            if (horas == 24) { horas = 0; }
	}

}
}
