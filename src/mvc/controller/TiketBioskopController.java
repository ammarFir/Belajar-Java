package mvc.controller;

import mvc.model.TiketBioskop;
import mvc.view.TiketBioskopView;
import java.util.*;

public class TiketBioskopController {
    public void tampilkanTiket() {
        Scanner input = new Scanner(System.in);

        // iterasi film
        String film;
        do {
            System.out.print("Masukkan nama film : ");
            film = input.nextLine();

            if (film.trim().equals("")) {
                System.out.print("Nama Film Tidak Boleh Kosong !!!!");
            }
        } while (film.trim().equals(""));

        // iterasi hari
        String hariValid[] = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu" };
        String hari;
        Boolean valid;
        do {
            valid = false;
            System.out.print("Masukkan nama hari : ");
            hari = input.nextLine();

            for (int index = 0; index < hariValid.length; index++) {
                if (hari.equalsIgnoreCase(hariValid[index])) {
                    hari = hariValid[index];
                    valid = true;
                }
            }

        } while (!valid);

        // iterasi jam
        int jam;
        do {

            System.out.print("Masukkan jam : ");
            jam = input.nextInt();

            if (jam < 10) {
                System.out.println("Harus >= jam 10.00 ");
            }
            if (jam > 22) {
                System.out.println("Harus  <= jam 22.00 ");
            }

        } while (jam < 10 || jam > 22);
        // new
        double harga;
        do {
            System.out.print("Masukkan harga : ");
            harga = input.nextDouble();

            if (harga <= 25000) {
                System.out.print("Harga tidak boleh kosong ! ");
            }
        } while (harga <= 25000);

        TiketBioskop modelTiketBioskop = new TiketBioskop(film, hari, jam, harga);

        TiketBioskopView viewTiketBioskopView = new TiketBioskopView();
    }
}
