package myfolder.latihan;

import java.util.*;

public class Challenge22 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int angka1, angka2;

        System.out.print("Masukkan angka 1 : ");
        angka1 = input.nextInt();

        System.out.print("Masukkan angka 2 : ");
        angka2 = input.nextInt();

        int kurang = kurang(angka1, angka2);
        int kali = kali(angka1, angka2);

        input.close();
    }

    public static int kurang(int a, int b) {
        int jumlah = a - b;
        System.out.println("Hasil Pengurangan " + jumlah);
        return jumlah;
    }

    public static int kali(int a, int b) {
        int jumlah = a * b;
        System.out.println("Hasil Perkalian " + jumlah);
        return jumlah;
    }
}
