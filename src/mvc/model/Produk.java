package mvc.model;

//1. model adalah blueprint awal dari strktur mvc 
public class Produk {
    // deklarasi variable sebagai wadah utama
    public String namaProduk;
    public double harga;
    public int stok;

    // variable2 diatas dijadikan constructor agar lebih enak dipanggil
    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;

    }
}
