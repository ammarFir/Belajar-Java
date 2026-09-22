 package mvc.model;

public class TransferBank implements MetodePembayaran , BisaRefund{
    private String namaBank, noRekening;
    public TransferBank (String namaBankParam, String noRekeningParam) {
        this.namaBank = namaBankParam;
        this.noRekening = noRekeningParam;
    }

    public String getNamaBank () {
        return  namaBank;
    }
    public  String getNoRekening () {
        return  noRekening;
    }

    public  void setNamaBank (String namaBankParam)  {
        this.namaBank = namaBankParam;
    }

    public void setNoRekening (String noRekeningParam) {
        this.noRekening = noRekeningParam;
    }
    
    //jika perlu data dari luar maka perlu parameter
   @Override
   public double prosesBayar(double jumlah) {
       // TODO Auto-generated method stub
      
       return jumlah * 0.005;
   }

   @Override
   public String getNamaMetode() {
       // TODO Auto-generated method stub
       String namaMetode = "Transfer Bank";
       return namaMetode;
   }

   @Override
   public void refund(double jumlah) {
       System.out.println("Refund Rp." + jumlah + " ke rekening " + noRekening + " (" + namaBank + ")");
   }
}
