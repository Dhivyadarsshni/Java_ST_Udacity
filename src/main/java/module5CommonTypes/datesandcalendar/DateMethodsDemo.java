package module5CommonTypes.datesandcalendar;

import java.util.Date;

public class DateMethodsDemo {
    public static void main(String[] args) throws InterruptedException {

        // Create Date object
        Date d1 = new Date();
        System.out.println("Current Date: " + d1);

        // Pause to create time difference
        Thread.sleep(2000);

        Date d2 = new Date();
        System.out.println("New Date: " + d2);

        // getTime()
        System.out.println("Milliseconds of d1: " + d1.getTime());

        // before()
        System.out.println("d1 before d2? " + d1.before(d2));

        // after()
        System.out.println("d1 after d2? " + d1.after(d2));

        // equals()
        System.out.println("d1 equals d2? " + d1.equals(d2));

        // toString()
        System.out.println("String format: " + d1.toString());
    }
}
