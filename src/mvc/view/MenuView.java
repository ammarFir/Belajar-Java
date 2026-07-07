package mvc.view;

import mvc.model.MenuRestoran;

public class MenuView {
    public void tampilkanMenu(MenuRestoran menu) {
        System.out.print("=== Data Menu");
        System.out.print("Nama Menu : " + menu.getNamaMenu());
        System.out.print("Harga : " + menu.getHarga());
        System.out.print("Rating : " + menu.getHarga());
        System.out.print("Harga Setelah Diskon : " + menu.hitungDiskon());
    }
}
