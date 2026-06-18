package myfolder.latihan;

import java.util.*;

public class Challenge13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sisi;

        System.out.print("Masukkan Sisi Kubus :");
        sisi = input.nextInt();

        // angka input diproses di fungsi lalu hasilnya di return dan di assign di
        // masing2 variable
        int volume = hitungVolumeKubus(sisi);
        int luas = hitungLuasPermukaanKubus(sisi);

        // mencetak by fungsi
        cetakHasil(volume, luas);
        input.close();
    }

    // bikin fungsi hitung volume
    // input akan diproses , lalu dikalkulasi dan hasil nya dibawa ke fungsi main
    public static int hitungVolumeKubus(int sisi) {
        int volume = sisi * sisi * sisi;

        return volume;
    }

    // nih ngambil angka dari input dan lalu diproses di main
    public static int hitungLuasPermukaanKubus(int sisi) {
        int luas = 6 * sisi * sisi;
        return luas;
    }

    // ngambil hasil dari kedua fungsi lalu ditampilkan
    public static void cetakHasil(int volume, int luasPermukaan) {
        System.out.println("Volume Kubus : " + volume);
        System.out.println("Luas Permukaan Kubus : " + luasPermukaan);
    }
}
