package mvc;

import mvc.controller.MahasiswaController;

public class MainMVC {

    public static void main(String[] args) {
        MahasiswaController mController = new MahasiswaController();
        mController.tampilkanMahasiswa();
    }
}
