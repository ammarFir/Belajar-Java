package mvc.model;

public class Mobil {
    private String merk, nama;
    private int tahun, kecepatan;

    private Mobil(String merk, String nama, int tahun, int kecepatan) {
        this.merk = merk;
        this.nama = nama;
        this.tahun = tahun;
        this.kecepatan = kecepatan;
    }

    public String getMerk() {
        return merk;
    }

    public String getNama() {
        return nama;
    }

    public int getTahun() {
        return tahun;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setMerk(int kecepatan) {
        this.kecepatan = kecepatan;
    }

}
