package Atividades;

public class FIXACAO_DA {
	
	public double largura;
	public double altura;
	
	public double area() {
		return largura * altura;
	}
	public double perimetro() {
		return (largura + altura) * 2.0;
	}
	public double diagonal() {
		return Math.sqrt(largura * largura + altura * altura);
	}
}
