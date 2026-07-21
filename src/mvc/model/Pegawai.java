package mvc.model;

public class Pegawai {
    public String nama, nip;
    public double gajiPokok;
    public int jamLembur;

    public Pegawai(String nama, String nip, double gajiPokok, int jamLembur) {
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
        this.jamLembur = jamLembur;
    }

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public int getJamLembur() {
        return jamLembur;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setJamLembur(int jamLembur) {
        this.jamLembur = jamLembur;
    }

    public double hitungGajiBersih() {
        double gajiLembur = jamLembur * 50000;
        double pajak = (gajiPokok + gajiLembur) * 0.05;
        double gajiBersih = (gajiPokok + gajiLembur) - pajak;

        return gajiBersih;
    }
}
