package mvc.model;


public class Kendaraan {

    protected  String merek;
    protected  int tahun;

    public  Kendaraan (String merek, int tahun) {
        this.merek = merek;
        this.tahun  = tahun;
    }

    public String getMerek () {
        return  merek;
    }

    public int getTahun () {
        return  tahun;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public  void  setTahun (int tahun) {
        this.tahun = tahun;
    }

    public  void info () {
        System.out.println("Merk : " + merek  + " , " + "Tahun : " + tahun);
    }


    public  void bergerak () {
        System.out.println(merek + " sedang bergerak...");
    }

    public  void berhenti() {
        System.out.println(merek + " berhenti");
    }
}