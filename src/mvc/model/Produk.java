package mvc.model;

//1. model adalah blueprint awal dari strktur mvc 
public class Produk {
    // deklarasi variable sebagai wadah utama
    private String namaProduk;
    private double harga;
    private int stok;

    // variable2 diatas dijadikan constructor agar lebih enak dipanggil
    public Produk(String namaProduk, double harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;

    }

    // getter // mengambil data
    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

}
