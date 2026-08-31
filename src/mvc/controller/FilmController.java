package mvc.controller;

import mvc.model.Film;
import mvc.view.FilmView;
import java.util.*;

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

            System.out.println("Masukkan Pilihan");
            System.out.println(" ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Nama Judul");
                    System.out.println(" ");
                    String judul = input.nextLine();

                    System.out.println("Masukkan Nama Sutradara");
                    System.out.println(" ");
                    String sutradara = input.nextLine();

                    System.out.println("Masukkan Tahun Film");
                    System.out.println(" ");
                    int tahun = input.nextInt();

                    // deklarasi object film baru dari object film yg sudah ada
                    Film filmBaru = new Film(judul, sutradara, tahun);
                    film.add(filmBaru);
                    break;

                case 2:
                    filmView.tampilkanSemua(film);

                    System.out.println("Masukkan Nomor film yang mau dihapus");
                    System.out.println();
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
    }
}
