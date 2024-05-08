import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

public class DateAndTime {

    public static void main(String[] args) {
//        LocalDate now = LocalDate.now();
//        System.out.println(now.plusDays(5));
//        System.out.println(now.plus(3, ChronoUnit.YEARS));

        LocalDate newYears = LocalDate.of(2024, 1, 1);
 //       System.out.println(newYears.getDayOfWeek());
  //      System.out.println(LocalDate.now().getDayOfWeek());

//        newYears.datesUntil(LocalDate.now())
//                .forEach(System.out::println);

//        newYears.datesUntil(LocalDate.now(), Period.ofYears(1))
//                .forEach(System.out::println);


//        List<LocalDate> leapYear = LocalDate.now().datesUntil(LocalDate.now().plusYears(10), Period.ofYears(1))
//                .filter(LocalDate::isLeapYear)
//                .collect(Collectors.toList());
//        System.out.println(leapYear);

      //  System.out.println(LocalTime.now());


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
