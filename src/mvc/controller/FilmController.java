package mvc.controller;

import mvc.model.Film;
import mvc.view.FilmView;
import java.util.*;
import mvc.controller.*;

public class FilmController {
    // dklarasi object
    ArrayList<Film> film = new ArrayList<>();

    // deklarasi scanner
    Scanner input = new Scanner(System.in);

    // deklarasi view
    FilmView filmView = new FilmView();

    int pilihan = 0;

    public void tampilkanMenu() {
        do {
            System.out.println("=== Menu === ");
            System.out.println("1.Tambah Film");
            System.out.println("2.Hapus Film");
            System.out.println("3.Tampilkan Semua Film");
            System.out.println("4.Keluar ");

            System.out.print("Masukkan Pilihan :      ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Judul :   ");
                    String judul = input.nextLine();

                    System.out.print("Masukkan Nama Sutradara :  ");
                    String sutradara = input.nextLine();

                    System.out.print("Masukkan Tahun Film :  ");
                    int tahun = input.nextInt();

                    // deklarasi object film baru dari object film yg sudah ada
                    Film filmBaru = new Film(judul, sutradara, tahun);
                    film.add(filmBaru);
                    break;

                case 2:
                    filmView.tampilkanSemua(film);

                    System.out.print("Masukkan Nomor film yang mau dihapus :  ");
                    int nomorHapus = input.nextInt();

                    film.remove(nomorHapus - 1);
                    filmView.tampilkanPesan("Film Berhasil Dihapus !");
                    break;

                case 3:
                    filmView.tampilkanSemua(film);
                    break;

                case 4:

                    filmView.tampilkanPesan("Terima Kasih ! ");
                    break;

                default:

                    break;
            }
        } while (pilihan != 4);

        input.close();
    }
}
