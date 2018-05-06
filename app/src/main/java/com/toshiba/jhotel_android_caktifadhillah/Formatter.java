package com.toshiba.jhotel_android_caktifadhillah;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Formatter {
    static public String toCurrency(double ammount)
    {
        return NumberFormat.getCurrencyInstance(new Locale("id", "ID")).format(ammount);
    }

    static  public String toDate(String date)
    {
        return date.substring(0,10);
    }
}
