package mvc.model;

public class ProdukDiskon {

    // deklarasi
    private String namaProduk, kategori;
    private double harga;
    private int jumlahBeli;

    // constructor
    public ProdukDiskon(String namaProduk, String kategori, double harga, int jumlahBeli) {
        this.namaProduk = namaProduk;
        this.kategori = kategori;
        this.harga = harga;
        this.jumlahBeli = jumlahBeli;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public String getKategori() {
        return kategori;
    }

    public double getHarga() {
        return harga;
    }

    public int getjumlahBeli() {
        return jumlahBeli;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    public double hitungTotalBayar() {
        System.out.println();
    }
}
