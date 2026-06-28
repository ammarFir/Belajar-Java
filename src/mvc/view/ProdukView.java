package mvc.view;

import mvc.model.Produk;

//2. view = merupakan tools pencetak namun berfungsi nanti , mencetak 3 variable
public class ProdukView {

    // fungsi yg berparemeter produk dari model , dan juga tidak akses langsung
    // variable
    // namun ambil dari get
    public void tampilkanProduk(Produk produk) {
        System.out.println("Nama Produk : " + produk.getNamaProduk());
        System.out.println("Harga Produk : " + produk.getHarga());
        System.out.println("Stok Produk : " + produk.getStok());
    }
}
