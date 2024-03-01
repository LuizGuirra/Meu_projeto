package D_Progresso;

public class FIXACAO_AA {
	
	public String nome;
	public double notaUm;
	public double notaDois;
	public double notaTres;

	public double notaFinal() {
		return notaUm + notaDois + notaTres;
	}
	public double faltaPontos() {
		if (notaFinal() < 60.0) {
			return 60.0 - notaFinal();
		} else {
			return 0.0;
		}
	}
}
