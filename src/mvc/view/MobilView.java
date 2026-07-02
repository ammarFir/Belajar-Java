package mvc.view;

import mvc.model.Mobil;

public class MobilView {

    public void tampilkanMobil(Mobil mobil) {
        System.out.println("  --- DATA MOBIL ---  ");
        System.out.println("Merk : " + mobil.getMerk());
        System.out.println("Warna : " + mobil.getWarna());
        System.out.println("Tahun : " + mobil.getTahun());
        System.out.println("Kecepatan : " + mobil.getKecepatan() + "km/h");
    }
}
