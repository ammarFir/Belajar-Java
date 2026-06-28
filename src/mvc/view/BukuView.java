package mvc.view;

import mvc.model.Buku;

public class BukuView {

    // kita bikin fungsi tampil data yg mana yg kita tampilkan ambil dari model Buku
    // dan kita jadikan object buku
    public void tampilkanBuku(Buku buku) {
        System.out.println("Nama Buku : " + buku.getJudul());
        System.out.println("Nama Penulis : " + buku.getPenulis());
        System.out.println("Tahun terbit : " + buku.getTahunTerbit());
    }

}
