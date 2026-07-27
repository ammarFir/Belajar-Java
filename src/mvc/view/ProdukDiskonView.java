package mvc.view;

import mvc.model.ProdukDiskon;

public class ProdukDiskonView {
    public void tampilkanProdukDiskon(ProdukDiskon pDiskon) {
        System.out.println("===Data Produk Diskon===");
        System.out.println("Nama Produk : " + pDiskon.getNamaProduk());
        System.out.println("Nama Kategori : " + pDiskon.getKategori());
        System.out.println("Harga Produk : " + pDiskon.getHarga());
        System.out.println("Jumlah Beli : " + pDiskon.getjumlahBeli());
        System.out.println("Diskon Kategori : " + pDiskon.getDiskonKategori());
        System.out.println("Diskon Jumlah : " + pDiskon.getDiskonJumlah());
        System.out.println("Total Diskon : " + pDiskon.getDiskonJumlah() + pDiskon.getDiskonKategori());
        System.out.println("Total Bayar : " + pDiskon.hitungTotalBayar());

    }
}
