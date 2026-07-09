package mvc.controller;

import mvc.model.MenuRestoran;
import mvc.view.MenuView;
import java.util.*;

public class MenuRestoranController {
    public void tampilkanMenu() {
        Scanner input = new Scanner(System.in);

        String menu;
        do {
            System.out.print("Masukkan nama menu : ");
            menu = input.nextLine();

            if (menu.trim().equals("")) {
                System.out.print("Nama Menu tidak boleh kosong !");
            }
        } while (menu.trim().equals(""));

        double harga;
        do {
            System.out.print("Masukkan harga menu : ");
            harga = input.nextDouble();

            if (harga <= 1000) {
                System.out.println("Harga tidak boleh <= 1000 ");
            }
        } while (harga <= 1000);

        int rating;
        do {
            System.out.print("Masukkan rating menu : ");
            rating = input.nextInt();

            if (rating < 1) {
                System.out.println("Rating harus > 0 !");
            }
            if (rating > 5) {
                System.out.println(" Rating harus <= 5");
            }
        } while (rating < 1 || rating > 5);

        MenuRestoran menuRestoran = new MenuRestoran(menu, harga, rating);

        MenuView menuView = new MenuView();
        menuView.tampilkanMenu(menuRestoran);
    }
}
