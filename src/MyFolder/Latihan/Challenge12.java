package myfolder.latihan;

import java.util.*;

public class Challenge12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int jariJari;

        System.out.print("Masukkan Jari Jari :");
        jariJari = input.nextInt();

        // method bisa dimasdukkan sebagai hasil // diassign di sebuah tipe data
        double hasilJariJari = hitungLuasLingkaran(jariJari);

        cetakLuas(hasilJariJari);

        input.close();
    }

    public static double hitungLuasLingkaran(double jariJari) {

        double luas = 3.14 * jariJari * jariJari;

        return luas;
    }

    public static void cetakLuas(double luasLingkaran) {
        System.out.println("Luas Lingkaran :" + luasLingkaran);
    }

}
