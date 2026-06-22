package myfolder.latihan;

import java.util.*;

public class Challenge33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jariJari, tinggi;

        System.out.print("Masukkan jari jari : ");
        jariJari = input.nextInt();

        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextInt();

        double hitungVolumeTabung = hitungVolumeTabung(jariJari, tinggi);
        cetakHasil(jariJari, tinggi, hitungVolumeTabung);
        input.close();

    }

    public static double hitungVolumeTabung(double jariJari, double tinggi) {
        double volume = 3.14 * jariJari * jariJari * tinggi;
        return volume;
    }

    public static void cetakHasil(double jariJari, double tinggi, double volume) {
        System.out
                .println("Volume tabung dengan jari-jari " + jariJari + " dan tinggi " + tinggi + " adalah " + volume);
    }
}
