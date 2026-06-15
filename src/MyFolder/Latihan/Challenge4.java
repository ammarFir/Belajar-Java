package myfolder.latihan;

import java.util.*;

public class Challenge4 {

    public static void main(String[] args) {

        int angka;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Angka : ");
        angka = input.nextInt();

        input.close();

        if (angka % 2 == 0) {
            System.out.println(" Genap ");
        } else {
            System.out.println(" Ganjil ");
        }

    }

}
