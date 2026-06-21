package myfolder.latihan;

import java.util.*;

public class Challenge26 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menit;

        System.out.print("Masukkan menit : ");
        menit = input.nextInt();

        int konversi = konversiMenitKeDetik(menit);
        cetakHasil(menit, konversi);

        input.close();
    }

    public static int konversiMenitKeDetik(int menit) {
        int hasil = menit * 60;
        return hasil;
    }

    public static void cetakHasil(int menit, int detik) {
        System.out.println(menit + " Menit = " + detik + " Detik");
    }

}
