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

        double hargaDiskon = 0;
        if (rating == 5) {
            hargaDiskon = harga * 20 / 100;
        } else if (rating == 4) {
            hargaDiskon = harga * 10 / 100;
        } else if (rating <= 3) {
            hargaDiskon = harga;
        }

        return harga - hargaDiskon;
    }
}
