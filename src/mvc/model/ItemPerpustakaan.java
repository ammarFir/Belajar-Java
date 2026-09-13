package mvc.model;

public class ItemPerpustakaan {
    

    //variable dasar
    protected  String judul, kode;
    protected  int tahun;

    //constructor 3 parameter
    public ItemPerpustakaan (String judul , String kode, int tahun) {
        this.judul = judul;
        this.kode = kode;
        this.tahun = tahun;
    }


    //getter
    public String getJudul () {
        return  judul;
    }

    public String getKode () {
        return  kode;
    }

    public int getTahun () {
        return  tahun;
    }


//setter
    public void setJudul (String judul) {
        this.judul = judul;
    }

    public void setKode (String kode) {
        this.kode = kode;
    }

    public void setTahun (int tahun) {
        this.tahun = tahun;
    }

    //method info ()
    public  void info () {
        System.out.println("Judul : " + judul + " , " + 
                            "Kode : " + kode + " , " + 
                            "Tahun : " + tahun

        );
    }

    public  void dipinjam () {
        System.out.println(judul + " sedang dipinjam.");
    }

    public  void dikembalikan () {
        System.out.println(judul + " telah dikembalikan.");
    }
}
