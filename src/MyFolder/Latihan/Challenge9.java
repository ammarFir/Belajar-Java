package myfolder.latihan;

public class Challenge9 {
    public static void main(String[] args) {
        int angka[] = { 15, 8, 23, 4, 42, 19 };

        int total = 0;

        for (int i = 0; i < angka.length; i++) {
            total += angka[i];
        }
        System.out.println("Total jumlah semua angka : " + total);
    }

}
