package Matematica;

import java.util.Scanner;

public class MEDIA {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double x, y, media;
		
		System.out.print("DIGITE O PRIMEIRO NÚMERO: ");
		x = sc.nextDouble();
		System.out.println("DIGITE O SEGUNDO NÚMERO: ");
		y = sc.nextDouble();
		
		media = (x + y) / 2.0;
		System.out.println("MEDIA = " + media);
		
     sc.close();
	}

}
