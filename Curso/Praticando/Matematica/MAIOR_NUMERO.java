package Matematica;

import java.util.Scanner;

public class MAIOR_NUMERO {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("DIGITE TRÊS NÚMEROS: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("MAIOR NÚMERO = " + a);
		} else if (b > a && b > c) {
			System.out.println("MAIOR NÚMERO = " + b);
		} else {
			System.out.println("MAIOR NÚMERO = " + c);
		}
		sc.close();
	}

}
