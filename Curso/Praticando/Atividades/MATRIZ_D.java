package Atividades;

import java.util.Scanner;

public class MATRIZ_D {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] mat = new int [m][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
			  mat[i][j] = sc.nextInt();
			}       
		}
		int x = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
			   if (mat[i][j] == x) {
				   System.out.println("POSIÇÃO " + i + "," + j + ":");
				   if (j > 0) {
					   System.out.println("Esquerda: " + mat[i][j-1]);
				   }
				   if (i > 0) {
					   System.out.println("Acima: " + mat[i-1][j]);
				   }
				   if (j < mat[i].length-1) {
					   System.out.println("Direita: " + mat[i][j+1]);
				   }
				   if (i < mat.length-1) {
					   System.out.println("Abaixo: " + mat[i+1][j]);
				   }
			    }
		    }
		 }
		 sc.close();
	}

}
