import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodAndDuration {

    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2024, 1, 1);
        LocalDate ld2 = LocalDate.of(2026, 6, 29);
        System.out.println(ld2.equals(ld1));
        System.out.println(ld2.compareTo(ld1));

        LocalTime lt1= LocalTime.of(10, 1);
        LocalTime lt2 = LocalTime.of(20, 55,29);
        System.out.println(lt2.equals(lt1));
        System.out.println(lt2.compareTo(lt1));

        LocalDateTime ldt1 = LocalDateTime.of(ld1,lt1);
        LocalDateTime ldt2 = LocalDateTime.of(ld2,lt2);
        System.out.println(ldt1.equals(ldt2));
        System.out.println(ldt1.compareTo(ldt2));

        Period diff = Period.between(ld1, ld2);
        System.out.println(diff);
        System.out.printf("%dyears %dmonths %ddays%n",diff.getYears(),diff.getMonths(),diff.getDays());


        Duration diffTime = Duration.between(lt1, lt2);
        System.out.println(diffTime);
        System.out.printf("%dhour %dminute %second%n",diffTime.toHoursPart(),diffTime.toMinutesPart(),diffTime.toSecondsPart());

    }
}
