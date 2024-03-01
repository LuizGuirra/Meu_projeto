package Atividades;

import java.util.Locale;

public class SYSOUT_PRINT {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double piece1 = 2100.0;
		double piece2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, wich price is $ %.2f%n", product1, piece1);
		System.out.printf("%s, wich price is $ %.2f%n", product2, piece2);
		
		System.out.println();
		
		System.out.printf("Record: %s years old, code %d and gender: F", age, code, gender);
		
		System.out.println();
		System.out.println();
		
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (tree decimal places): %.3f%n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
	}

}
