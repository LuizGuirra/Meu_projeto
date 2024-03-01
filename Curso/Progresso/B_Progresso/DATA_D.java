package B_Progresso;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DATA_D {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2023-09-19");
		LocalDateTime d02 = LocalDateTime.parse("2023-01-19T02:40:04");
		Instant d03 = Instant.parse("2023-01-19T02:40:04Z");	
		
		LocalDate semana_Passada_LocalDate = d01.minusDays(7);
		LocalDate proxima_Semana_LocalDate = d01.plusDays(7);
		LocalDate ano_Passado_LocalDate = d01.minusYears(1);
		LocalDate proximos_anos_LocalDate = d01.plusYears(3);
		LocalDate meses_Passados_LocalDate = d01.minusMonths(8);
		LocalDate proximos_meses_LocalDate = d01.plusMonths(2);
			
		System.out.println("semana_Passada_LocalDate = " + semana_Passada_LocalDate);
		System.out.println("proxima_Semana_LocalDate = " + proxima_Semana_LocalDate);
		System.out.println("meses_Passados_LocalDate = " + meses_Passados_LocalDate);
		System.out.println("proximos_meses_LocalDate = " + proximos_meses_LocalDate);
		System.out.println("ano_Passado_LocalDate = " + ano_Passado_LocalDate);
		System.out.println("proximos_anos_LocalDate = " + proximos_anos_LocalDate);
		
		System.out.println("-----------------------------------------------------------");
		
		LocalDateTime semana_Passada_LocalDateTime = d02.minusDays(7);
		LocalDateTime proxima_Semana_LocalDateTime = d02.plusDays(7);
		LocalDateTime ano_Passado_LocalDateTime = d02.minusYears(1);
		LocalDateTime proximos_anos_LocalDateTime = d02.plusYears(3);
		LocalDateTime meses_Passados_LocalDateTime = d02.minusMonths(8);
		LocalDateTime proximos_meses_LocalDateTime = d02.plusMonths(2);
		
		System.out.println("semana_Passada_LocalDateTime = " + semana_Passada_LocalDateTime);
		System.out.println("proxima_Semana_LocalDateTime = " + proxima_Semana_LocalDateTime);
		System.out.println("meses_Passados_LocalDateTime = " + meses_Passados_LocalDateTime);
		System.out.println("proximos_meses_LocalDateTime = " + proximos_meses_LocalDateTime);
		System.out.println("ano_Passado_LocalDateTime = " + ano_Passado_LocalDateTime);
		System.out.println("proximos_anos_LocalDateTime = " + proximos_anos_LocalDateTime);
		
		System.out.println("-----------------------------------------------------------");
		
		Instant semana_Passada_Instant = d03.minus(7, ChronoUnit.DAYS);
		Instant proxima_Semana_Instant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("semana_Passada_Instant = " + semana_Passada_Instant);
		System.out.println("proxima_Semana_Instant = " + proxima_Semana_Instant);
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("DURAÇÕES DE TEMPO:");
		
		Duration t1 = Duration.between(semana_Passada_LocalDate.atStartOfDay(), d01.atStartOfDay());
		Duration t2 = Duration.between(semana_Passada_LocalDateTime, d02);
		Duration t3 = Duration.between(semana_Passada_Instant, d03);
		Duration t4 = Duration.between(d03, semana_Passada_Instant);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		System.out.println("t4 dias = " + t4.toDays());
	}

}
