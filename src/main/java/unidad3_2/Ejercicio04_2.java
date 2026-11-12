package unidad3_2;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio04_2 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner (new File(args[0]));
		Pattern p = Pattern.compile("\"(https?.*?)\"");
		String url;
		while ((url = in.findWithinHorizon(p, 0)) !=null)
			System.out.println(url);
	}

}
