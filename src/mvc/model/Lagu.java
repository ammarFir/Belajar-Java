package mvc.model;

public class Lagu {
    // variable model
    private String judul, penyanyi;
    private int durasi;

    // consctructor
    public Lagu(String judul, String penyanyi, int durasi) {
        this.judul = judul;
        this.penyanyi = penyanyi;
        this.durasi = durasi;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenyanyi() {
        return penyanyi;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenyanyi(String penyanyi) {
        this.penyanyi = penyanyi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

}
