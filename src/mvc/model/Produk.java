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

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void setHarga(double harga) {
        if (harga < 0) {
            System.out.println("Harga Tidak bisa  negatif");
        } else {
            this.harga = harga;
        }
    }

    public void setStok(int stok) {
        if (stok < 0) {
            System.out.println("stok tidak boleh negatif");
        } else {
            this.stok = stok;
        }
    }

}
