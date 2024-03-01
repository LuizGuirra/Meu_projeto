package B_Progresso;

import java.util.Scanner;

public class FUNCAO {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("DIGITE TRÊS NÚMEROS: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int maior = max(a, b, c);

		showResult(maior);

		sc.close();
	}

	public static int max(int aa, int bb, int cc) {

		int aux;

		if (aa > bb && aa > cc) {
			aux = aa;
		} else if (bb > aa && bb > cc) {
			aux = bb;
		} else {
			aux = cc;
		}
		return aux;
	}

	public static void showResult(int Maior) {
		System.out.println("MAIOR NÚMERO = " + Maior);
	}

}
