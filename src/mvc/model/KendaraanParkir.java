package mvc.model;

public class KendaraanParkir {
    private String platNomor, jenis;
    private  int jamMasuk, jamKeluar;
    private boolean sudahKeluar;


    public KendaraanParkir (String platNomor, String jenis, int jamMasuk , int jamKeluar, boolean sudahKeluar) {
        this.platNomor = platNomor;
        this.jenis = jenis;
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
        this.sudahKeluar = sudahKeluar;
    }

    public String getPlatNomor () {
        return  platNomor;
    }

    public String getJenis () {
        return  jenis;
    }

    public int jamMasuk () {
        return  jamMasuk;
    }

    public int jamKeluar () {
        return  jamKeluar;
    }

    public boolean sudahKeluar () {
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
        this.jamKeluar = 0;
    }

    public void sudahKeluar (boolean sudahKeluar) {
        this.sudahKeluar = false;
    }
 


}
