package mvc.model;

public class Karyawan {
    private String nama;
    private int umur;
    private double gaji;

    // constrecutor membungkus semua data //object
    public Karyawan(String nama, int umur, double gaji) {
        this.nama = nama;
        this.umur = umur;
        this.gaji = gaji;
    }

    // getter
    public String getNamaKaryawan() {
        return nama;
    }

    public int getUmurKaryawan() {
        return umur;
    }

    public double getGajiKaryawan() {
        return gaji;
    }

    // setter
    public void setNamaKaryawan(String nama) {
        this.nama = nama;
    }

    public void setUmurKaryawan(int umur) {
        this.umur = umur;
    }

    public void setGajiKaryawan(double gaji) {
        this.gaji = gaji;
    }
}
