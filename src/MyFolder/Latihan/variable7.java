package myfolder.latihan;

public class variable7 {

    public static void main(String[] args) {

        String nama;
        // deklarasi
        nama = "Merrrr";
        // inisiasi data
        // deklarasi dan inisiasi bisa berbarengan ato tida

        int umur = 23;

        nama = "mer diubah";
        // nama dideklare ulang krna kode dibaca dari atas ke bawah

        var firstName = "mermirmur";
        // jika menggunakan var maka harus langsung inisiasi
        // tidak bisa deklare lalu di inisiasi

        System.out.println(nama + ' ' + umur + ' ' + firstName);

        final String namaLengkap = "usebejebf ubem ubem osas";
        // final itu mengunci inisiasinya , yg artinya datanya gabisa diubah lagi

        System.out.println("Nama Ini Tidak Bisa DIubah Lagi " + namaLengkap);
    }

}
