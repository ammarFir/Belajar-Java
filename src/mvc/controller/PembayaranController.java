package mvc.controller;
import mvc.view.PembayaranView;
import  mvc.model.MetodePembayaran;
import mvc.model.KartuKredit;
import mvc.model.BisaRefund;
import mvc.model.EWallet;
import mvc.model.TransferBank;
import java.util.*;

public class PembayaranController {

    //bikin object arrayList  , scanner , view
    ArrayList <MetodePembayaran> daftarMetode = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    PembayaranView view = new PembayaranView();
    int pilihan = 0;

    public void tampilkanMenu () {
        
        do {
        System.out.println("");
        System.out.println("== MENU PEMBAYARAN ===");
        System.out.println("1. Tambah Transfer Bank");
        System.out.println("2. Tambah E-Wallet");
        System.out.println("3. Tambah Kartu Kredit");
        System.out.println("4. Tampilkan Semua Metode");
        System.out.println("5. Proses Pembayaran");
        System.out.println("6. Refund");
        System.out.println("7. Keluar");
        

        System.out.print("Pilih : ");
    

        pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
        case 1:{
            System.out.println("");
            System.out.println("=== MENU PEMBAYARAN ===");
            System.out.println("");
            System.out.print("Nama Bank : ");
            String namaBank = input.nextLine();

            System.out.print("No Rekening : ");
            String noRekening = input.nextLine();


            TransferBank objekItem = new TransferBank(namaBank, noRekening);
            daftarMetode.add(objekItem);
            
            break;
    }

        case 2:{ 
            System.out.println("");
            System.out.println("=== MENU PEMBAYARAN ===");
            System.out.println("");
            
            System.out.print("Nama E-Wallet : ");
            String namaWallet = input.nextLine();

            System.out.print("No HP : ");
            String noHP = input.nextLine();


            EWallet objekItem = new EWallet(namaWallet, noHP);
            daftarMetode.add(objekItem);
            break;

 
         }   

         case 3:{
            System.out.println("");
            System.out.println("=== MENU PEMBAYARAN ===");
            System.out.println("");
            
            System.out.print("Nomor Kartu Kredit : ");
            String nomorKartu = input.nextLine();

            System.out.print("Nama Pemilik : ");
            String namaPemilik = input.nextLine();

            

            KartuKredit objekItem = new KartuKredit(nomorKartu, namaPemilik);
            daftarMetode.add(objekItem);
            break;
         } 
         case 4: 
         {
            System.out.println("");
            System.out.println("=== DAFTAR METODE ===");
            System.out.println("");

            view.tampilkanSemua(daftarMetode);
            break;
         }
         case 5: 
         {

            //pilih nama metode
            System.out.print("No Metode : ");
            int nomorMetode = input.nextInt();

            //masukkan jumlah
            System.out.print("Jumlah : ");
            int jumlah = input.nextInt();

            //penghitungan biaya admin
            //ambil nama metode , lalu ambil metode by index - 1, lalu proses bayar dari input jumlah
            double biayaAdmin =   daftarMetode.get(nomorMetode - 1).prosesBayar(jumlah);

            //tampilkan biaya admin by index dan nama metode di parameter
            view.tampilkanBiayaAdmin(daftarMetode.get(nomorMetode - 1).getNamaMetode(), biayaAdmin);
            
            break;

         }

         case 6: 
         {
            System.out.println("No Metode : ");
            int nomorMetode = input.nextInt();

            if (daftarMetode.get( nomorMetode - 1) instanceof BisaRefund) {
                System.out.print("Jumlah Refund : ");
                double jumlahRefund = input.nextDouble();
                
                //objek daftar metode by index dicek/dicasting objeknya dngn bisa refund lalu panggil by object tsb fungsi .refund
                ((BisaRefund)   daftarMetode.get(nomorMetode - 1)).refund(jumlahRefund);
               
            } else {
                 System.out.println("E-Wallet tidak bisa refund!");
            }
            break;
         }
         
            default:
                break;
        }
        
            
        } while (pilihan != 7);


    }

    
}
