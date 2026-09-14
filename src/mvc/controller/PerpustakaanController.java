package mvc.controller;
import mvc.model.BukuPerpus;
import  mvc.model.ItemPerpustakaan;
import mvc.model.MajalahPerpus;
import  mvc.view.PerpustakaanView;
import  java.util.*;

public class PerpustakaanController {
    ArrayList <ItemPerpustakaan> daftarItem = new ArrayList<>();
    //object array list bernama daftarItem 
    Scanner input = new Scanner(System.in);
    //object scanner dengan nama input

    PerpustakaanView view = new PerpustakaanView();
    //membuat objek dengan nama view

    int pilihanUser = 0;
    //kondisi 0 awal 
  

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

            System.out.print("Masukkan Pilihan Anda : ");
            pilihanUser = input.nextInt();
            input.nextLine();


            switch (pilihanUser) {
                case 1: {
                    System.out.print("Judul : ");
                    String judul = input.nextLine();
                    
                    System.out.print("Kode : ");
                    String kode = input.nextLine();
                    
                    System.out.print("Tahun : ");
                    int  tahun = input.nextInt();
                    input.nextLine();
                    
                    System.out.print("Penulis : ");
                    String  penulis = input.nextLine();
                    
                    System.out.print("Halaman : ");
                    int  jumlahHalaman = input.nextInt();

                    input.nextLine();

                    BukuPerpus objekItem = new BukuPerpus(judul, kode, tahun, penulis, jumlahHalaman);
                    daftarItem.add(objekItem);
                    
                    
                    break;
                }
                  
            
                
                case 2: 
                {
                    System.out.print("Judul : ");
                    String judul = input.nextLine();

                    System.out.print("Kode : ");
                    String kode = input.nextLine();

                    System.out.print("Tahun : ");
                    int tahun = input.nextInt();
                    input.nextLine();

                    System.out.print("Edisi : ");
                    String edisi = input.nextLine();

                    System.out.print("Penerbit : ");
                    String penerbit = input.nextLine();

                    input.nextLine();

                    MajalahPerpus objekItem = new MajalahPerpus(judul, kode, tahun, edisi, penerbit);
                    daftarItem.add(objekItem);



                    break;

                }

                    
                case 3:
                    view.tampilkanSemua(daftarItem);

                    break;
                case 4: {

                    view.tampilkanSemua(daftarItem);

                System.out.print("Nomor buku yang mau dipinjam : ");
                int nomorUrut = input.nextInt();

                daftarItem.get(nomorUrut - 1).dipinjam();
  
                    break;
            
                
                }

                
                case 5:
                    {
                        view.tampilkanSemua(daftarItem);

                        System.out.print("Nomor buku yang mau dikembalikan : ");
                        int nomorUrut = input.nextInt();

                        daftarItem.get(nomorUrut - 1).dikembalikan();
                    }
                    break;

                case 6:
                    view.tampilkanSemua(daftarItem);

                    System.out.print("Nomor buku yang mau dihapus : ");
                    int nomorUrut = input.nextInt();

                    daftarItem.remove(nomorUrut - 1);
                    System.out.println("Buku telah dihapus !");


                    break;
                

                case 7:

                view.tampilkanPesan("bat tenkyu ! ");
                    break;
                
                default:
                    break;
            }
        } while (pilihanUser != 7);
    }
}
