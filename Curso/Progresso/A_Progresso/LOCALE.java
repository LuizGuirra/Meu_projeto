package A_Progresso;

import java.util.Locale;

public class LOCALE {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		double a = 10.456748;

		System.out.printf("%.2f%n", a);
	}

}
