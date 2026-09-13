package mvc.model;

public class MotorKendaraan  extends Kendaraan { 
    private String jenis;
    //field bawaan class motor kendaraan


    //constructor ada 3 parameter , 2 bawaan dari Kendaraan , 1 milik dia sendiri
    public MotorKendaraan (String merek, int tahun , String jenis) {
        super(merek, tahun);
        this.jenis = jenis;
    }

    public  String getJenis () {
        return  jenis;
    }

    public void setJenis (String jenis) {
        this.jenis = jenis;
    }


    //void fungsi yg tidak mereturn
    @Override 
    public void info () {
         System.out.println("Motor : " + merek + " , " + 
        "Tahun : " + tahun + " , " + 
        "Jenis : " + jenis);
    }

    public  void gasPol () {
        System.out.println(merek + " ngegas pol !");
    }
}
