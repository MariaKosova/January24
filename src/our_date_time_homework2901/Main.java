package our_date_time_homework2901;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    /*Получить и вывести на экран:
        -текущую дату
-текущий год, месяц и день
    Создать дату , например день рождения и вывести на экран
    Создать две даты и проверить на равенство
    Получить и вывести на экран текущее время
    текущее время + 3 часа
    Создать дату на неделю позже сегодняшней
    Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
    */
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Today is: " + localDate);
        LocalDate localDate1 = LocalDate.of(2024,1,29);
        System.out.println("Today is:" + localDate1);
        LocalDate localDate2 = LocalDate.of(1979,6,21);
        System.out.println("My birthday is :" + localDate2);
        LocalDate localDate3 =LocalDate.now();
        LocalDate localDate4 =LocalDate.of(2010,3,18);
        System.out.println("When we compare today's date and " + localDate4 +
                ", we see,  it is: " + localDate4.isEqual(localDate3));

        LocalTime localTime = LocalTime.now();
        System.out.println ("Now  it is: " + localTime);
        LocalTime currentTime =LocalTime.now();
        System.out.println("The current time plus 3 hours is: " +currentTime.plusHours(3));
        LocalDate dateOfToday = LocalDate.now();
        LocalDate dateInOneWeek = dateOfToday.plusWeeks(1);
        System.out.println("The date in one week will be: " + dateInOneWeek);
        LocalDate tomorrow = LocalDate.of(2024,1, 31);
        System.out.println( "Is tomorrow  after today? " + tomorrow.isAfter(LocalDate.now()));
        LocalDate yesterday =LocalDate.of(2024, 01,28);

        System.out.println(" Is yesterday after today? " + yesterday.isAfter(LocalDate.now()));

    }
}

