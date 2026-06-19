package myfolder.latihan;

import java.util.*;

public class Challenge17 {
    public static void main(String[] args) {
        sapaDunia();

        Scanner input = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan angka yg akan dikali 2 :");
        angka = input.nextInt();

        int hasilKali = kaliDua(angka);

        System.out.println("Hasilnya adalah : " + hasilKali);
        input.close();
    }

    public static void sapaDunia() {
        System.out.println(" heelo geyz");
    };

    public static int kaliDua(int angka) {

        int hasil = angka * 2;
        return hasil;
    }
}
