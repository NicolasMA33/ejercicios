package unidad3_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio08 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(Ejercicio08.class.getResourceAsStream("/Ejercicio08.txt")));
		String frase = in.readAllAsString();
		Matcher m = Pattern.compile("<uppercase>(.*?)</uppercase>").matcher(frase);
		StringBuilder sb = new StringBuilder();
		while (m.find())
			m.appendReplacement(sb, m.group(1).toUpperCase());
			m.appendTail(sb);
			System.out.println(sb);
	}

}
