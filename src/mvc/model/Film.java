package mvc.model;

public class Film {
    // deklarasi variable
    private String judul, sutradara;
    private int tahun;

    // constructor
    public Film(String judul, String sutradara, int tahun) {
        this.judul = judul;
        this.sutradara = sutradara;
        this.tahun = tahun;
    }

    // getter
    public String getJudul() {
        return judul;
    }

    public String getSutradara() {
        return sutradara;
    }

    public int getTahun() {
        return tahun;
    }

    // setter
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

}
