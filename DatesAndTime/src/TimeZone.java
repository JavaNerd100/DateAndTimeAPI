import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone {

    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2024, 1, 1);
        LocalDate ld2 = LocalDate.of(2026, 6, 29);
//        System.out.println(ld2.equals(ld1));
//        System.out.println(ld2.compareTo(ld1));

        LocalTime lt1= LocalTime.of(10, 1);
        LocalTime lt2 = LocalTime.of(20, 55,29);
//        System.out.println(lt2.equals(lt1));
//        System.out.println(lt2.compareTo(lt1));

        LocalDateTime ldt1 = LocalDateTime.of(ld1,lt1);
        LocalDateTime ldt2 = LocalDateTime.of(ld2,lt2);
//        System.out.println(ldt1.equals(ldt2));
//        System.out.println(ldt1.compareTo(ldt2));


//        System.out.println(ZonedDateTime.of(ldt1, ZoneId.of("+8")));

        LocalDateTime sendingMessageTime = LocalDateTime.of(2024, 5, 7, 20, 00);
        //Japan GMT +9
        ZonedDateTime sentTime = ZonedDateTime.of(sendingMessageTime, ZoneId.of("+9"));
        System.out.println(sentTime.withZoneSameInstant(ZoneId.of("+0")));

    }
}
