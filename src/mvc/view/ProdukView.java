package mvc.view;

import mvc.model.Produk;

//2. view = merupakan tools pencetak namun berfungsi nanti , mencetak 3 variable
public class ProdukView {

    public void tampilkanProduk(Produk produk) {
        System.out.println("Nama Produk : " + produk.namaProduk);
        System.out.println("Harga Produk : " + produk.harga);
        System.out.println("Stok Produk : " + produk.stok);
    }
}
