package mvc.view;

import mvc.model.Karyawan;

public class KaryawanView {

    public void tampilkanData(Karyawan karyawan) {
        System.out.println("Nama Karyawan : " + karyawan.getNamaKaryawan());
        System.out.println("Umur Karyawan : " + karyawan.getUmurKaryawan());
        System.out.println("Gaji Karyawan : " + karyawan.getGajiKaryawan());
    }
}
