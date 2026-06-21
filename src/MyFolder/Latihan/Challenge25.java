package myfolder.latihan;

import java.util.*;

public class Challenge25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hargaSatuan, jumlahBarang;

        System.out.print("Masukkan harga barang : ");
        hargaSatuan = input.nextInt();

        System.out.print("Masukkan jumlah : ");
        jumlahBarang = input.nextInt();

        int hitungTotal = hitungTotal(hargaSatuan, jumlahBarang);
        int hitungDiskon = hitungDiskon(hitungTotal);

        System.out.println("Total : " + hitungTotal);
        System.out.println("Diskon : " + hitungDiskon);

        input.close();

    }

    public static int hitungTotal(int harga, int jumlah) {
        int total = harga * jumlah;
        return total;
    }

    public static int hitungDiskon(int total) {
        if (total <= 99000) {
            int diskon = 0;
            total = diskon;
        } else if (total >= 100000) {
            int diskon = total * 10 / 100;
            total = diskon;
        }

        // pake cara ini juga bisa lebih simple. return nya didalam percabangan
        // if (total >= 100000) {
        // return total * 10 / 100; // langsung return, gak pake variabel
        // } else {
        // return 0;
        // }

        return total;
    }
}
