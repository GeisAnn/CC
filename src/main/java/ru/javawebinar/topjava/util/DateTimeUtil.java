package ru.javawebinar.topjava.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static boolean isBetweenHalfOpen(LocalDateTime lt, LocalDate fromtDate, LocalDate toDate, LocalTime fromTime, LocalTime toTime) {
        LocalDateTime from = LocalDateTime.of(fromtDate, fromTime);
        LocalDateTime to = LocalDateTime.of(toDate, toTime);
        return !lt.isBefore(from) && lt.isBefore(to);
    }

    public static boolean isBetweenHalfOpen(LocalTime lt, LocalTime startTime, LocalTime endTime) {
        return !lt.isBefore(startTime) && lt.isBefore(endTime);
    }

    public static String toString(LocalDateTime ldt) {
        return ldt == null ? "" : ldt.format(DATE_TIME_FORMATTER);
    }
}
