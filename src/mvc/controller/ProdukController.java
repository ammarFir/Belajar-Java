package mvc.controller;

import mvc.model.Produk;
import mvc.view.ProdukView;

public class ProdukController {
    public void tampilkanProduk() {
        Produk produk = new Produk("Minyak Syawits", 20000, 100);
        ProdukView produkView = new ProdukView();

        produkView.tampilkanProduk(produk);
    }
}
