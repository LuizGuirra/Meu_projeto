package B_Progresso;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DATA_B {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-01-19");
		LocalDateTime d02 = LocalDateTime.parse("2023-01-19T02:40:04");
		Instant d03 = Instant.parse("2023-01-19T02:40:04Z");
			
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html		
			
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");	
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d01.1 = " + d01.format(fmt1));	
		System.out.println("d01.2 = " + fmt1.format(d01));	
		System.out.println("d01.3 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println();
		
		System.out.println("d02.1 = " + d02.format(fmt1));
		System.out.println("d02.2 = " + d02.format(fmt2));
		System.out.println("d02.3 = " + d02.format(fmt4));
		
		System.out.println();
		
		System.out.println("d03.1 = " + fmt3.format(d03));
		System.out.println("d03.2 = " + fmt5.format(d03));
		System.out.println("d03.3 = " + d03.toString());
	}

}
