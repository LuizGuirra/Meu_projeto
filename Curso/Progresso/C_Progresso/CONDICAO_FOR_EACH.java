package C_Progresso;

public class CONDICAO_FOR_EACH {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Lucas", "Pedro"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("--------------------------");
		
		for (String obj: vect) {
			System.out.println(obj);
		}
	}

}
