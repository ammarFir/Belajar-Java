package mvc.view;

import mvc.model.BukuArrayList;
import java.util.ArrayList;

public class BukuArrayListView {
    public void tampilkanSemua(ArrayList<BukuArrayList> daftarBuku) {
        // fungsi tampilkanSemua itu berupa array yg diambil dari model BukuArrayList
        // dengan nama daftarBuku
        System.out.println("=== Data Buku ===");

        for (int index = 0; index < daftarBuku.size(); index++) {
            System.out.println((index + 1) + ". " +
                    daftarBuku.get(index).getJudul() + " - " +
                    daftarBuku.get(index).getPenulis() + " (" +
                    daftarBuku.get(index).getTahun() + ")");
        }

    }

    public void tampilkanPesan(String pesan) {
        System.out.println(pesan);
    }
}
