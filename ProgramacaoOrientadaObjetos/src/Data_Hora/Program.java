package Data_Hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner ( System.in);
		/* Data[hora]local:
		 ano-mês-dia-[hora] sem fuso horário ( hora é opcional )
		 
		 - LocalDate
		 - LocalDateTime
		 */
		
		
		
		/* Data-hora global:
		 ano-mês-dia-hora com fuso horário 
		 
		 - Insntant
		 
		 */
		
		
		/* Duração:
		  tempo decorrido entre duas data-horas 
		  
		  - Duration
		  
		  - Outros:
		  
		    Zoneld
		    ChronoUnit
		  
		  */
		
		
		// Instanciando ( instante atual sem hora ):
		LocalDate data= LocalDate.now();
		System.out.println("Data Atual:              " + data);
		// Instanciando ( instante atual com hora ):
		LocalDateTime dataComHora= LocalDateTime.now();
		System.out.println("Data Atual com hora:     " + dataComHora);
		// Instanciando ( instante atual com hora GNT ):
		Instant dataComHoraGnt = Instant.now();
		System.out.println("Data Atual com hora GNT: " + dataComHoraGnt);
		Instant dataHoraPadraoUtc = Instant.parse("2024-07-18T01:33:23Z");
		System.out.println("Data hora atual no padrão UTC: "+dataHoraPadraoUtc);
		// Instanciando uma data com um texto digitado
		LocalDate dataComTexto = LocalDate.parse("2024-12-31");
		System.out.println("Data com texto digitado: " + dataComTexto);
		// Instanciando uma data com hora em texto digitado
		LocalDateTime dataComTextoHora =LocalDateTime.parse("2024-12-31T03:33:33");
		System.out.println("Data com hora em texto digitado: " + dataComTextoHora);
		// formato padronizado
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate formatadoPrint = LocalDate.parse("20/07/2024", formato1);
		System.out.println(formatadoPrint);
		/*---------------------------------------------------------------*/
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime formato2Print = LocalDateTime.parse("07/12/2013 02:45", formato2);
		System.out.println(formato2Print);
		/* ------------------------------ */
		LocalDate dataIsolada = LocalDate.of(2024, 12, 13);
		System.out.println(dataIsolada);
		/* ------------------------------------ */
		LocalDateTime dataHoraIsolada = LocalDateTime.of(2024, 12, 13, 1,30);
		System.out.println(dataHoraIsolada);
		/* ------------------------------------------- */
		// pegando a data hora do computador do usuário
		DateTimeFormatter formato3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println(formato3.format(dataHoraPadraoUtc));
		
		/* Cálculo com data hora*/
		LocalDate dt = LocalDate.parse("2022-07-15");
		LocalDateTime dtH = LocalDateTime.parse("2022-07-15-20T01:30:26");
		Instant dtI = Instant.parse("2022-07-20T01:30:26Z");
		
		
		
		sc.close();

	}

}
