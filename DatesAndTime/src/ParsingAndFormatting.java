import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static java.util.stream.Collectors.summingLong;

public class ParsingAndFormatting {

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");
    private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a", Locale.ENGLISH);

    public static void main(String[] args) {

        record Person(String firstName, String lastName, long salary , String state, char gender, LocalDate birthDate, LocalTime birthTime){

            long getAge(){
               return Period.between(birthDate,LocalDate.now()).getYears();
            }

            String getDOBAsText(){
                return dateFormatter.format(birthDate);
            }

            String getBirthTimeAsText(){
                return timeFormatter.format(birthTime);
            }

            LocalDateTime getCompleteDateAndTime(){
                return LocalDateTime.of(birthDate,birthTime);
            }
        }

        try {
            long startTime = System.currentTimeMillis();
          //  Long result =
                    Files.lines(Path.of("/Users/gouravthakur/Downloads/Gourav/Developer/AdvancedStreamStuff/Hr5m.csv"))
                    .skip(1)
                    .limit(2000)
                    .map(string -> string.split(","))
                    .map(array -> new Person(array[2],array[4],Long.parseLong(array[25]),array[32],array[5].strip().charAt(0),
                            LocalDate.parse(array[10], dateFormatter),
                            LocalTime.parse(array[11], timeFormatter)))
                    .filter(p -> p.getAge()<25)
                   .forEach(p->System.out.printf("%s,%s %s - %d%n",p.firstName,p.lastName,p.getDOBAsText(),p.getAge()));
                    //.count();
            //System.out.println(NumberFormat.getCurrencyInstance().format(result));
            long endTime = System.currentTimeMillis();
           // System.out.printf("$%,d.00%n",result);
           // System.out.println(result);
            System.out.println(endTime-startTime);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
