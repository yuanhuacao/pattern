package com.houbank.localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by Administrator on 2017/3/6.
 */
public class LocalDateAndTime {

    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today);
        LocalDate secondDayOfThisMonth=today.withDayOfMonth(2);
        System.out.println(secondDayOfThisMonth);
        LocalDate lastDayOfThisMonth=today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDayOfThisMonth);
        LocalDate tomorrow =today.plusDays(1);
        System.out.println(tomorrow);
        // 取2017年第一个星期1
        LocalDate firstMondayOf2017=LocalDate.parse("2017-01-01").with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println(firstMondayOf2017);

        // -- LocalTime

        LocalTime localTime=LocalTime.now().withNano(0);
        System.out.println(localTime);
        LocalTime zero=LocalTime.parse("00:00:00");
        System.out.println(zero);
        LocalTime mid=LocalTime.parse("12:00:01");
        System.out.println(mid);




    }
}
