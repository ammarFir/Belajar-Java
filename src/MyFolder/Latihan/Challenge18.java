package myfolder.latihan;

public class Challenge18 {
    public static void main(String[] args) {
        int array[] = { 5, 12, 8, 20, 3 };

        int hasil = cariMax(array);

        cetakMax(hasil);

    }

    public static int cariMax(int[] array) {
        int terbesar = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > terbesar) {
                terbesar = array[i];
            }
        }

        return terbesar;
    }

    public static void cetakMax(int max) {
        System.out.println("Nilai terbesar : " + max);
    }
}
