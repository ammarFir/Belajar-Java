package mvc.view;

import java.util.ArrayList;

public class NamaView {
    public void tampilkanNama(ArrayList<String> daftarNama) {
        // deklarasi parameter bernama daftarNama berupa array list bertipe data string
        System.out.println("=== Daftar Nama ===");

        for (int index = 0; index < daftarNama.size(); index++) {
            System.out.println((index + 1) + ". " + daftarNama.get(index));
            // setiap index + 1 maka ambil data by get berdasarkan index
        }
    }
}
