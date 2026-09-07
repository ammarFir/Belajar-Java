package mvc.controller;

import mvc.model.Lagu;
import mvc.view.LaguView;

import java.util.ArrayList;
import java.util.Scanner;

public class LaguController {
      //membuat sebuah penyimpanan arraylist yg isinya dari obbjek lagu 
        //data yg di model disimpan menjadi array list
        ArrayList <Lagu> laguArrayList = new ArrayList<>();
        LaguView lView = new LaguView();

        Scanner input = new Scanner(System.in);
        int pilihanUser = 0;

    public void tampilkanMenu() {
  
    

        do {

            System.out.println("=== Pilihan Menu ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Tampilkan Semua Lagu");
            System.out.println("3. Cari Lagu (By Judul)");
            System.out.println("4. Hapus Lagu");
            System.out.println("5. Keluar");
            System.out.println();

            System.out.print("Masukkan pilihan anda : ");
            pilihanUser = input.nextInt();
            input.nextLine();



            switch (pilihanUser) {
            case 1:

                System.out.print("Masukkan Judul Lagu : ");
                String judul = input.nextLine();
                System.out.print("Masukkan Penyanyi Lagu : ");
                String penyanyi = input.nextLine();
                System.out.print("Masukkan Durasi Lagu : ");
                int durasi = input.nextInt();


                //bikin object menampung lagu 
                Lagu laguBaru = new Lagu(judul, penyanyi, durasi);

                //panggil array list , masukkan data ke index
                laguArrayList.add(laguBaru);
            break;

            case 2:
                lView.tampilkanSemua(laguArrayList);

            break;

            case 3:
                System.out.print("Masukkan judul lagu yg dicari : ");
                
                //menampung input user
                String judulCari =  input.nextLine();
                //sebagai status lagu ditemukan
                boolean hasilCari = false;

                //perulangan seluruh lagu 
                for (int i = 0 ; i < laguArrayList.size() ; i++) {
                    //cek jika 
                    if (laguArrayList.get(i).getJudul().equalsIgnoreCase(judulCari)) {
                        lView.tampilkanHasilCari(laguArrayList.get(i));
                        hasilCari = true;
                    } 
                } if (!hasilCari) {
                    System.out.println("Hasil tidak ditemukan !");
                }
            break;

            case 4:
                //tampilkan semua lagu dan urutkan menggunakan array list
                lView.tampilkanSemua(laguArrayList);

                //menampung input user
                System.out.print("Masukkan nomor lagu yg mau dihapus : ");
                int indexRemove = input.nextInt();

                //panggil array list dan fungsi hapus by indexRemove/input user lalu kurangi 1
                laguArrayList.remove(indexRemove - 1);
                lView.tampilkanPesan("Lagu berhasil dihapus ! ");


            break;

            case 5:
                lView.tampilkanPesan("Terimakasih ");
            break;


        
            default:
                break;
        }





        } while (pilihanUser != 5);


        
    }
}
