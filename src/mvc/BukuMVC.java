package mvc;

import mvc.controller.BukuController;

public class BukuMVC {

    public static void main(String[] args) {
        // panggil controller jadikan object
        BukuController bController = new BukuController();
        bController.tampilkanBuku();

    }
}
