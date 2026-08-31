package mvc;

import mvc.controller.FilmController;
import mvc.model.Film;

public class ApilkasiFilmMVC {
    public static void main(String[] args) {
        FilmController fController = new FilmController();
        fController.tampilkanMenu();
    }
}
