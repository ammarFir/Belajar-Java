package mvc.model;

// buku perpus pnya data dari parent yaitu item perpus
public class BukuPerpus extends ItemPerpustakaan{
    //deklare variable dasar
    //agar hanya bisa diakses dari class buku perpus
    //encapsulation
    private  String penulis;
    private  int jumlahHalaman;
    
    //constructor extends dari ItemPerpustakaan
    public BukuPerpus(String judul, String kode , int tahun , String penulis , int jumlahHalaman)
    {
        //super digunakan untuk memanggil constructor bawaan dari  induk nya 
        super(judul, kode, tahun);

        //masukkan nilai parameter penulis ke variable penulis milik object ini 
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getPenulis () {
        return  penulis;
    }

    public int getJumlahHalaman () {
        return  jumlahHalaman;
    }

    public void setPenulis (String penulis) {
        //this penulis itu punya object
        // penulis punya nya parameter
        // setter menerima data dari luar , value this.penulis direplace dari penulis
        this.penulis = penulis;
    }


    public  void setJumlahHalaman (int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    @Override 
    public void info () {
        System.out.println("BUKU - Judul : " + judul + " , "  + 
                            "Kode : " + kode + " , " + 
                            "Tahun : " + tahun + " , " + 
                            "Penulis : " + penulis + " , " + 
                            "Halaman : " + jumlahHalaman  );
    }
    @Override 
    public  void dipinjam () {
        System.out.println("Buku " + judul + " oleh " + penulis + " sedang dipinjam");
    }
}
