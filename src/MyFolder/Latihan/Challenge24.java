package myfolder.latihan;

import java.util.*;

public class Challenge24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisi;

        System.out.print("Masukkan sisi kubus : ");
        sisi = input.nextInt();

        int volume = hitungVolumeKubus(sisi);
        int luas = hitungLuasPermukaanKubus(sisi);

        cetakHasil(volume, luas);

    }

    public static int hitungVolumeKubus(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    public static int hitungLuasPermukaanKubus(int sisi) {
        int luas = 6 * sisi * sisi;
        return luas;
    }

    public static void cetakHasil(int volume, int luas) {
        System.out.println("Volume : " + volume);
        System.out.println("Luas Permukaan : " + luas);
    }
}
