package module5CommonTypes.datesandcalendar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class JavaTimeAllMethodsDemo {

    public static void main(String[] args) {

        // ===============================
        // 1️⃣ LocalDate (Date only)
        // ===============================

        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);

        // Creating a specific date
        LocalDate customDate = LocalDate.of(2025, 9, 30);
        System.out.println("Custom Date: " + customDate);

        // Getting values
        System.out.println("Year: " + today.getYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Month value: " + today.getMonthValue());
        System.out.println("Day: " + today.getDayOfMonth());

        // Adding / subtracting
        System.out.println("Plus 5 days: " + today.plusDays(5));
        System.out.println("Minus 1 month: " + today.minusMonths(1));
        System.out.println("Plus 2 years: " + today.plusYears(2));

        // With methods (replace value)
        System.out.println("Change day: " + today.withDayOfMonth(1));
        System.out.println("Change year: " + today.withYear(2030));

        // Comparisons
        System.out.println("Is today before custom date? " + today.isBefore(customDate));
        System.out.println("Is today after custom date? " + today.isAfter(customDate));
        System.out.println("Is equal? " + today.isEqual(customDate));

        // ===============================
        // 2️⃣ Period (difference between dates)
        // ===============================

        Period diff = Period.between(customDate, today);
        System.out.println("Difference: "
                + diff.getYears() + " years "
                + diff.getMonths() + " months "
                + diff.getDays() + " days");

        // ===============================
        // 3️⃣ LocalTime (Time only)
        // ===============================

        LocalTime nowTime = LocalTime.now();
        System.out.println("Current Time: " + nowTime);

        // Creating custom time
        LocalTime customTime = LocalTime.of(10, 30, 45);
        System.out.println("Custom Time: " + customTime);

        // Getting values
        System.out.println("Hour: " + nowTime.getHour());
        System.out.println("Minute: " + nowTime.getMinute());
        System.out.println("Second: " + nowTime.getSecond());

        // Add / subtract time
        System.out.println("Plus 2 hours: " + nowTime.plusHours(2));
        System.out.println("Minus 15 minutes: " + nowTime.minusMinutes(15));

        // ===============================
        // 4️⃣ LocalDateTime (Date + Time)
        // ===============================

        LocalDateTime currentDT = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentDT);

        LocalDateTime customDT = LocalDateTime.of(2025, 9, 30, 14, 20);
        System.out.println("Custom DateTime: " + customDT);

        // Add / subtract
        System.out.println("Plus 1 day: " + currentDT.plusDays(1));
        System.out.println("Minus 3 hours: " + currentDT.minusHours(3));

        // ===============================
        // 5️⃣ Formatting Date & Time
        // ===============================

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatted = currentDT.format(formatter);
        System.out.println("Formatted DateTime: " + formatted);

        // Parsing string to date
        LocalDate parsedDate =
                LocalDate.parse("23-09-2025", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Parsed Date: " + parsedDate);
    }
}
