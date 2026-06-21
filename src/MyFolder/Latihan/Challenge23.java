package myfolder.latihan;

import java.util.*;

public class Challenge23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2;

        System.out.print("Masukkan angka 1 : ");
        angka1 = input.nextInt();

        System.out.print("Masukkan angka 2 : ");
        angka2 = input.nextInt();

        int luas = hitungLuas(angka1, angka2);
        int keliling = hitungKeliling(angka1, angka2);

        System.out.println(" Luas : " + luas);
        System.out.println(" Keliling : " + keliling);
    }

    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    public static int hitungKeliling(int panjang, int lebar) {
        int keliling = 2 * (panjang + lebar);

        return keliling;
    }
}
