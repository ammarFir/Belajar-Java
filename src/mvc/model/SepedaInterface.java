package mvc.model;

public class SepedaInterface implements BisaBergerak {
    private String merek;

    public SepedaInterface (String merek) {
        this.merek = merek;
    }

    public void setMerek (String paramMerek) {
        this.merek = paramMerek;
    }

    public  String getMerek () {
        return  merek;
    }

    @Override 
    public void bergerak () {
        System.out.println(merek + " sedang dikayuh.....");
    }

    @Override 
    public  void berhenti () {
        System.out.println(merek + " berhenti.....");
    }
}
