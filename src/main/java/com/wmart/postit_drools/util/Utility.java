package com.wmart.postit_drools.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {
    public static String getConceptCode(String c) {
        return c;
    }

    public static boolean isDateBefore(String date) throws ParseException {
        Date validFrom = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        return validFrom.before(new Date());
    }

    public static boolean isDateAfter(String date) throws ParseException {
        Date validFrom = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        return validFrom.after(new Date());
    }
}
