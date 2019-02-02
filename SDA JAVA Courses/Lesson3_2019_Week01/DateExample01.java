package Lesson3_2019_Week01;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateExample01 {
    public static void main(String[] args){
        long timeStart = System.currentTimeMillis();
        System.out.println("Hello");
        long timeDelta = System.currentTimeMillis() - timeStart;
        System.out.println("It took " + timeDelta + "ms to say 'Hello' ");

        Date now = new Date(System.currentTimeMillis());
        System.out.println("Date now: " + now);
        System.out.println("--------A Bad Way--------------");
        System.out.println("Year: " + now.getYear());
        System.out.println("Month: " + now.getMonth());
        System.out.println("Day: " + now.getDay());

        Calendar cal = Calendar.getInstance();
        // User.getInstance
        System.out.println("-----A lot better Way--------------");
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + (cal.get(Calendar.MONTH) +1));
        System.out.println("Day: " + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day: " + cal.get(Calendar.DAY_OF_YEAR));
        System.out.println("Day: " + cal.get(Calendar.WEEK_OF_YEAR));

        cal.setTime(new Date(2019, 01, 5));
        System.out.println("Month: " + cal.get((Calendar.MONTH)));

        String someDate = "2009-01-09";
        LocalDate dateParsed = LocalDate.parse(someDate);
        System.out.println("Parsed month: "
                + dateParsed.getMonthValue()
                + " which is " + dateParsed.getMonth());
        LocalDate givenDate = LocalDate.of(2009, 9, 9);
        System.out.println("Given month: "
                + givenDate.getMonthValue()
                + " which is " + givenDate.getMonth());
        System.out.println(givenDate + " is before " + dateParsed + "?"
                + givenDate.isBefore(dateParsed));

        LocalTime parsedTime = LocalTime.parse("06:30");
        System.out.println("Parsed time is: " + parsedTime);

        LocalDateTime parsedDateTime = LocalDateTime.parse("2009-01-09T06:30");
        System.out.println("Parsed datetime is: " + parsedDateTime);
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Time +15min: " + LocalTime
                .now()
                .plusMinutes(15)
                .format(myFormat));

        // TIME ZONES

        ZoneId vilniusTimezone = ZoneId.of("Europe/Vilnius");
        ZoneId chinaTimezone = ZoneId.of("Asia/Shanghai");

        // LocalDateTime - this is the time if my computer
        // Instant - this is UTC (GMT, Greenwitch Time, GMT +0)
        // ZonedDate Time timeInChina = LocalDateTime().atZone(chinaTimezone);
        ZonedDateTime timeInChina = Instant.now().atZone(chinaTimezone);
        System.out.println("Time in China: " + timeInChina);

        LocalDate.now() .plusDays(5) ; // adds 5 days to today
        Period fiveDays = Period.ofDays(5);
        LocalDate.now().plus(fiveDays) ;

        int marysAge = Period.between(
                LocalDate.parse("1970-01-01"),
                LocalDate.now())
                .getYears();
        System.out.println("Mary is " + marysAge + " years old.");

        long timeTillTrain = Duration.between(
                LocalTime.now(),
                LocalTime.parse("17:50")
        ).getSeconds();
        System.out.println("Train at: " + LocalTime.now().plusSeconds(timeTillTrain));
        System.out.println("Seconds til train: " + timeTillTrain);

        long unixSeconds = Instant.now().getEpochSecond();
        long unixMillis = Instant.now().toEpochMilli();

        System.out.println("Unix Seconds: " + unixSeconds);
        System.out.println("Unix Milliseconds: " + unixMillis);



    }
}