package myfolder.latihan;

import java.util.*;

public class Challenge10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang ");
        panjang = input.nextInt();

        sapaUser();
        luasPersegiPanjang();
    }

    public static void sapaUser() {
        String nama;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama anda :");
        nama = input.nextLine();

        input.close();

        System.out.println("Halo " + nama + ", selamat belajar method");

    }

    public static int luasPersegiPanjang(int hasil) {

        int panjang = 0;
        int lebar = 0;

        hasil = panjang * lebar;

        return hasil;
    }

}
