package mvc.model;

public class MobilKendaraan extends Kendaraan {

    private int jumlahPintu;

    public MobilKendaraan (String merek,int tahun , int jumlahPintu) {
        super(merek, tahun);
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
}
