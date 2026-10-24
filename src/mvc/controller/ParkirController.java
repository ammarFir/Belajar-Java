package mvc.controller;

import mvc.model.KendaraanParkir;
import java.util.ArrayList;
import java.util.*;
import mvc.view.ParkirView;


public class ParkirController {
    ArrayList <KendaraanParkir> daftarParkir = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    ParkirView view = new ParkirView();

    int pilihanUser = 0;

    public void tampilkanMenu() {

        System.out.println("=== SISTEM PARKIR ===");
        System.out.println("1. Kendaraan Masuk");
        System.out.println("2. Kendaraan Keluar");
        System.out.println("3. Tampilkan Semua");
        System.out.println("4. Tampilkan Yang Masih Parkir");
        System.out.println("5. Total Pendapatan");
        System.out.println("6. Keluar");
        
        System.out.print("Pilih: ");
        pilihanUser = input.nextInt();
        input.nextLine();

        switch (pilihanUser) {
            case 1:
                {System.out.print("Plat : ");
                String plat = input.next();

                System.out.print("Jenis : ");
                String jenis = input.next();
                while (!jenis.equalsIgnoreCase("Motor") && 
                      (!jenis.equalsIgnoreCase("Mobil")) &&
                      (!jenis.equalsIgnoreCase("Truk"))
                ) {
                    System.out.println("Harus Motor , Mobil atau Truk ");
                    System.out.print("Jenis : ");
                    jenis = input.next();
                } 

                System.out.print("Jam Masuk : ");
                int jamMasuk = input.nextInt();
                while (jamMasuk < 0 || jamMasuk > 23 ) {
                    System.out.println("Masukkan jam valid (0-23)");
                    System.out.println("Jam Masuk: ");
                    jamMasuk = input.nextInt();
                }

                input.nextLine();

                KendaraanParkir kendaraan = new KendaraanParkir(plat, jenis, jamMasuk);
                daftarParkir.add(kendaraan);

                view.tampilkanPesan("Kendaraan " + kendaraan.getPlatNomor() + " berhasil masuk");

}


                break;
        
            case 2:

                System.out.print("Plat : ");
                String plat = input.next();
                boolean hasil = false;

               for (int index = 0 ; index < daftarParkir.size(); index++) {
                if (daftarParkir.get(index).getPlatNomor().equalsIgnoreCase(plat)){
                    System.out.println("Kendaraan " + plat + " sudah keluar!");
                    hasil = true;
                } 
               }

               if (!hasil) {
                System.out.println("Kendaraan dengan plat "  + plat + " tidak ditemukan!");
               }


                
                break;
        
            case 3:
                
                break;
        
            case 4:
                
                break;
        
            case 5:
                
                break;
        
            case 6:
                
                break;
        

            default:
                break;
        }
    }
}
