package mvc.model;

public abstract class KendaraanDua {
    protected  String merek;
    protected int tahun;

    public KendaraanDua (String merek , int tahun){
        this.merek = merek ;
        this.tahun = tahun;
    }

    public String getMerek () {
        return  merek;
    }

    public int getTahun () {
        return  tahun;
    }

    public void setMerek (String merek) {
        this.merek = merek;
    }

    public  void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public  abstract void bergerak();
    public  abstract void berhenti();

    public void info () {
        System.out.println(" Merek : " + merek + " Tahun : " + tahun);
    }

}
