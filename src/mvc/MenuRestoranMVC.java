package mvc;

import mvc.controller.MenuRestoranController;

public class MenuRestoranMVC {
    public static void main(String[] args) {
        MenuRestoranController mController = new MenuRestoranController();
        mController.tampilkanMenu();
    }
}
