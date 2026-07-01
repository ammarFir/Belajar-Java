package mvc.model;

public class Mobil {
    private String merk, warna;
    private int tahun, kecepatan;

    private Mobil(String merk, int tahun, int kecepatan) {
        this.merk = merk;
        this.tahun = tahun;
        this.kecepatan = kecepatan;
    }

    public String getMerk() {
        return merk;
    }

    public String getWarna() {
        return warna;
    }

    public int getTahun() {
        return tahun;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setMerk(String merk) {
        if (merk.trim().equals("")) {
            System.out.println("Merk tidak boleh kosong !");
        } else {
            this.merk = merk;
        }
    }

    public void setWarna(String warna) {
        if (warna.trim().equals("")) {
            System.out.println("Warna tidak boleh kosong !");
        } else {
            this.warna = warna;
        }
    }

    public void setTahun(int tahun) {
        if (tahun < 2000) {
            System.out.println("Harus tahun 2000 keatas !");
        } else {
            this.tahun = tahun;
        }
    }

    public void setKecepatan(int kecepatan) {
        if (tahun >= 2020) {

            if (kecepatan < 0 || kecepatan > 320) {
                System.out.println("Kecepatan  maks 320 !");
            } else {
                this.kecepatan = kecepatan;

            }
        } else {
            if (kecepatan < 0 || kecepatan > 300) {
                System.out.println("Kecepatan maks 300");
            } else {
                this.kecepatan = kecepatan;
            }
        }
    }

}
