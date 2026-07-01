package mvc.view;

import mvc.model.Mobil;

public class MobilView {

    public void tampilkanMobil(Mobil mobil) {
        System.out.println("Masukkan merk mobil : " + mobil.getMerk());
        System.out.println("Masukkan tahun mobil : " + mobil.getTahun());
        System.out.println("Masukkan kecepatan mobil : " + mobil.getKecepatan());
    }
}
