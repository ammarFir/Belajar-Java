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

    }
}
