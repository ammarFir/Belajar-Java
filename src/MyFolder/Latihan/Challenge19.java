package myfolder.latihan;

public class Challenge19 {
    public static void main(String[] args) {
        int array[] = { 10, 20, 30, 40, 50 };
        int hasil = jumlahArray(array);
        cetakJumlah(hasil);

    }

    public static int jumlahArray(int[] angka) {
        int jumlah = 0;

        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }

        return jumlah;
    }

    public static void cetakJumlah(int total) {
        System.out.println("Jumlah Semua Angka : " + total);
    }
}
