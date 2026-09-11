package mvc;
import mvc.model.Hewan;
import mvc.model.Kucing;
import mvc.model.Anjing;

public class OverridingMain {
    public static void main(String[] args) {
        Hewan objekHewan = new Hewan("Hewan", 1);
        Kucing objekKucing = new Kucing("Kitty", 2);
        Anjing objekAnjing = new Anjing("Buddy", 2);
        objekHewan.bersuara();
        objekKucing.bersuara();
        objekAnjing.bersuara();
    }
}
