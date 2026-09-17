package mvc;
import  mvc.model.Lingkaran;
import  mvc.model.Persegi;

public class BentukMain {
public static void main(String[] args) {
    //bikin object persegi
    Persegi objekPersegi = new Persegi("Persegi", 5);
    
    //bikin objeck lingkaran
    Lingkaran objekLingkaran = new Lingkaran("Lingkaran", 7);

    System.out.println("=== Persegi ===");
    System.out.println("Nama : " + objekPersegi.getNama());
    System.out.println("Luas : " + objekPersegi.hitungLuas());
    System.out.println("Keliling : " + objekPersegi.hitungKeliling());

    System.out.println("=== Lingkaran ===");
    System.out.println("Nama : " + objekLingkaran.getNama());
    System.out.println("Luas : " + objekLingkaran.hitungLuas());
    System.out.println("Keliling : " + objekLingkaran.hitungKeliling());
}
}
