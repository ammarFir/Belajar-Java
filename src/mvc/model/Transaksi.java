package mvc.model;

public class Transaksi {
    private String namaBarang;
    private int jumlah;
    private double hargaSatuan;
    private String metodeBayar;

    public Transaksi(String namaBarang, int jumlah, double hargaSatuan, String metodeBayar) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.hargaSatuan = hargaSatuan;
        this.metodeBayar = metodeBayar;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getjumlah() {
        return jumlah;
    }

    public double getHargaSatuan() {
        return hargaSatuan;
    }

    public String getMetodeBayar() {
        return metodeBayar;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setHargaSatuan(double hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public void setMetodeBayar(String metodeBayar) {
        this.metodeBayar = metodeBayar;
    }
}
