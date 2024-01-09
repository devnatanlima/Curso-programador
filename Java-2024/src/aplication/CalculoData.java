import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoData {
          public static void main(String[] args) {
                    LocalDate d04 = LocalDate.parse("2024-01-09");
                    LocalDateTime d05 = LocalDateTime.parse("2024-02-09T01:30:26");
                    Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

                    LocalDate pasteWeekLocalDate = d04.minusDays(7);
                    LocalDate nextWeekLocalDate = d04.plusDays(7);

                    System.out.println("pasteWeekLocalDate = " + pasteWeekLocalDate);
                    System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

                    LocalDateTime pasteWeekLocalDateTime = d05.minusDays(7);
                    LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

                    System.out.println("pasteWeekLocalDateTime = " + pasteWeekLocalDateTime);
                    System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

                    Instant pasteWeeInstant = d06.minus(7, ChronoUnit.DAYS);
                    Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

                    System.out.println("pasteWeekInstant = " + pasteWeeInstant);
                    System.out.println("nextWeekInstant = " + nextWeekInstant);

                    Duration t1 = Duration.between(pasteWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
                    Duration t2 = Duration.between(pasteWeekLocalDateTime, d05);
                    Duration t3 = Duration.between(pasteWeeInstant, d06);
                    System.out.println("t1 dias = " + t1.toDays());
                    System.out.println("t2 dias = " + t2.toDays());
                    System.out.println("t3 dias = " + t3.toDays());

          }

}
