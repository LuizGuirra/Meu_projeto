package B_Progresso;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LISTAS {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList <>();	
		
		list.add("Luiz");
		list.add("Alex");
		list.add("Kaike");
		list.add("Ulisses");
		list.add(2,"Victoria");
		
		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'V');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------------");
		
		System.out.println("Index of Alex: " + list.indexOf("Alex"));
		System.out.println("Index of Victoria: " + list.indexOf("Victoria"));
		
		System.out.println("------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
	}

}
