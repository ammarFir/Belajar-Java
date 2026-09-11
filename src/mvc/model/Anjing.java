package mvc.model;

public class Anjing extends  Hewan{
    //yg diextends iyalah var nama , umur, method makan , get nama ,get umur , dan set nya juga sedangkan constructor tidak

    //deklarasi konstruktor
    public  Anjing (String nama , int umur) {
        //disini construtcor tidak make this 
        //karena var nama dan umur itu miilik hewan bukan anjing
        //jadi kita minta isikan dari hewan by sintax super
        super(nama, umur);
    }

    @Override 
    public  void  bersuara () {
        System.out.println(nama + " bilang : Guk! Guk!");
    }

    public void gonggong() {
        System.out.println(nama + " bilang: Guk! Guk!");
    }
}
