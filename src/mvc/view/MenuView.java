package mvc.view;

import mvc.model.MenuRestoran;

public class MenuView {
    public void tampilkanMenu(MenuRestoran menu) {
        System.out.println("=== Data Menu ===");
        System.out.println("Nama Menu : " + menu.getNamaMenu());
        System.out.println("Harga : " + menu.getHarga());
        System.out.println("Rating : " + menu.getRating());
        System.out.println("Harga Setelah Diskon : " + menu.hitungDiskon());
    }
}
