import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args){
        //Work with Dates & Times  using java
        //(LocalDate, LocalTime, LocalDateTime, UTC timestamp)

        LocalDate date= LocalDate.now();    //Gives local computer data
        System.out.println(date);

        LocalTime time= LocalTime.now();    //Gives local computer time
        System.out.println(time);

        LocalDateTime datetime= LocalDateTime.now();    //Gives local date and time
        System.out.println(datetime);

        Instant instant= Instant.now();     //UTC timestamp
        System.out.println(instant);

        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); //it gives time according to given pattern
        String newDateTime= datetime.format(formatter);
        System.out.println(newDateTime);

        LocalDate newDate= LocalDate.of(2019, 9, 4); //this simply print given date

        LocalDateTime DT1= LocalDateTime.of(2019, 9, 4, 12,0,0);
        LocalDateTime DT2= LocalDateTime.of(2020, 8, 5, 0,0,0);

        if (DT1.isBefore(DT2)){
            System.out.println(DT1+" is earlier than "+ DT2);
        }
        else if(DT1.isAfter(DT2)){
            System.out.println(DT1+" is after than "+ DT2);
        }
        else if(DT1.equals(DT2)){
            System.out.println("Both dates are equal");
        }

    }
}
