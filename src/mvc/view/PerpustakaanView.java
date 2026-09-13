package mvc.view;
import java.util.ArrayList;

import  mvc.model.ItemPerpustakaan;

public class PerpustakaanView {
    public void tampilkanSemua(ArrayList<ItemPerpustakaan> daftarItem) {
        for (int i = 0 ; i < daftarItem.size(); i++) {
            daftarItem.get(i).info();
        }
    }

    public void tampilkanPesan (String pesan) {
        System.out.println(pesan);
    }

    public void tampilkanDetail(ItemPerpustakaan item) {
        item.info();
    }
}
