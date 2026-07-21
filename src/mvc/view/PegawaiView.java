package mvc.view;

import mvc.model.Pegawai;

public class PegawaiView {

    public void tampilkanData(Pegawai pegawai) {
        System.out.println("===Data Pegawai===");
        System.out.println("Nama : " + pegawai.getNama());
        System.out.println("NIP : " + pegawai.getNip());
        System.out.println("Gaji Pokok : " + pegawai.getGajiPokok());
        System.out.println("Jam Lembur : " + pegawai.getJamLembur());
        System.out.println("Gaji Lembur : " + pegawai.getJamLembur() * 50000);
        System.out.println("Pajak (5%) : " + (pegawai.getGajiPokok() + pegawai.getJamLembur() * 50000) * 0.05);
        System.out.println("Gaji Bersih : " + pegawai.hitungGajiBersih());
    }
}
