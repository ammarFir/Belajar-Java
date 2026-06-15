package myfolder.latihan;

import java.util.*;

public class Challenge3 {

    public static void main(String[] args) {

        String nama;
        int umur;
        int angkaFavorit;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan nama anda :");
        nama = inputUser.nextLine();

        System.out.print("Masukkan umur anda :");
        umur = inputUser.nextInt();

        System.out.print("Masukkan angka favorit anda :");
        angkaFavorit = inputUser.nextInt();

        int angkaFavoritDikali = 10 * angkaFavorit;

        inputUser.close();

        System.out.println("Halo " + nama);
        System.out.println("Umur Kamu " + umur);
        System.out.println("Angka Favorit Kamu " + angkaFavorit);
        System.out.println("Angka Fav x 10 :" + angkaFavoritDikali);

    }

}
