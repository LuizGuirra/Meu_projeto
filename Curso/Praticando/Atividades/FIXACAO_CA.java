package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class FIXACAO_CA {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		FIXACAO_CB emp = new FIXACAO_CB();
		
		System.out.print("NOME: ");
		emp.nome = sc.nextLine();
		
		System.out.print("SALÁRIO BRUTO: ");
		emp.salarioBruto = sc.nextDouble();
		
		System.out.print("IMPOSTO: ");
		emp.imposto = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("FUNCIONÁRIO: " + emp);
		
		System.out.println();
		
		System.out.println("QUAL A PORCENTAGEM PARA AUMENTAR O SALÁRIO? "); 
		
		double porcentagem = sc.nextDouble();
		emp.aumentarSalario(porcentagem);
		
		System.out.println();
		
		System.out.println("DADOS ATUALIZADOS: " + emp);
		
     sc.close();
	}

}
