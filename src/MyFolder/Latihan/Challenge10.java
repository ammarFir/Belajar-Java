package myfolder.latihan;

import java.util.*;

public class Challenge10 {

    public static void main(String[] args) {

        sapaUser();

        Scanner input = new Scanner(System.in);

        int panjang;
        int lebar;
        System.out.print("Masukkan Panjang ");
        panjang = input.nextInt();
        System.out.print("Masukkan Lebar ");
        lebar = input.nextInt();

        input.close();

        luasPersegiPanjang(panjang, lebar);
    }

    public static void sapaUser() {
        String nama;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama anda :");
        nama = input.nextLine();

        System.out.println("Halo " + nama + ", selamat belajar method");

    }

    public static int luasPersegiPanjang(int panjang, int lebar) {

        int hasil = panjang * lebar;
        System.out.println(hasil);
        return hasil;
    }

}
