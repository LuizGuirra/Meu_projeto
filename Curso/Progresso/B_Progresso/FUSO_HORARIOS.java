package B_Progresso;

import java.time.ZoneId;

public class FUSO_HORARIOS {

	public static void main(String[] args) {
		
		System.out.println("FUSO-HORÁRIOS:");
		System.out.println();
			
		for (String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
	}

}
