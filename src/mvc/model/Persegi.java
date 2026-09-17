package mvc.model;

public class Persegi extends  Bentuk{
    private double sisi;
    public  Persegi (String nama , double sisi) {
        super(nama);
        this.sisi = sisi;
    }

    public double getSisi (){
        return  sisi;
    }

    public void setSisi (double sisi ) {
        this.sisi = sisi;
    }

    @Override 
    public double hitungLuas () {
        return sisi * sisi;
    }


    @Override 
    public double hitungKeliling () {
        return 4 * sisi;
    }
}
