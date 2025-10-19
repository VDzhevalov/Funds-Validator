package app.utils.formatters;

import app.entity.Account;

public class OperationDepositResultFormatter implements Formatter {
    private final String format;

    public OperationDepositResultFormatter(Account account) {
        format = String.format("Funds are OK. The purchase refunded." +
                "%nBalance is %s %.2f", account.getCurrency(), account.getBalance());
    }

    @Override
    public String getFormattedResult() {
        return format;
    }
}
