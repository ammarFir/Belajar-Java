package mvc.controller;

import mvc.model.Nasabah;
import mvc.view.NasabahView;
import java.util.Scanner;

public class NasabahController {
    public void tampilkanData() {
        Scanner input = new Scanner(System.in);

        String nama;
        do {
            System.out.print("Masukkan nama : ");
            nama = input.nextLine();
            input.nextLine();

            if (nama.trim().equals("")) {
                System.out.println("Nama tidak boleh kosong !");
            }
        } while (nama.trim().equals(""));
        input.close();

        // mengambil data
        Nasabah nasabah = new Nasabah(nama, nama, 0);
        // ambvil fungsi view
        NasabahView nView = new NasabahView();
        nView.tampilkanData(nasabah);

    }

}
