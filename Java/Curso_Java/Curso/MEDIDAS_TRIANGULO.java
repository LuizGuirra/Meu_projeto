package Curso;

import java.util.Locale;
import java.util.Scanner;

public class MEDIDAS_TRIANGULO {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		TRIANGULO x, y;
		x = new TRIANGULO();
		y = new TRIANGULO();
		
		System.out.println("INSIRA AS MEDIDAS DO TRIÂNGULO X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("INSIRA AS MEDIDAS DO TRIÂNGULO Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("ÁREA DO TRIÂNGULO X: %.4f%n", areaX);
		System.out.printf("ÁREA DO TRIÂNGULO Y: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("ÁREA MAIOR: X");
		}
		else {
			System.out.println("ÁREA MAIOR: Y");
		}
		
     sc.close();
	}

}
