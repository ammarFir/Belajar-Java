package mvc.model;

public class BukuArrayList {
    private String judul, penulis;
    private int tahun;

    public BukuArrayList(String judul, String penulis, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }
    // constructor iyalah cetakan
    // blueprint untuk nanti data2 dari object itu bisa berbeda2

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahun() {
        return tahun;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

}
