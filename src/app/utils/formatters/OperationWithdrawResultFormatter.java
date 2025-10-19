package app.utils.formatters;

import app.entity.Account;

public class OperationWithdrawResultFormatter implements Formatter {
    private final String format;

    public OperationWithdrawResultFormatter(Account account) {
        format = String.format("Funds are OK. Purchase paid." +
                "%nBalance is %s %.2f", account.getCurrency(), account.getBalance());
    }

    @Override
    public String getFormattedResult() {
        return format;
    }
}
