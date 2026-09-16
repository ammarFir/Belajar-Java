package mvc.controller;
import mvc.model.Handphone;
import mvc.model.Laptop;
import  mvc.model.ProdukElektronik;
import  mvc.view.TokoView;
import java.util.*;

public class TokoController {
        ArrayList <ProdukElektronik> daftarProduk = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        TokoView view = new TokoView();

        int pilihan = 0;
    

        public void tampilkanMenu () {

            do {
                 System.out.println("=== Selamat Datang ===");
            System.out.println("1. Tambah HP ");
            System.out.println("2. Tambah Laptop ");
            System.out.println("3. Tampilkan Semua Produk");
            System.out.println("4. Lihat Diskon");
            System.out.println("5. Hapus Produk");
            System.out.println("6. Keluar");

            System.out.print("Masukkan Pilihan anda : ");
            pilihan = input.nextInt();
            input.nextLine();



            switch (pilihan) {
                case 1: {
                        System.out.print("Nama HP : ");
                        String nama = input.nextLine();

                        System.out.print("Merk HP : ");
                        String merek = input.nextLine();

                        System.out.print("Harga HP : ");
                        int harga = input.nextInt();

                        System.out.print("RAM HP : ");
                        int ram = input.nextInt();

                        System.out.print("Storage HP : ");
                        int storage = input.nextInt();
                        input.nextLine();

                        //jadikan data tsb object
                        Handphone objekHP = new Handphone(nama, merek, harga, ram , storage);
                        daftarProduk.add(objekHP);

                }
    
                    break;
            
                case 2:
                    {
                        System.out.print("Nama Laptop : ");
                        String nama = input.nextLine();

                        System.out.print("Merk Laptop : ");
                        String merek = input.nextLine();

                        System.out.print("Harga Laptop : ");
                        int harga = input.nextInt();
                        
                        System.out.print("Processor Laptop : ");
                        String processor = input.nextLine();

                        System.out.print("RAM Laptop : ");
                        int ram = input.nextInt();
                        input.nextLine();

                        Laptop objekLaptop = new Laptop(nama, merek, harga, processor, ram);
                        daftarProduk.add(objekLaptop);

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

            } while (pilihan != 6);




        }


}
