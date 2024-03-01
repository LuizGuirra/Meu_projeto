package B_Progresso;

import java.util.Locale;
import java.util.Scanner;

public class CONDICAO_A {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
			double hora;
			
			System.out.println("Quantas horas?");
			hora = sc.nextDouble();
			
			if (hora <= 6) {
				System.out.println("Tão cedo assim?");
			}
			else if (hora < 8)   {
			    System.out.println("Ainda bem, vou chegar a tempo.");
			}
			else if (hora > 24)  {
			    System.out.println("Tá de brincadeira comigo?");
		    }
			else if (hora >= 15) {
				System.out.println("Será que eles aceitam um pedido de desculpas?");
			}
			else if (hora >= 12) {
			    System.out.println("Vou ter que inventar uma desculpa no zap.");
			}
		    else if (hora <= 9)  {
			    System.out.println("Tenho que correr!!!"); 
		    }
			else {
				System.out.println("Estou mega atrasado!");
			}
			
		sc.close();	
	}

}
