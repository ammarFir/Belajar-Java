package mvc.model;


//ini class child
public class MajalahPerpus extends  ItemPerpustakaan{ 
    private String edisi, penerbit;

    //bikin constructor //berfungsi memasukkan data object
    public MajalahPerpus (String judul, String kode, int tahun , String edisi, String penerbit) {
        super(judul, kode, tahun);
        this.edisi = edisi;
        this.penerbit = penerbit;
    }

    public void setEdisi (String edisi) {
        this.edisi = edisi;
    }

    public  void setPenerbit (String penerbit) {
        this.penerbit = penerbit;
    }

    public String getEdisi () {
        return edisi;
    }

    public String getPenerbit () {
        return penerbit;
    }

    @Override  
    public void info () {
        System.out.println("MAJALAH - Judul : " + judul + " , " +
                            "Kode : " + kode + " , " + 
                            "Tahun : " + tahun + " , "  +
                            "Edisi : " + edisi + " , " +
                            "Penerbit : " + penerbit
        );
    }

    @Override 
    public  void dipinjam () {
        System.out.println("Majalah : " + judul + " , " + 
                            "Edisi : " + edisi + " sedang dipinjam."
        );
    }

    
}
