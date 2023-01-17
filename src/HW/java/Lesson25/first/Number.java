package Lesson25.first;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Number {
    public static void main(String[] args) {
        // Класс Data
        LocalDateTime startDate = LocalDateTime.now();//Входная точка для для 3 задания
        Date dayMyBirthdayDate = new Date(91, 7, 8, 6, 15, 49); // Инициализируем объект Date с заданной датой
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(dayMyBirthdayDate)); // Зад-е 1
        System.out.println(new SimpleDateFormat("yy-MM-dd-EE").format(dayMyBirthdayDate)); // Зад-е 1
        System.out.println(new SimpleDateFormat("yy-MM-dd-EE-HH").format(dayMyBirthdayDate)); // Зад-е 1
        System.out.println(new SimpleDateFormat("yy-MM-dd-EE-HH-mm-ss").format(dayMyBirthdayDate)); // Зад-е 1
        System.out.println(new SimpleDateFormat().format(dayMyBirthdayDate)); // Зад-е 1
        LocalDateTime endDate = LocalDateTime.now();//Выходная точка для для 3 задания
        Duration diffStartDateEndDate = Duration.between(startDate, endDate);
        Date nowDate = new Date();
        Duration dayMyBirthdayDiffNowDate = Duration.ofMillis(nowDate.getTime() - dayMyBirthdayDate.getTime());
        System.out.println("Разница м/у ДР и тек. датой в формате Date: " + dayMyBirthdayDiffNowDate ); //Зад-е 2
        System.out.println("Время, за которое выполняется программа из 1го задания по классу Date: "
                + diffStartDateEndDate + '\n' + '\n'); //Зад-е 3 и4

// Класс LocalDate
        LocalDateTime startLocalDate = LocalDateTime.now(); //Входная точка для для 3 задания
        LocalDate dayMyBirthdayLocalDate = LocalDate.of(1991, 8, 8);
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(dayMyBirthdayLocalDate));
        System.out.println(DateTimeFormatter.ISO_DATE.format(dayMyBirthdayLocalDate));
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(dayMyBirthdayLocalDate));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(dayMyBirthdayLocalDate));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(dayMyBirthdayLocalDate));
        LocalDateTime endLocalDate = LocalDateTime.now(); //Выходная точка для для 3 задания
        Duration difStartLDandLD = Duration.between(startLocalDate, endLocalDate);
        LocalDate nowLocalDate = LocalDate.now();
        long difMyBirthdayLDNowLocalDate = ChronoUnit.DAYS.between(dayMyBirthdayLocalDate, nowLocalDate);
        System.out.println("Разница между текущей датой и ДР в днях по классу LocalDate:  " + difMyBirthdayLDNowLocalDate );
        System.out.println("Время, за которое выполняется программа из 1го задания по классу LocalDate: " +
                difStartLDandLD + '\n' + '\n');

//Класс LocalDateTime
        LocalDateTime startLocalDateTime = LocalDateTime.now(); //Входная точка для для 3 задания
        LocalDateTime dayMyBirthdayLDT = LocalDateTime.of(1991, 8, 8, 16, 8, 34);
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(dayMyBirthdayLDT));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(dayMyBirthdayLDT));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(dayMyBirthdayLDT));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(dayMyBirthdayLDT));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(dayMyBirthdayLDT));
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(dayMyBirthdayLDT));
        LocalDateTime endLocalDateTime = LocalDateTime.now(); //Выходная точка для для 3 задания
        Duration difStartLDTEndLDT = Duration.between(startLocalDateTime, endLocalDateTime);
        LocalDateTime nowLocalDateTime = LocalDateTime.now();
        Duration difMyBirthdayLDTNowLDT = Duration.between(nowLocalDateTime, dayMyBirthdayLDT);
        System.out.println("Разница между текущей датой и ДР по классу LocalDateTime:  " + difMyBirthdayLDTNowLDT);
        System.out.println("Время, за которое выполняется программа из 1го задания по классу LocalDateTime: " +
                difStartLDTEndLDT + '\n' + '\n');

//Класс ZonedDateTime
        LocalDateTime startZonedDateTime = LocalDateTime.now(); //Входная точка для для 3 задания
        ZonedDateTime dayMyBirthdayZDT = ZonedDateTime.parse("1991-08-08T15:45:00Z[Europe/Moscow]");
        System.out.println(DateTimeFormatter.BASIC_ISO_DATE.format(dayMyBirthdayZDT));
        System.out.println(DateTimeFormatter.ISO_INSTANT.format(dayMyBirthdayZDT));
        System.out.println(DateTimeFormatter.ISO_DATE.format(dayMyBirthdayZDT));
        System.out.println(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(dayMyBirthdayZDT));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(dayMyBirthdayZDT));
        LocalDateTime endZonedDateTime = LocalDateTime.now(); //Выходная точка для для 3 задания
        Duration difStartZDTEndZDT = Duration.between(startZonedDateTime, endZonedDateTime);
        ZonedDateTime nowZDT = ZonedDateTime.now();
        Duration difMyBirthdayZDTNowZDT = Duration.between(nowZDT, dayMyBirthdayZDT);
        System.out.println("Разница между текущей датой и ДР по классу ZonedDateTime:  " + difMyBirthdayZDTNowZDT);
        System.out.println("Время, за которое выполняется программа из 1го задания по классу ZonedDateTime: " +
                difStartZDTEndZDT + '\n' + '\n');

//Класс GregorianCalendar
        LocalDateTime startGregCal = LocalDateTime.now(); //Входная точка для для 3 задания
        GregorianCalendar dayMyBirthdayGregCal = new GregorianCalendar(1991, 7, 8, 04, 15, 45);
        System.out.println(dayMyBirthdayGregCal.getTime());
        System.out.println(dayMyBirthdayGregCal.toZonedDateTime());
        System.out.println(DateTimeFormatter.ISO_DATE.format(dayMyBirthdayGregCal.toZonedDateTime()));
        System.out.println(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(dayMyBirthdayGregCal.toZonedDateTime()));
        System.out.println(DateTimeFormatter.ISO_INSTANT.format(dayMyBirthdayGregCal.toZonedDateTime()));
        LocalDateTime endGregCal = LocalDateTime.now(); //Выходная точка для для 3 задания
        Duration difStartGregCalEndGregCal = Duration.between(startGregCal,endGregCal);
        GregorianCalendar nowGregCal = new GregorianCalendar ();
        Duration difMyBirthdayNowGrecCal = Duration.between(nowGregCal.toZonedDateTime(), dayMyBirthdayGregCal.toZonedDateTime());
        System.out.println("Разница между текущей датой и ДР по классу GregorianCalendar  " + difMyBirthdayNowGrecCal );
        System.out.println("Время, за которое выполняется программа из 1го задания по классу GregorianCalendar: " +
                difStartGregCalEndGregCal + '\n' + '\n');









        // задание 3 и 4







//        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(dayMyBirthdayDate));(это для локалдате и локал дате тайм и к зонаду(но не точно)) все остальные через dateformat
        //duration будет везде
    }
}
