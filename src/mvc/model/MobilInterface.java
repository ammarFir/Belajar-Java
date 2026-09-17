package mvc.model;

public class MobilInterface implements BisaBergerak {
    private  String merek;

    public MobilInterface (String merek) {
        this.merek = merek;
    }

    public void setMerek (String merek) {
        this.merek = merek;
    }

    public  String getMerek () {
        return  merek;
    }

    @Override 
    public  void bergerak () {
        System.out.println(merek + " melaju dijalan raya...  " );
    }

    @Override
    public  void berhenti () {
        System.out.println(merek + " berhenti... ");
    }
}
