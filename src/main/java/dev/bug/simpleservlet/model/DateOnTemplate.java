package dev.bug.simpleservlet.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateOnTemplate {

    private final String dateAsString;
    private final DateTimeFormatter format;

    public DateOnTemplate(String dateAsString, String format) {
        this.dateAsString = dateAsString;
        this.format = DateTimeFormatter.ofPattern(format, Locale.getDefault());
    }

    public void print() {
        System.out.println(convertToDate().format(format));
    }

    private LocalDate convertToDate() {
        return LocalDate.parse(dateAsString, format);
    }
}
