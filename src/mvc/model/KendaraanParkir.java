package mvc.model;

public class KendaraanParkir {
    private String platNomor, jenis;
    private  int jamMasuk, jamKeluar;
    private boolean sudahKeluar;


    public KendaraanParkir (String platNomor, String jenis, int jamMasuk ) {
        this.platNomor = platNomor;
        this.jenis = jenis;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = 0;
        this.sudahKeluar = false;
    }

    public String getPlatNomor () {
        return  platNomor;
    }

    public String getJenis () {
        return  jenis;
    }

    public int getJamMasuk () {
        return  jamMasuk;
    }

    public int getJamKeluar () {
        return  jamKeluar;
    }

    public boolean isSudahKeluar () {
        return sudahKeluar;
    }

    public void setPlatNomor (String platNomor) {
        this.platNomor = platNomor;
    }

    public void setJenis (String jenis) {
        this.jenis = jenis;
    }

    public void setJamMasuk (int jamMasuk) {
        this.jamMasuk = jamMasuk;
    }

    public  void setJamKeluar (int jamKeluar) {
        this.jamKeluar = jamKeluar;
    }

    public void setSudahKeluar (boolean sudahKeluar) {
        this.sudahKeluar = sudahKeluar;
    }
 
    public int getLamaParkir () {
        if (!sudahKeluar) {
            return  0;
        } else {
            return jamKeluar - jamMasuk;
        }
    }

    public  void keluar (int jamKeluar) {
        this.jamKeluar = jamKeluar;
        this.sudahKeluar = true;
    }


}
