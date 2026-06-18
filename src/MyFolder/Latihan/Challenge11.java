package myfolder.latihan;

import java.util.*;

public class Challenge11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int panjang, lebar;

        System.out.print("Masukkan Panjang :");
        panjang = input.nextInt();

        System.out.print("Masukkan Lebar :");
        lebar = input.nextInt();

        hitungKeliling(panjang, lebar);

        int hasilKeliling = hitungKeliling(panjang, lebar);
        cetakHasil(hasilKeliling);

    }

    public static int hitungKeliling(int panjang, int lebar) {
        int keliling;
        keliling = 2 * (panjang + lebar);
        return keliling;
    }

    public static void cetakHasil(int hasilKeliling) {

        System.out.println("Hasil Keliling :" + hasilKeliling);

    }

}
