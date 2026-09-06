package mvc.view;

import mvc.model.Lagu;


import java.util.ArrayList;

public class LaguView {

    public void tampilkanSemua(ArrayList<Lagu> daftarLagu) {
        System.out.println("====== Data Lagu =====");

        for (int i = 0; i < daftarLagu.size(); i++) {
                 int menit = daftarLagu.get(i).getDurasi() / 60;
        int detik = daftarLagu.get(i).getDurasi() % 60;
            System.out.println((i + 1) + ". " +
                    daftarLagu.get(i).getJudul() + " - " +
                    daftarLagu.get(i).getPenyanyi() + "( " +
                    menit  + " menit " + detik + " detik " );

        }
    }
    
    public void tampilkanPesan(String pesan) {
        System.out.println(pesan);
    }

    public void tampilkanHasilCari(Lagu lagu) {
        int menit = lagu.getDurasi() / 60;
        int detik = lagu.getDurasi() % 60;
        System.out.println("Judul : " + lagu.getJudul());
        System.out.println("Penyanyi : " + lagu.getPenyanyi());

        System.out.println("Durasi : " + menit + " menit " + detik + " detik "  );
        

    }
}
