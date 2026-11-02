package mvc.controller;

import mvc.model.KendaraanParkir;
import mvc.model.TarifParkir;

import java.util.*;
import mvc.view.ParkirView;


public class ParkirController {
    ArrayList <KendaraanParkir> daftarParkir = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    ParkirView view = new ParkirView();

    int pilihanUser = 0;

    public void tampilkanMenu() {

        do {
                System.out.println("");
        System.out.println("=== SISTEM PARKIR ===");
        System.out.println("");
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

                System.out.print("Jenis (Motor/Mobil/Truk): ");
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
                    System.out.print("Jam Masuk: ");
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
                    hasil = true;
                    if (daftarParkir.get(index).isSudahKeluar() == true) {
                        System.out.println("Kendaraan " + plat + " sudah keluar !");
                    } else {
                        int jamKeluar, jamMasuk;
                        System.out.print("Jam Keluar : ");
                        jamKeluar = input.nextInt();
                        jamMasuk = daftarParkir.get(index).getJamMasuk();
                        while (jamKeluar <= jamMasuk || jamKeluar > 24) {
                            System.out.println("jam keluar tidak valid");
                            System.out.print("Jam Keluar : ");
                            jamKeluar = input.nextInt();
                        }
                        daftarParkir.get(index).keluar(jamKeluar);
                        view.tampilkanStruk(TarifParkir.getStruk(daftarParkir.get(index)));
                       
                       
                    }

                } 
               }

               if (!hasil) {
                System.out.println("Kendaraan dengan plat "  + plat + " tidak ditemukan!");
               }


                
                break;
        
            case 3:

               view.tampilkanSemua(daftarParkir);
                
                break;
        
            case 4:
                        
                view.tampilkanYangMasihParkir(daftarParkir);

                break;
        
            case 5:
                double totalPendapatan = 0;
                
                for (int i = 0 ; i < daftarParkir.size(); i++) {
                    if (daftarParkir.get(i).isSudahKeluar() == true) {
                    totalPendapatan += TarifParkir.hitungTarif(daftarParkir.get(i).getJenis(), daftarParkir.get(i).getLamaParkir());  
                    }
                }
                //menampilkan totalPendapatan dengan dikonversi ke strinf
                view.tampilkanPesan("Total Pendapatan: Rp " + totalPendapatan);


                break;
        
            case 6:
                
                view.tampilkanPesan("Terimakasih ! ");

                break;
        

            default:
                view.tampilkanPesan("Pesan Tidak Valid !");
                break;
            }

                } while (pilihanUser != 6);
        
    };
};
