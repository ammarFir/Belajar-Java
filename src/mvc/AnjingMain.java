package mvc;
import mvc.model.Anjing;

public class AnjingMain {
    public static void main(String[] args) {
        Anjing objectAnjing = new  Anjing("Buddy" , 3);
        objectAnjing.makan();
        objectAnjing.gonggong();
    }
}
