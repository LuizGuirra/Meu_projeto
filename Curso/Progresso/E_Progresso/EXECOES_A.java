package E_Progresso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXECOES_A {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner (System.in);	
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro de posição!");
		}
		catch (InputMismatchException e) {
			System.out.println("Erro de entrada!");
		}
		System.out.println("Fim do programa");
		
		sc.close();	
	}
}
