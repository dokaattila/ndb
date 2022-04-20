package com.da.nbd;

import java.time.LocalDate;

public class Util {

    public static String convertDate() {
        String dateString;
        String day;
        String month;
        LocalDate actualDate = LocalDate.now();
        if (actualDate.getMonthValue() < 10) {
            month = "0" + actualDate.getMonthValue();
        } else {
            month = String.valueOf(actualDate.getMonthValue());
        }
        if (actualDate.getDayOfMonth() < 10) {
            day = "0" + actualDate.getDayOfMonth();
        } else {
            day = String.valueOf(actualDate.getDayOfMonth());
        }
        dateString = month + "." + day;
        return dateString;
    }
}
