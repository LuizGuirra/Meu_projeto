package B_Progresso;

public class STRING {

	public static void main(String[] args) {
		
        String original = " Amanhã é domingo! Que alegria! ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(9);
		String s05 = original.substring(8, 18);
		String s06 = original.replace('o' , 'u');
		String s07 = original.replace("domingo" , "quinta");
		int i = original.indexOf("domingo");
		int j = original.lastIndexOf("Que");

		System.out.println("original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-" );
		System.out.println("trim: -" + s03 + "-" );
		System.out.println("substring(9): -" + s04 + "-" );
		System.out.println("substring(8,18): -" + s05 + "-" );
		System.out.println("replace('o','u'): -" + s06 + "-" );
		System.out.println("replace('domingo','quinta'): -" + s07 + "-" );
		System.out.println("Index of ('domingo'): " + i );
		System.out.println("Last index of ('Que'): " + j );
	}

}
