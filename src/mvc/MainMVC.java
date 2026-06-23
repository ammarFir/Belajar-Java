package mvc;

import mvc.model.Mahasiswa;

public class MainMVC {

    public static void main(String[] args) {

        // pembuatan object
        Mahasiswa mhs = new Mahasiswa();

        // isi data object
        mhs.nama = " Ammar ";
        mhs.umur = 24;

        // cetak
        System.out.println("Nama : " + mhs.nama);
        System.out.println("Umur : " + mhs.umur);
    }
}
