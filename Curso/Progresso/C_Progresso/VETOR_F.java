package C_Progresso;

import java.util.Locale;
import java.util.Scanner;

import C_Progresso.VETOR_F;

public class VETOR_F {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		VETOR_G[] vect = new VETOR_G[10];
		
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + (i + 1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int QuartoNumero = sc.nextInt();
			vect[QuartoNumero] = new VETOR_G(nome, email);
		}
		System.out.println();
		System.out.println("Quartos ocupados: ");
		
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + ":" + vect[i]);
			}
		}	
		sc.close();
	}

}
