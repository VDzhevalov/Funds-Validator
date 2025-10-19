package app.utils.formatters;

import app.enums.Currency;

public class CurrencyTitleFormatter implements Formatter {
    private final String format;

    public CurrencyTitleFormatter() {
        StringBuilder format = new StringBuilder().append("Choose account currency: ");
        int counter = 0;
        for (Currency curr : Currency.values()) {
            format.append("\n").append(++counter).append(": ").append(curr.name());
        }
        this.format = format.toString();
    }

    @Override
    public String getFormattedResult() {
        return format;
    }
}
