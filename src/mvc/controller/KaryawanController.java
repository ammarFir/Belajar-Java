package mvc.controller;

import mvc.model.Karyawan;
import mvc.view.KaryawanView;

public class KaryawanController {

    public void tampilkanData() {

        // buat object
        Karyawan karyawan = new Karyawan("Nanda", 23, 6000000);

        // set / ubah datanya memanggil setter
        karyawan.setGajiKaryawan(7500000);

        // buat object untuk view agar viewnya bisa dipanggil
        KaryawanView karyawanView = new KaryawanView();
        karyawanView.tampilkanData(karyawan);

    }
}
