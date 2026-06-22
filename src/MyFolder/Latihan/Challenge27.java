package myfolder.latihan;

import java.util.*;

public class Challenge27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2, angka3;

        System.out.print("Masukkan angka 1 : ");
        angka1 = input.nextInt();

        System.out.print("Masukkan angka 2 : ");
        angka2 = input.nextInt();

        System.out.print("Masukkan angka 3 : ");
        angka3 = input.nextInt();

        double rata = hitungAngka(angka1, angka2, angka3);
        cetakRata(rata);
        input.close();
    }

    public static double hitungAngka(int a, int b, int c) {
        double total = (a + b + c) / 3.0;
        return total;
    }

    public static void cetakRata(double rata) {
        System.out.println("Rata - rata : " + rata);
    }
}
