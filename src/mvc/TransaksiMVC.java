package mvc;

import mvc.controller.TransaksiController;

public class TransaksiMVC {
    public static void main(String[] args) {
        TransaksiController tController = new TransaksiController();
        tController.tampilkanTransaksi();
    }
}
