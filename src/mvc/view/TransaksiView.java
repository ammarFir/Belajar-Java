package mvc.view;

import mvc.model.Transaksi;

public class TransaksiView {
    public void tampilkanTransaksi(Transaksi tampilTransaksi) {
        System.out.println("=== Data Transaksi ===");
        System.out.println("Nama Barang : " + tampilTransaksi.getNamaBarang());
        System.out.println("Jumlah : " + tampilTransaksi.getjumlah());
        System.out.println("Harga Satuan : " + tampilTransaksi.getHargaSatuan());
        System.out.println("Metode Bayar : " + tampilTransaksi.getMetodeBayar());
        System.out.println("Subtotal : " + String.format("%.1f", tampilTransaksi.hitungSubTotal()));
        System.out.println("Pajak (11%) : " + String.format("%.1f", tampilTransaksi.hitungPajak()));
        System.out.println("Diskon (2%) : " + String.format("%.1f", tampilTransaksi.getDiskon()));
        System.out.println("Total Bayar : " + String.format("%.1f", tampilTransaksi.hitungTotalBayar()));
    }
}
