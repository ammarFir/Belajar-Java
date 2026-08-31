package mvc.view;

import java.util.ArrayList;

import mvc.model.Film;

public class FilmView {
    public void tampilkanSemua(ArrayList<Film> daftarFilm) {
        System.out.println("=== Daftar Film ===");

        for (int index = 0; index < daftarFilm.size(); index++) {
            System.out.println((index + 1) + ". " +
                    daftarFilm.get(index).getJudul() + " - " +
                    daftarFilm.get(index).getSutradara()
                    + " (" +
                    daftarFilm.get(index).getTahun()
                    + ")");
        }

    }

    public void tampilkanPesan(String pesan) {
        System.out.println(pesan);
    }
}
