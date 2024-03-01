package B_Progresso;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DATA_C {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-01-19");
		LocalDateTime d02 = LocalDateTime.parse("2023-01-19T02:40:04");
		Instant d03 = Instant.parse("2023-01-19T02:40:04Z");
			
		LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
			
		System.out.println("r1 = " + r1);	
		System.out.println("r2 = " + r2);	
		System.out.println("r3 = " + r3);	
		System.out.println("r4 = " + r4);	
		
		System.out.println();
			
		System.out.println("d01 dia = " + d01.getDayOfMonth());	
		System.out.println("d01 mês = " + d01.getMonthValue());	
		System.out.println("d01 ano = " + d01.getYear());	
			
		System.out.println();
		
		System.out.println("d02 hora = " + d02.getHour());	
		System.out.println("d02 minutos = " + d02.getMinute());
	}

}
