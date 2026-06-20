package myfolder.latihan;

import java.util.*;

public class Challenge21 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2;

        System.out.print("Masukkan angka 1 : ");
        angka1 = input.nextInt();
        System.out.print("Masukkan angka 2 : ");
        angka2 = input.nextInt();

        int tambah = tambah(angka1, angka2);

        cetakHasil(tambah);

    }

    public static int tambah(int a, int b) {
        int jumlah = a + b;

        return jumlah;
    }

    public static void cetakHasil(int hasil) {
        System.out.println("Hasil : " + hasil);
    }
}
