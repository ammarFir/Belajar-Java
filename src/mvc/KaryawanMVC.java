package mvc;

import mvc.controller.KaryawanController;

public class KaryawanMVC {
    public static void main(String[] args) {
        // buat object dari controller agar fungfsi bisa dipanggil
        KaryawanController karyawanController = new KaryawanController();
        karyawanController.tampilkanData();
    }
}
