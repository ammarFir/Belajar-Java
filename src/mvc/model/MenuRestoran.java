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
}
