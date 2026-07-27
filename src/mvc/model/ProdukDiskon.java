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

        double diskonKategori = 0;
        if (kategori.equals("Elektronik")) {
            diskonKategori = 0.1;
        } else if (kategori.equals("Pakaian")) {
            diskonKategori = 0.05;
        } else if (kategori.equals("Makanan")) {
            diskonKategori = 0.03;
        }

        double diskonJumlah = 0;
        if (jumlahBeli >= 10) {
            diskonJumlah = 0.05;
        } else if (jumlahBeli >= 5) {
            diskonJumlah = 0.03;
        }

        double totalDiskon = diskonKategori + diskonJumlah;
        double totalBayar = harga * jumlahBeli * (1 - totalDiskon);

        return totalBayar;
    }

    public double getDiskonKategori() {
        double diskonKategori = 0;
        if (kategori.equals("Elektronik")) {
            diskonKategori = 0.1;
        } else if (kategori.equals("Pakaian")) {
            diskonKategori = 0.05;
        } else if (kategori.equals("Makanan")) {
            diskonKategori = 0.03;
        }

        return diskonKategori;

    }

    public double getDiskonJumlah() {
        double diskonJumlah = 0;
        if (jumlahBeli >= 10) {
            diskonJumlah = 0.05;
        } else if (jumlahBeli >= 5) {
            diskonJumlah = 0.03;
        }

        return diskonJumlah;
    }
}
