package mvc.controller;

import mvc.model.BukuArrayList;
import mvc.view.BukuArrayListView;
import mvc.view.BukuView;

import java.util.*;

public class BukuArrayListController {

    // deklarasi model jadi object
    ArrayList<BukuArrayList> bArrayLists = new ArrayList<>();
    BukuArrayListView bukuArrayListView = new BukuArrayListView();
    // scanner
    Scanner input = new Scanner(System.in);
    int pilihanMenu = 0;

    // deklarasi awal pilihan
    public void tampilkanMenu() {

        do {
            System.out.println("=== Pilihan Menu ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Semua Buku");
            System.out.println("3. Edit Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar ");

            System.out.println();
            System.out.print("Masukkan Pilihan : ");
            pilihanMenu = input.nextInt();
            input.nextLine();

            switch (pilihanMenu) {
                case 1:
                    // print ambil data
                    System.out.print("Masukkan judul buku : ");
                    String judulBuku = input.nextLine();

                    System.out.print("Masukkan penulis buku : ");
                    String penulisBuku = input.nextLine();

                    System.out.print("Masukkan tahun buku : ");
                    int tahunBuku = input.nextInt();

                    // ssetelah data ditangkap dijadikan object mengambil dari blueprint model
                    BukuArrayList bukuBaru = new BukuArrayList(judulBuku, penulisBuku, tahunBuku);
                    // object bukuBaru kita masukkan ke array list dengan method add.
                    bArrayLists.add(bukuBaru);
                    break;

                case 2:
                    // kita pnaggil obbject view , lalu panggil pungsi tampilkan semua dan yg
                    // ditampilkan iyalah bArrayLists
                    bukuArrayListView.tampilkanSemua(bArrayLists);

                    break;

                case 3:
                    bukuArrayListView.tampilkanSemua(bArrayLists);

                    System.out.print("Masukkan nomor film yang mau diedit : ");
                    int nomorEdit = input.nextInt();
                    input.nextLine();

                    // print ambil data
                    System.out.print("Masukkan judul buku : ");
                    String judulEdit = input.nextLine();

                    System.out.print("Masukkan penulis buku : ");
                    String penulisEdit = input.nextLine();

                    System.out.print("Masukkan tahun buku ");
                    int tahunEdit = input.nextInt();

                    BukuArrayList bukuEditArrayList = new BukuArrayList(judulEdit, penulisEdit, tahunEdit);

                    bArrayLists.set(nomorEdit - 1, bukuEditArrayList);

                    bukuArrayListView.tampilkanPesan("Data buku berhasil di edit ! ");

                    break;

                case 4:
                    bukuArrayListView.tampilkanSemua(bArrayLists);

                    System.out.print("Masukkan nomor buku yang mau dihapus : ");
                    int nomorHapus = input.nextInt();

                    bArrayLists.remove(nomorHapus - 1);
                    bukuArrayListView.tampilkanPesan("Data Berhasil di hapus ! ");
                    break;

                case 5:
                    bukuArrayListView.tampilkanPesan("Terimakasih ");
                    break;

                default:
                    break;
            }

        } while (pilihanMenu != 5);

    }
}
