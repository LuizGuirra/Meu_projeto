package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class FIXACAO_DB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    FIXACAO_DA rect = new FIXACAO_DA();
		
		System.out.println("INSIRA A ALTURA E A LARGURA DO RETÂNGULO: ");
		rect.largura = sc.nextDouble();
		rect.altura = sc.nextDouble();
        
		System.out.printf("AREA = %.2f%n", rect.area());
		
		System.out.printf("PERÍMETRO = %.2f%n", rect.perimetro());
		
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		
		sc.close();
	}

}
