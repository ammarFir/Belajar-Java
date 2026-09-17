package mvc.model;

public class Lingkaran  extends  Bentuk{
    private double jariJari;
    public Lingkaran (String nama , double jariJari) {
        super(nama);
        this.jariJari = jariJari;
    }

    public double setJariJari () {
        return jariJari;
    }

    public  void getJariJari (double jariJari) {
        this.jariJari = jariJari;
    }

    @Override  
    public  double hitungLuas () {
        return  3.14 * jariJari * jariJari;
    }

    @Override  
    public  double hitungKeliling () {
        return  2 * 3.14 * jariJari;
    }
}
