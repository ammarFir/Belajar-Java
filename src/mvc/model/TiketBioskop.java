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

}
