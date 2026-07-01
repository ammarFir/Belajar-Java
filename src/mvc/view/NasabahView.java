package mvc.view;

import mvc.model.Nasabah;

public class NasabahView {

    public void tampilkanData(Nasabah nasabah) {
        System.out.println("Nama : " + nasabah.getNama());
        System.out.println("No rekening : " + nasabah.getNoRekening());
        System.out.printf("Saldo : " + nasabah.getSaldo());
    }
}
