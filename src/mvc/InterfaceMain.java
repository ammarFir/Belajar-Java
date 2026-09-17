package mvc;
import  mvc.model.MobilInterface;
import  mvc.model.SepedaInterface;

public class InterfaceMain {
    public static void main(String[] args) {
        MobilInterface objekMobil = new MobilInterface("Toyot");
        SepedaInterface objekSepeda = new SepedaInterface("Polygon");

        System.out.println("=== MOBIL ===");
        objekMobil.bergerak();
        objekMobil.berhenti();
        
        System.out.println("");
        System.out.println("=== SEPEDA ===");
        objekSepeda.bergerak();
        objekSepeda.berhenti();
    }
}
