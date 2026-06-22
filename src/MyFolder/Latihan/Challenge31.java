package myfolder.latihan;

import java.util.*;

public class Challenge31 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan angka : ");
        angka = input.nextInt();

        int kubik = kubik(angka);
        cetakHasil(angka, kubik);

        input.close();
    }

    public static int kubik(int angka) {
        int hasil = angka * angka * angka;
        return hasil;
    }

    public static void cetakHasil(int angka, int hasil) {
        System.out.println("Kubik dari " + angka + " adalah " + hasil);
    }
}
