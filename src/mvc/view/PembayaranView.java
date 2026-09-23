package mvc.view;
import  mvc.model.MetodePembayaran;
import  java.util.ArrayList;
public class PembayaranView {
    public void tampilkanSemua (ArrayList <MetodePembayaran> daftarMetode ) {
        for (int index = 0 ; index < daftarMetode.size(); index++) {
                System.out.println(daftarMetode.get(index).getNamaMetode());
        }
    }
}
