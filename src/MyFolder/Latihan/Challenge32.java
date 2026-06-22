package myfolder.latihan;

import java.util.*;

public class Challenge32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int alas, tinggi;

        System.out.print("Masukkan alas : ");
        alas = input.nextInt();

        System.out.print("Masukkan alas : ");
        tinggi = input.nextInt();

        double hitungLuasSegitiga = hitungLuasSegitiga(alas, tinggi);
        cetakHasil(alas, tinggi, hitungLuasSegitiga);
        input.close();
    }

    public static double hitungLuasSegitiga(double alas, double tinggi) {
        double luas = (alas * tinggi) / 2;
        return luas;
    }

    public static void cetakHasil(double alas, double tinggi, double luas) {
        System.out.println("Luas segitiga dengan alas " + alas + " dan tinggi " + tinggi + " adalah " + luas);
    }
}
