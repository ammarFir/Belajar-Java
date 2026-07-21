package mvc.view;

import mvc.model.Pegawai;

public class PegawaiView {

    public void tampilkanData(Pegawai pegawai) {
        System.out.println("===Data Pegawai===");
        System.out.println("Nama : " + pegawai.getNama());
        System.out.println("NIP : " + pegawai.getNip());
        System.out.println("Gaji Pokok : " + pegawai.getGajiPokok());
        System.out.println("Nama : " + pegawai.getJamLembur());
        System.out.println("Nama : " + pegawai.hitungGajiBersih(gajiLembur));
        System.out.println("Nama : " + pegawai.getNama());
    }
}
