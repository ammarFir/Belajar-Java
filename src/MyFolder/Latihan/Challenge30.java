package myfolder.latihan;

import java.util.*;

public class Challenge30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan angka : ");
        angka = input.nextInt();

        int hasil = kuadrat(angka);
        cetakHasil(angka, hasil);
        input.close();
    }

    public static int kuadrat(int angka) {
        int hasil = angka * angka;
        return hasil;
    }

    public static void cetakHasil(int angka, int hasil) {
        System.out.println(" Kuadrat dari " + angka + " adalah " + hasil);
    }
}
