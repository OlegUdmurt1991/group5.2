package Lesson25.first;

import java.time.Instant;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

/*3) Посчитайте общее количество времени,
за которое выполняется программа из 1го задания
и выведите результат на экран.
Используйте класс по желанию.
Пример вывода:
Alltime - ms*/
public class Third {
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();
        GregorianCalendar now2 = new GregorianCalendar();
//Сравниваем первую и вторую дату и приводим их к миллисекундам
        double now3 = Duration.between(now.toZonedDateTime(), now2.toZonedDateTime()).toMillis();
        System.out.println(now3 + " - ms ");
    }
}







//    GregorianCalendar nowCalendar = new GregorianCalendar();
//    GregorianCalendar nowCalendar2 = new GregorianCalendar();
//    Duration GregCalendar = Duration.between(nowCalendar.toZonedDateTime(), nowCalendar2.toZonedDateTime());
//    long unixTime = System.currentTimeMillis() / 1000L ;
//
//
//
//        System.out.println(GregCalendar);