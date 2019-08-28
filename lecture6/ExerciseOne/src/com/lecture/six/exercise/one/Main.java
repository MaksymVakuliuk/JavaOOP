//
//Ввести с консоли дату. Сравнить ее с текущей датой в
//системе. Вывести отличающиеся части (год, месяц) на
//экран.
//

//
//
//


package com.lecture.six.exercise.one;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private static Date enterData() {
        Scanner scanner = new Scanner(System.in);

        String dateText = "";
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Enter date in format \"dd.MM.yyyy\":");
        dateText = scanner.nextLine();

        try {
            date = sdf.parse(dateText);
        } catch (ParseException e) {
            System.out.println( e.toString() );
        }

        return date;
    }

    private static String differentSystemDateAndEnteredDate (Date systemDate, Date enteredDate) {

        StringBuilder differentDate = new StringBuilder();

        Calendar calendarSystemDate = Calendar.getInstance();
        Calendar calendarEnteredDate = Calendar.getInstance();

        calendarSystemDate.setTime(systemDate);
        calendarEnteredDate.setTime(enteredDate);

        if (calendarSystemDate.get(Calendar.DAY_OF_MONTH) != calendarEnteredDate.get(Calendar.DAY_OF_MONTH)) {
            differentDate.append( String.format("System day of month: %d , you entered day of month : %d\n",
                    calendarSystemDate.get(Calendar.DAY_OF_MONTH), calendarEnteredDate.get(Calendar.DAY_OF_MONTH) ) );
        }

        if (calendarSystemDate.get(Calendar.MONTH) != calendarEnteredDate.get(Calendar.MONTH)) {
            differentDate.append( String.format("System month: %d , you entered month : %d\n",
                    calendarSystemDate.get(Calendar.MONTH)+1, calendarEnteredDate.get(Calendar.MONTH)+1 ) );
        }

        if (calendarSystemDate.get(Calendar.YEAR) != calendarEnteredDate.get(Calendar.YEAR)) {
            differentDate.append( String.format("System year: %d , you entered year : %d\n",
                    calendarSystemDate.get(Calendar.YEAR), calendarEnteredDate.get(Calendar.YEAR) ) );
        }

        return  differentDate.toString();
    }

    public static void main(String[] args) {

        Date date;

        date = enterData();

        System.out.println(new SimpleDateFormat("dd/mm/yyyy").format(date));
        System.out.println(date.toString());
        System.out.println( differentSystemDateAndEnteredDate( new Date(System.currentTimeMillis()), date) );

    }
}
