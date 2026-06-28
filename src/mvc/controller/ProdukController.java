package mvc.controller;

import mvc.model.Produk;
import mvc.view.ProdukView;

//ambil 2 hirarki yaitu model dan viewnya

public class ProdukController {
    public void tampilkanProduk() {
        // isi data (object) menggunakan constructor
        Produk produk = new Produk("Laptop Gaming", 15000, 10);

        // set ubah stok
        produk.setStok(20);

        ProdukView produkView = new ProdukView();

        produkView.tampilkanProduk(produk);
    }
}
