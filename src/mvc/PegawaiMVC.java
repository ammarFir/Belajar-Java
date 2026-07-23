package mvc;

import mvc.controller.PegawaiController;
import mvc.model.Pegawai;

public class PegawaiMVC {
    public static void main(String[] args) {
        PegawaiController cPegawaiController = new PegawaiController();
        cPegawaiController.tampilkanData();
        System.out.println("");
    }
}
