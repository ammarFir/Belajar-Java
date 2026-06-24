package mvc.controller;

import mvc.model.Mahasiswa;
import mvc.view.MahasiswaView;

public class MahasiswaController {

    public void tampilkanMahasiswa() {
        Mahasiswa mhs = new Mahasiswa();
        MahasiswaView mView = new MahasiswaView();

        mhs.nama = "Udin";
        mhs.umur = 25;
        mhs.jurusan = "Kesehatan";

        mView.tampilkanData(mhs);

    }
}
