package mvc.controller;

import mvc.model.Transaksi;
import mvc.view.TransaksiView;
import java.util.*;

public class TransaksiController {
    public void tampilkanTransaksi() {
        Scanner input = new Scanner(System.in);

        String namaBarang;
        do {
            System.out.print("Masukkan nama barang : ");
            namaBarang = input.nextLine();

            if (namaBarang.trim().equalsIgnoreCase("")) {
                System.out.println("Nama barang tidak boleh kosong !");
            }
        } while (namaBarang.trim().equalsIgnoreCase(""));

        int jumlahBarang;
        do {
            System.out.print("Masukkan jumlah barang : ");
            jumlahBarang = input.nextInt();

            if (jumlahBarang < 1) {
                System.out.println("Barang minimal 1 !");
            }
        } while (jumlahBarang < 1);

        double harga;
        do {
            System.out.print("Masukkan harga satuan : ");
            harga = input.nextDouble();

            if (harga < 1000) {
                System.out.println("Harga satuan Minimal 1000 !");
            }
        } while (harga < 1000);

        String metodeBayarValid[] = { "Tunai", "Transfer" };
        String metodePilihan;
        Boolean validasi;
        do {
            validasi = false;
            System.out.print("Masukkan metode bayar (Tunai/Transfer) : ");
            metodePilihan = input.nextLine();

            for (int index = 0; index < metodeBayarValid.length; index++) {
                if (metodePilihan.equalsIgnoreCase(metodeBayarValid[index])) {
                    metodePilihan = metodeBayarValid[index];
                    validasi = true;
                }
            }
        } while (!validasi);

        Transaksi modelTransaksi = new Transaksi(namaBarang, jumlahBarang, harga, metodePilihan);
        TransaksiView vTransaksiView = new TransaksiView();
        vTransaksiView.tampilkanTransaksi(modelTransaksi);
        input.close();
    }
}
