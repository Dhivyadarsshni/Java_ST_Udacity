package module5CommonTypes.datesandcalendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMethodsDemo {
    public static void main(String[] args) {

        // Create Calendar object
        Calendar cal = Calendar.getInstance();

        // 1️⃣ get()
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH); // 0-based
        int day = cal.get(Calendar.DAY_OF_MONTH);

        System.out.println("Current Date: " + day + "/" + (month + 1) + "/" + year);

        // 2️⃣ set(int field, int value)
        cal.set(Calendar.YEAR, 2026);
        System.out.println("After setting year: " + cal.get(Calendar.YEAR));

        // 3️⃣ set(year, month, day)
        cal.set(2025, Calendar.SEPTEMBER, 23);
        System.out.println("After setting full date: " + cal.getTime());

        // 4️⃣ add()
        cal.add(Calendar.DAY_OF_MONTH, 5);
        System.out.println("After adding 5 days: " + cal.getTime());

        // 5️⃣ roll()
        cal.roll(Calendar.DAY_OF_MONTH, 5);
        System.out.println("After rolling 5 days: " + cal.getTime());

        // 6️⃣ getTime()
        Date dateObj = cal.getTime();
        System.out.println("Calendar converted to Date: " + dateObj);

        // 7️⃣ setTime(Date)
        Date newDate = new Date();
        cal.setTime(newDate);
        System.out.println("Calendar set using Date: " + cal.getTime());
    }
}

