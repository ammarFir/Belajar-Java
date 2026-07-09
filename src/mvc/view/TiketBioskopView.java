package mvc.view;

import mvc.model.TiketBioskop;

public class TiketBioskopView {
    public void tampilkanTiket(TiketBioskop tBioskop) {
        System.out.print("===Data Tiket===");
        System.out.print("Film : " + tBioskop.getFilm());
        System.out.print("Hari : " + tBioskop.getHari());
        System.out.print("Jam : " + tBioskop.getJam());
        System.out.print("Harga Awal : " + tBioskop.getHarga());
        System.out.print("Harga Akhir " + tBioskop.hitungHargaAkhir());
    }
}
