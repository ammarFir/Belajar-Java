package mvc.view;

import mvc.model.Nasabah;

public class NasabahView {

    public void tampilkanData(Nasabah nasabah) {
        System.out.println("Masukkan nama : " + nasabah.getNama());
        System.out.println("Masukkan no rekening : " + nasabah.getNoRekening());
        System.out.println("Masukkan saldo : " + nasabah.getSaldo());
    }
}
