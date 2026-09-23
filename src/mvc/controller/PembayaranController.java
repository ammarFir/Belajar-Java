package mvc.controller;
import mvc.view.PembayaranView;
import  mvc.model.MetodePembayaran;
import mvc.model.KartuKredit;
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
            
        System.out.println("=== PILIHAN MENU ===");
        System.out.println("1. Tambah Transfer Bank");
        System.out.println("2. Tambah E-Wallet");
        System.out.println("3. Tambah Kartu Kredit");
        System.out.println("4. Tampilkan Semua Metode");
        System.out.println("5. Proses Pembayaran");
        System.out.println("6. Refund");
        System.out.println("7. Keluar");
        

        System.out.print("Masukkan Pilihan Anda : ");
        pilihan = input.nextInt();
        input.nextLine();

        switch (pilihan) {
        case 1:{
            System.out.print("Nama Bank : ");
            String namaBank = input.nextLine();

            System.out.print("No Rekening : ");
            String noRekening = input.nextLine();

            input.nextLine();

            TransferBank objekItem = new TransferBank(namaBank, noRekening);
            daftarMetode.add(objekItem);
            
            break;
    }

        case 2: 
        {  }    
            default:
                break;
        }
        
            
        } while (pilihan != 7);


    }

    
}
