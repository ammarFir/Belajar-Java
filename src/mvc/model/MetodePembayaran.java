package mvc.model;

public interface MetodePembayaran {

    //interface cuma aturan , jadi fungsi tidak ada isinya
    double prosesBayar(double jumlah);
    //tidak langsung return 
    String getNamaMetode();
  
}
