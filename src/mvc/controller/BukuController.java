package mvc.controller;

import mvc.model.Buku;
import mvc.view.BukuView;
import java.util.*;

public class BukuController {

    public void tampilkanBuku() {
        // sccanner input
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan judul buku");
        String judul = input.nextLine();

        System.out.println("Masukkan nama penulis");
        String nama = input.nextLine();

        // looping masukkan tahun
        int tahun;
        do {
            System.out.print("Masukkan tahun :");
            tahun = input.nextInt();
            input.nextLine();

            if (tahun < 1990) {
                System.out.println("ERROR : Tahun harus >= 1990");
            }
        } while (tahun < 1990);
        input.close();

        // jadikan buku jadi object beserta vari didalamnya
        Buku buku = new Buku(judul, nama, tahun);

        // tarik view ke dalam
        BukuView bView = new BukuView();
        // pakai fungsinya
        bView.tampilkanBuku(buku);
    }

}
