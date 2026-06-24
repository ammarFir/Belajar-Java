package mvc.controller;

import mvc.model.Mahasiswa;
import mvc.view.MahasiswaView;

public class MahasiswaController {

    public void tampilkanMahasiswa() {
        Mahasiswa mhs = new Mahasiswa("Udin", 24, "Farmasi");
        MahasiswaView mView = new MahasiswaView();

        mView.tampilkanData(mhs);

    }
}
