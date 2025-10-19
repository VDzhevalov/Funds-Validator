package app.utils.formatters;

import app.enums.OperationType;

public class OperationTitleFormatter implements Formatter {
    private final String format;

    public OperationTitleFormatter() {
        StringBuilder format = new StringBuilder().append("Choose operation type: ");
        int counter = 0;
        for (OperationType operation : OperationType.values()) {
            format.append("\n").append(++counter).append(": ").append(operation.name());
        }
        this.format = format.toString();
    }

    @Override
    public String getFormattedResult() {
        return format;
    }
}
