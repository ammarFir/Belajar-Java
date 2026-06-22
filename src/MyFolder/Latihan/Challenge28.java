package myfolder.latihan;

import java.util.*;

public class Challenge28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan angka : ");
        angka = input.nextInt();

        boolean hasilcek = cekGenap(angka);
        cetakHasil(hasilcek);
        input.close();
    }

    public static boolean cekGenap(int angka) {
        if ((angka % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void cetakHasil(boolean genap) {
        if (genap == true) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
    }
}
