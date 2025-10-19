package app.utils;

import app.utils.formatters.Formatter;

public class Printer {

    public static void println(String message) {
        System.out.println(message);
    }

    public static void println(Formatter formatter) {
        System.out.println(formatter.getFormattedResult());
    }
}
