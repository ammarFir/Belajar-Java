package myfolder.latihan;

public class TipeDataBukanPrimitif8 {

    public static void main(String[] args) {

        // primitive itu lansung isi/nilai
        // bukan primitive data berbentuk object

        int Integer = 100;
        // integer yg cuma mengisi angka 100
        Integer iniInt = 100;
        // integer object bernama iniInt yg menyimpan angka 100
        Long iniLong = 10000L;

        Byte iniByte = null;
        // ini primitif

        System.out.println(iniByte);

        iniByte = 100;

        System.out.println(iniByte);

        int iniInteger = 100;
        // tipe data primitif

        Integer iniObject = iniInteger;
        // dan ini akan mengkonversinya mnjadi bukan primitif

        short iniShort = iniObject.shortValue();
        long iniLongg = iniObject.longValue();
        float iniFloat = iniObject.floatValue();
        // ini semua adalah konversi widening ato apa itu namanya klo gasaalah
        // jadi masing2 punya methodnya agar bisa dikonversi untuk ubah objectnya

    }

}
