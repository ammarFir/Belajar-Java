package myfolder.latihan;

public class Challenge20 {

    public static void main(String[] args) {
        // assign array
        int array[] = { 8, 12, 15, 10, 5 };

        double hitung = hitungRata(array);
        // deklarasi double hitung
        // assign nya fungsi hitung rata yg berparameter int array diatas

        cetakRata(hitung);
        // cetak hasil dari double hitung
    }

    public static double hitungRata(int angka[]) {
        // deklarasi fungsi double hitung rata berparameter int array angka
        int jumlah = 0;
        int panjang = angka.length;
        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }
        // menjumlahkan semua nilai yg ada didalam array , lalu dijadikan 1
        double rata = (double) jumlah / panjang;
        // lalu hasilnya dibagi by panjang array
        return rata;
        // hasilnya direturn
        // dan hasilnya ini yg dibawa naik keats
    }

    public static void cetakRata(double rata) {
        System.out.print("Rata-rata :" + rata);
    }

}
