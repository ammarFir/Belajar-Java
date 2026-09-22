package mvc.model;

public class EWallet implements MetodePembayaran {
    private String namaWallet , noHP;

    public EWallet (String paramNamaWallet , String paramNoHP) {
        this.namaWallet = paramNamaWallet;
        this.noHP = paramNoHP;
    }

    public String getNamaWallet (){
        return namaWallet;
    }

    public String getNoHp () {
        return  noHP;
    }

    public void setNamaWallet (String paramNamaWallet) {
        this.namaWallet = paramNamaWallet;
    }

    public void setNoHp (String paramNoHp) {
        this.noHP = paramNoHp;
    }

   @Override  
   public double prosesBayar (double jumlah) {
    return  jumlah * 0.01;
   }

   @Override
   public String getNamaMetode() {
       // TODO Auto-generated method stub
       String namaMetode = "E-Wallet";
       return namaMetode;
   }
}
