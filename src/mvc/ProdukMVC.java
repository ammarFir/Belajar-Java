package mvc;

import mvc.controller.ProdukController;

public class ProdukMVC {
    public static void main(String[] args) {
        ProdukController pController = new ProdukController();
        pController.tampilkanProduk();
    }
}
