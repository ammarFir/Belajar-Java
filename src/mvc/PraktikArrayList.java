package mvc;

import java.util.*;

public class PraktikArrayList {
    public static void main(String[] args) {

        // bikin arraylist
        ArrayList<String> daftarNama = new ArrayList<>();

        // tambah data
        daftarNama.add("Ammar");
        daftarNama.add("Ananda");
        daftarNama.add("Gracia");
        daftarNama.add("Deankt");
        daftarNama.add("Anton");

        // loop menampilkan data
        for (int index = 0; index < daftarNama.size(); index++) {
            System.out.println("Nama ke " + (index + 1) + " : " + daftarNama.get(index));
        }

        // daftar nama remove
        System.out.println("ini contoh penggunana fungsi remove .remove(3)");
        daftarNama.remove(3);
        System.out.println("\n Setelah hapus  Deankt");
        for (String nama : daftarNama) {
            System.out.println("- " + nama);
        }
    }
}
