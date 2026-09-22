package mvc.model;

public class KartuKredit implements MetodePembayaran , BisaRefund{
    private  String nomorKartu , namaPemlik;
    
    public KartuKredit (String paramNomorKartu , String paramNamaPemilik) {
        this.nomorKartu = paramNomorKartu;
        this.namaPemlik = paramNamaPemilik;
    }

    public String getNomorKartu () {
        return  nomorKartu;
    }

    public  String getNamaPemilik () {
        return  namaPemlik;
    }


    public void setNamaPemilik (String paramNamaPemilik) {
        this.namaPemlik = paramNamaPemilik;
    }

    public void setNomorKartu (String paramNomorKartu) {
        this.nomorKartu = paramNomorKartu;
    }

    @Override
    public String getNamaMetode() {
        // TODO Auto-generated method stub
        String namaMetode =  "Kartu Kredit";
        return namaMetode;
    }

    @Override
    public void refund(double jumlah) {
        System.out.println("Refund Rp. " + jumlah + " ke kartu " + nomorKartu + " (" + namaPemlik + ")");
    }
 }
