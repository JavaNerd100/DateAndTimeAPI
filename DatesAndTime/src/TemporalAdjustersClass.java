import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersClass {

    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.now();

        System.out.println(ld1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
        System.out.println(ld1.with(TemporalAdjusters.lastDayOfMonth()));
        System.out.println(ld1.with(TemporalAdjusters.firstDayOfYear()).getDayOfWeek());
        System.out.println(ld1.with(TemporalAdjusters.lastDayOfYear()).getDayOfWeek());

        System.out.println(ld1.withMonth(8).withDayOfMonth(1));
    }
}
