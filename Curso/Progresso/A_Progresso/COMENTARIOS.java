package A_Progresso;

import java.util.Scanner;

public class COMENTARIOS {

	public static void main(String[] args) {
		
/* 
O comentário é como se fosse a observação do programador quanto aquele código,
Podemos colocar um comentário dessa maneira e também na maneira que vêm logo abaixo.
*/
	Scanner sc = new Scanner(System.in);
	
	int a,b,c;	
	
	a = sc.nextInt();
	b = sc.nextInt();	
		
	c = a * b; // Esse código serve para fazer o cálculo de multiplicação.
	
	System.out.printf("%2d x%2d =%2d", a, b, c);
		
	sc.close();	
	}

}
