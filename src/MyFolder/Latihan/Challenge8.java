package myfolder.latihan;

public class Challenge8 {

    public static void main(String[] args) {
        int[] nilai = { 15, 8, 23, 4, 42, 19 };

        int terbesar = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > terbesar) {
                terbesar = nilai[i];
            }
        }

        System.out.println("Angka TerBesar adalah " + terbesar);

    }

}
