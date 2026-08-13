package mvc.view;

import mvc.model.ProdukDiskon;

public class ProdukDiskonView {
    public void tampilkanProdukDiskon(ProdukDiskon pDiskon) {
        System.out.println("===Data Produk Diskon===");
        System.out.println("Nama Produk : " + pDiskon.getNamaProduk());
        System.out.println("Nama Kategori : " + pDiskon.getKategori());
        System.out.println("Harga Produk : " + pDiskon.getHarga());
        System.out.println("Jumlah Beli : " + pDiskon.getjumlahBeli());
        System.out.println("Diskon Kategori : " + pDiskon.getDiskonKategori() * 100 + "%");
        System.out.println("Diskon Jumlah : " + pDiskon.getDiskonJumlah() * 100 + "%");
        System.out.println("Total Diskon : "
                + String.format("%.1f", (pDiskon.getDiskonKategori() + pDiskon.getDiskonJumlah()) * 100));
        System.out.println("Total Bayar : "
                + String.format("%.1f", pDiskon.hitungTotalBayar()));

    }
}
