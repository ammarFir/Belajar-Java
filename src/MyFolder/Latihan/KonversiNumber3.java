package myfolder.latihan;

public class KonversiNumber3 {

    public static void main(String[] args) {

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;
        // bisa dikonversikan nilai nya secara otomatis
        // disebut juga dgn widening casting

        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2; // hasilnya iyalah -24
        // (byte) itu adalah typecasting lalu dimodulokan
        // sedangkan klo dari terbesal ke terkecil itu manual /gabisa otomatis
        // disebut juga narrowing casting
        // hati2 konversi dari terbesar ke terkecil bisa kena number overflow

    }
}