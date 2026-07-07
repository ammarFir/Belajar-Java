package mvc.model;

public class MenuRestoran {
    private String namaMenu;
    private double harga;
    private int rating;

    public MenuRestoran(String namaMenu, double harga, int rating) {
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.rating = rating;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public double getHarga() {
        return harga;
    }

    public int getRating() {
        return rating;
    }

    public void setNamaMenu(String namaMenu) {
        this.namaMenu = namaMenu;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double hitungDiskon() {

        if (rating == 5) {
            harga = (20 * 100) / harga;
        } else if (rating == 4) {
            harga = (10 * 100) / harga;
        } else if (rating <= 3) {
            harga = harga;
        }

        return harga;
    }
}
