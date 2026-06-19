package myfolder.latihan;

import java.util.*;

public class Challenge15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // deklarasi variable sbg wdah input
        double harga, diskon;

        System.out.print("Masukkan Harga :");
        // assign by input
        harga = input.nextDouble();

        System.out.print("Masukkan Persenan Diskon :");
        // assign by input
        diskon = input.nextDouble();

        // assing variable dan isinya method yg return angka
        double htgDiskon = hitungDiskon(harga, diskon);
        double hrgAkhir = hargaSetelahDiskon(harga, htgDiskon);

        cetakHasil(harga, htgDiskon, hrgAkhir);
        input.close();
    }

    public static double hitungDiskon(double harga, double persenDiskon) {

        double nominalDiskon = harga * (persenDiskon / 100);
        return nominalDiskon;
    }

    public static double hargaSetelahDiskon(double harga, double diskon) {
        double hargaAkhir = harga - diskon;
        return hargaAkhir;
    }

    public static void cetakHasil(double hargaAwal, double diskon, double hargaAkhir) {
        System.out.println("Harga awal : " + hargaAwal);
        System.out.println("Diskon : " + diskon);
        System.out.println("Harga setelah diskon : " + hargaAkhir);
    }

}
