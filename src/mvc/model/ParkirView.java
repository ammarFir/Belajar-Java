package mvc.model;
import java.util.ArrayList;
public class ParkirView {
    
    public void tampilkanSemua(ArrayList <KendaraanParkir> daftarParkir) {
        for (int i = 0 ; i < daftarParkir.size(); i++) {
            System.out.println(" === DAFTAR SEMUA KENDARAAN === ");
            System.out.println((i + 1)
                                    //pakai fungsi array yaitu .get  , ambil dari index lLALU AMBIL GETTER
                                + daftarParkir.get(i).getPlatNomor() + " - "
                                + daftarParkir.get(i).getJenis() + " - "
                                + "(Masuk: Jam " + daftarParkir.get(i).getJamMasuk() + ")" + " - "
                                //data is sudah keluar dibandingkan lalu jika true ato false gabungkan dengan text hasil validasi
                                + (daftarParkir.get(i).isSudahKeluar()
                                                                     ? "Sudah Keluar"   
                                                                     : "Masih Parkir")
        );
        }

    }

    public void tampilkanYangMasihParkir(ArrayList <KendaraanParkir> daftarParkir) {
        boolean adaYangParkir = false;
     
        for (int index = 0; index < daftarParkir.size(); index++) {
               if (!daftarParkir.get(index).isSudahKeluar()) {
                adaYangParkir = true;
                System.out.println("=== KENDARAAN MASIH PARKIR ===");
                System.out.println((index + 1)
                            +daftarParkir.get(index).getPlatNomor() + " - "
                            +daftarParkir.get(index).getJenis() + " - "
                            + "(Masuk : Jam " + daftarParkir.get(index).getJamMasuk() + " ) "
                            + (daftarParkir.get(index).isSudahKeluar())
            );
               } 
        }

        if(!adaYangParkir) {
            System.out.println("Tidak ada kendaraan yang parkir");
        }
    }

    public void tampilkanPesan (String pesan)
        {
            System.out.println(pesan);
        }

        public void tampilkanStruk (String struk) {
            System.out.println(struk);
        }
}
