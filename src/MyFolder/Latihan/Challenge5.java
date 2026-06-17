package myfolder.latihan;

import java.util.*;

public class Challenge5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nilai;

        System.out.print("Masukkan Nilai : ");
        nilai = input.nextInt();

        input.close();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid (Harus dari 1 -- 100)");
        } else if (nilai >= 85) {
            System.out.println("Nilai anda : A");

        } else if (nilai >= 70) {
            System.out.println("Nilai anda : B");

        } else if (nilai >= 55) {
            System.out.println("Nilai anda : C");

        } else if (nilai >= 40) {
            System.out.println("Nilai anda : D");

        } else if (nilai >= 85) {
            System.out.println("Nilai anda : E");
        }

    }

}
