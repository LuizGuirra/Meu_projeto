package E_Progresso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EXECOES_B {

	public static void main(String[] args) {
		
	method1();	
		
	System.out.println("Fim do programa");					
	}
			
	public static void method1() {
		
		System.out.println("***METHOD_1 START***");
		method2();
		System.out.println("***METHOD_1 END***");
	}
	
	public static void method2() {
	
		System.out.println("***METHOD_2 START***");
		
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
		
	    sc.close();	
	    
	    System.out.println("***METHOD_2 END***");
	}
}
