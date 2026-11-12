package unidad1;

public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int año=2000;
		boolean bisiesto=(año%4==0 && año%100 !=0 )||(año%400==0);
		System.out.println(bisiesto);
	}
	

}
