package B_Progresso;

import java.util.Scanner;

public class CONDICAO_C {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x = 1;
		int n = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			x = i * x;
			int produto = i * n;
			System.out.println(i + " x " + n + " = " + produto);
		}

		sc.close();
	}

}
