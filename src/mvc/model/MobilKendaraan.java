package mvc.model;

public class MobilKendaraan extends Kendaraan {

    private int jumlahPintu;

    public MobilKendaraan (String merek,int tahun , int jumlahPintu) {
        super(merek, tahun);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu () {
        return  jumlahPintu;
        }

    public  void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    @Override 
    public void info() {
        System.out.println("Mobil : " + merek + " , " + 
        "Tahun : " + tahun + " , " + 
        "Jumlah Pintu : " + jumlahPintu);
    }

    @Override 
    public void bergerak () {
        System.out.println(merek + " melaju di jalan raya....");
    }
    public  void klakson () {
        System.out.println(merek + " berbunyi : tin ! tinn !");
    }
}
