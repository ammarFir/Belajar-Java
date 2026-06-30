package mvc.controller;

import mvc.model.Nasabah;
import mvc.view.NasabahView;
import java.util.Scanner;

public class NasabahController {
    public void tampilkanData() {
        Scanner input = new Scanner(System.in);

        // validasi nama
        String nama;
        do {
            System.out.print("Masukkan nama : ");
            nama = input.nextLine();
            input.nextLine();

            if (nama.trim().equals("")) {
                System.out.println("Nama tidak boleh kosong !");
            }
        } while (nama.trim().equals(""));

        double saldo;
        do {
            System.out.print("Masukkan saldo anda :");
            saldo = input.nextDouble();
            input.nextLine();

            if (saldo < 100000) {
                System.out.println("Saldo harus diatas atau sama dengan 100.000");
            }
        } while (saldo < 100000);
        input.close();

        // mengambil data
        Nasabah nasabah = new Nasabah(nama, nama, saldo);
        // ambvil fungsi view
        NasabahView nView = new NasabahView();
        nView.tampilkanData(nasabah);
    }

}
