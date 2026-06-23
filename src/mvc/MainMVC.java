package mvc;

import mvc.model.Mahasiswa;
import mvc.view.MahasiswaView;

public class MainMVC {

    public static void main(String[] args) {

        // pembuatan object untuk assign data berupa umur dan nama
        Mahasiswa mhs = new Mahasiswa();

        // object untuk cetak
        MahasiswaView view = new MahasiswaView();

        // isi data object
        mhs.nama = " Ammar ";
        mhs.umur = 24;

        // cetak
        view.tampilkanData(mhs);
    }
}
