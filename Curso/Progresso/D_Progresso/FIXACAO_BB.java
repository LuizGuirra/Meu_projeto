package D_Progresso;

import java.util.Locale;
import java.util.Scanner;

public class FIXACAO_BB {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		FIXACAO_BA curso = new FIXACAO_BA();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = curso.circumference(radius);
		
		double v = curso.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", curso.PI);
		
     sc.close();	
	}

}
