package mvc.model;

public class TiketBioskop {

    public String film, hari;
    public int jam;
    public double harga;

    public TiketBioskop(String film, String hari, int jam, double harga) {
        this.film = film;
        this.hari = hari;
        this.jam = jam;
        this.harga = harga;
    }

    public String getFilm() {
        return film;
    }

    public String getHari() {
        return hari;
    }

    public int getJam() {
        return jam;
    }

    public double getHarga() {
        return harga;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double hitungHargaAkhir() {
        double diskon = 0;
        double diskonHari = 0;
        double diskonJam = 0;
        if (hari.equals("Senin") || hari.equals("Selasa") || hari.equals("Rabu")) {
            diskonHari = 0.1;
        } else if (hari.equals("Kamis") || hari.equals("Jumat")) {
            diskonHari = 0.05;
        } else if (hari.equals("Sabtu") || hari.equals("Minggu")) {
            diskonHari = 0;
        }

        if (jam >= 12 && jam <= 16) {
            diskonJam = 0.05;
        } else {
            diskonJam = 0;
        }

        diskon = diskonHari + diskonJam;

        harga = harga - (harga * diskon);
        return harga;
    }

}
