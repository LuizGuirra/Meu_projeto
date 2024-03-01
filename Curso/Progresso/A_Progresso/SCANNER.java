package A_Progresso;

import java.util.Scanner;

public class SCANNER {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double M = sc.nextDouble();
		String P = sc.next();
		
		System.out.println(N);
		System.out.println(M);
		System.out.println(P);
		
		sc.close();	
	}

}
