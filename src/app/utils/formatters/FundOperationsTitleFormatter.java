package app.utils.formatters;

import app.entity.Account;

public class FundOperationsTitleFormatter implements Formatter {
    private final String format;

    public FundOperationsTitleFormatter(Account account) {
        format = String.format("Balance is %s %.2f.%n" +
                "Enter purchase amount, %s: ", account.getCurrency(), account.getBalance(), account.getCurrency());
    }

    @Override
    public String getFormattedResult() {
        return format;
    }
}
