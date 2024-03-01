package B_Progresso;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DATA_A {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html	
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
			
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2023-01-19");
		LocalDateTime d05 = LocalDateTime.parse("2023-01-19T02:40:04");
		Instant d06 = Instant.parse("2023-01-19T02:40:04Z");
		Instant d07 = Instant.parse("2023-01-19T02:40:04-10:00");
		
		LocalDate d08 = LocalDate.parse("19/10/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("19/10/2023 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2008, 01, 19);
		LocalDateTime d11 = LocalDateTime.of(2008, 01, 19, 14, 25);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);	
	}

}
