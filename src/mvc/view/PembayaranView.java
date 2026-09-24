package mvc.view;
import  mvc.model.MetodePembayaran;
import  java.util.ArrayList;
public class PembayaranView {
    public void tampilkanSemua (ArrayList <MetodePembayaran> daftarMetode ) {
        for (int index = 0 ; index < daftarMetode.size(); index++) {
            //ambil objek pembayaran pada index tertentu , lalu ambil nama metode nya
             //print nama metode yg diambil dari index daftar metode
                System.out.println((index + 1) + ". "  + daftarMetode.get(index).getNamaMetode());

                
    }
}


public void tampilkanPesan(String pesan) {
    System.out.println(pesan);
}
    public void tampilkanBiayaAdmin (String metode , double biaya) {
                    System.out.println("Metode : " + metode + " Biaya Admin : Rp " +  biaya);
                }
                
 
            

}


