package mvc.view;

import mvc.model.ProdukElektronik;
import java.util.ArrayList;

public class TokoView {
    //membuat sebuah fungsi void berparameter array list yg ambilannya dariproduk elektronik bernama daftarProduk
    public void tampilkanSemua(ArrayList <ProdukElektronik> daftarProduk) {
        for (int index = 0 ; index < daftarProduk.size(); index++) {
            System.out.print(index + 1 + " . ");
            daftarProduk.get(index).info();
        }
    }


    public void  tampilkanPesan (String pesan) {
        System.out.println(pesan);
    }

    public  void tampilkanDiskon (double diskon) {
        System.out.println("Diskon : Rp. " + diskon);
    }
}
