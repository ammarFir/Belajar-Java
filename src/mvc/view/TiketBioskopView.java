package mvc.view;

import mvc.model.TiketBioskop;

public class TiketBioskopView {
    public void tampilkanTiket(TiketBioskop tBioskop) {
        System.out.println("===Data Tiket===");
        System.out.println("Film : " + tBioskop.getFilm());
        System.out.println("Hari : " + tBioskop.getHari());
        System.out.println("Jam : " + tBioskop.getJam());
        System.out.println("Harga Awal : " + tBioskop.getHarga());
        System.out.println("Harga Akhir " + tBioskop.hitungHargaAkhir());
    }
}
