package Criar_documento_;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Programa_ {

	public static void main(String[] args) {

		String[] lines = new String[] { "PHP", "Java", "C++" };

		String path = "c:\\temp\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
