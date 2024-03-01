package C_Progresso;

import java.util.Locale;
import java.util.Scanner;

public class VETOR_C {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int N = sc.nextInt();
		double[] vet = new double[N];
		
		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}
		for (int i = 0; i < N; i++) {
			System.out.printf("%.2f%n", vet[i]);
		}
		sc.close();	
	}

}
