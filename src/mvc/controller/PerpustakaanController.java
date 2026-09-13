package mvc.controller;
import mvc.model.BukuPerpus;
import  mvc.model.ItemPerpustakaan;
import  mvc.view.PerpustakaanView;
import  java.util.*;

public class PerpustakaanController {
    ArrayList <ItemPerpustakaan> daftarItem = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    PerpustakaanView view = new PerpustakaanView();
    int pilihanUser = 0;
  

    public void tampilkanMenu() {


        do {
            System.out.println("=== Selamat Datang ===");
            System.out.println("1. Tambah Buku ");
            System.out.println("2. Tambah Majalah ");
            System.out.println("3. Tampilkan Semua Item");
            System.out.println("4. Pinjam Item");
            System.out.println("5. Kembalikan Item");
            System.out.println("6. Hapus Item");
            System.out.println("7. Keluar");

            System.out.println("Masukkan Pilihan Anda : ");
            pilihanUser = input.nextInt();
            input.nextLine();


            switch (pilihanUser) {
                case 1:
                    System.out.println("Judul : ");
                    String judul = input.nextLine();
                    
                    System.out.println("Kode : ");
                    String kode = input.nextLine();
                    
                    System.out.println("Tahun : ");
                    int  tahun = input.nextInt();
                    
                    System.out.println("Penulis : ");
                    String  penulis = input.nextLine();
                    
                    System.out.println("Halaman : ");
                    int  jumlahHalaman = input.nextInt();

                    input.nextLine();

                    BukuPerpus objekItem = new BukuPerpus(judul, kode, tahun, penulis, jumlahHalaman);
                    daftarItem.add(objekItem);
                    
                    
                    break;
            
                
                case 2:
                    break;

                case 3:
                    break;
                case 4:
                    
                    break;
            
                
                case 5:
                    break;

                case 6:
                    break;
                

                case 7:
                    break;
                
                default:
                    break;
            }
        } while (pilihanUser != 7);
    }
}
