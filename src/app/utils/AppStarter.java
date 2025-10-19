package app.utils;

import static app.controller.FundController.createAccount;
import static app.controller.FundController.updateAccount;

public class AppStarter {

    public static void runApp() {
        updateAccount(createAccount());
    }
}
