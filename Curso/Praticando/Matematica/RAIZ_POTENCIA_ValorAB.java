package Matematica;

public class RAIZ_POTENCIA_ValorAB {

	public static void main(String[] args) {
		
		double x = 9.0;
		double A;
		A = Math.sqrt(x);
		System.out.println("RAIZ QUADRADA DE " + x + " = " + A);

		double y = 2.0;
		double B;
		B = Math.pow(y,x);
		System.out.println("POTÊNCIA DE " + y + " SOBRE " + x + " QUE É IGUAL A " + B);
		
		double z = 456.0;
		double C;
		C = Math.abs(z);
		System.out.println("VALOR ABSOLUTO DE " + z + " = " + C); 
	}

}
