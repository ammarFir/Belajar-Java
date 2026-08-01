package mvc.controller;

import mvc.model.ProdukDiskon;
import mvc.view.ProdukDiskonView;
import java.util.Scanner;

public class ProdukDiskonController {

    public void tampilkanProdukDiskon() {
        Scanner input = new Scanner(System.in);

        // iterasi nama produk
        String namaProduk;
        do {
            System.out.println("Masukkan nama produk : ");
            namaProduk = input.nextLine();

            if (namaProduk.trim().equals("")) {
                System.out.println("Nama Produk Tidak Boleh Kosong");
            }

        } while (namaProduk.trim().equals(""));

        // iterasi kategori
        String[] kategoriValid = { "Elektronik", "Pakaian", "Makanan" };
        String kategori;
        Boolean valid;
        do {
            valid = false;
            System.out.println("Masukkan kategori produk : ");
            kategori = input.nextLine();

            for (int i = 0; i < kategoriValid.length; i++) {
                if (kategori.equalsIgnoreCase(kategoriValid[i])) {
                    kategori = kategoriValid[i];
                    valid = true;
                }
            }
        } while (!valid);

        double harga;
        do {
            System.out.println("Masukkan harga : ");
            harga = input.nextDouble();

            if (harga < 1000) {
                System.out.println("Harga minimal 1000 !");
            }
        } while (harga < 1000);

        int jumlahBeli;
        do {
            System.out.println("Masukkan jumlah : ");
            jumlahBeli = input.nextInt();

            if (jumlahBeli < 1) {
                System.out.println("Minimal beli 1 !");
            }
        } while (jumlahBeli < 1);

        ProdukDiskon mProdukDiskon = new ProdukDiskon(namaProduk, kategori, harga, jumlahBeli);
        ProdukDiskonView pDiskonView = new ProdukDiskonView();
        pDiskonView.tampilkanProdukDiskon(mProdukDiskon);
        input.close();
    }

}
