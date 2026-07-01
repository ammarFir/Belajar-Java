package mvc.controller;

import mvc.model.Mobil;
import mvc.view.MobilView;
import java.util.Scanner;

public class MobilController {
    public void tampilkanMobil() {
        Scanner input = new Scanner(System.in);

        String merk;
        do {
            System.out.println("Masukkan merk : ");
            merk = input.next();

            if (merk.trim().equals("")) {
                System.out.println("Merk tidak boleh kosong ! ");
            }
        } while (merk.trim().equals(""));

        String warna;
        do {
            System.out.println("Masukkan warna : ");
            warna = input.next();

            if (warna.trim().equals("")) {
                System.out.println("Warna tidak boleh kosong ! ");
            }
        } while (warna.trim().equals(""));

        int tahun;
        do {
            System.out.println("Masukkan tahun");
            tahun = input.nextInt();

            if (tahun < 2000) {
                System.out.println("Tahun tidak boleh dibawah 2000 !");
            }
        } while (tahun < 2000);
        

        int kecepatan;
        int minimal = 0;
        do {
            System.out.println("Masukkan kecepatan");
            kecepatan = input.nextInt();

            if () {
                System.out.println("Kecepatan tidak boleh lebih dari 320");
            } else if (minimal  < 0 && kec) {
                
            }

    {
                System.out.println("Tahun tidak boleh dibawah 2000 !");
            }
        } while (tahun < 2000);
        
    }
}
