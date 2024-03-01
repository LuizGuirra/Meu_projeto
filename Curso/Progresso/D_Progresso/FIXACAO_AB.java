package D_Progresso;

import java.util.Locale;
import java.util.Scanner;

public class FIXACAO_AB {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		FIXACAO_AA nota = new FIXACAO_AA();
		
		nota.nome = sc.nextLine();
		nota.notaUm = sc.nextDouble();
		nota.notaDois = sc.nextDouble();
		nota.notaTres = sc.nextDouble();
		
		System.out.printf("NOTA FINAL = %.2f%n", nota.notaFinal());
		
		if (nota.notaFinal() < 60.0) {
			System.out.println("REPROVOU");
			System.out.printf("FALTA %.2f PONTOS%n", nota.faltaPontos());
		}
		else {
			System.out.println("PASSOU");
		}	
     sc.close();	
	}

}
