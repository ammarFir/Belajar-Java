package mvc.model;

public class Hewan {
    protected String nama;
    protected int umur;

    public  Hewan ( String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama () {
        return  nama;
    }

    public int getUmur () {
        return  umur;
    }

    public void setNama (String nama) {
        this.nama = nama;
    }

    public void setUmur (int umur) {
        this.umur = umur;
    }

    public  void makan () {
        System.out.println(nama + " sedang makan");
    }

    public  void bersuara () {
        System.out.println(nama + " mengeluarkan suara : ");
    }




}
