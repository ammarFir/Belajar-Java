package mvc;
import  mvc.model.Kucing;

public class KucingMain {
    public static void main(String[] args) {
         Kucing objectKucing = new Kucing("Kitti", 2);

        objectKucing.makan();
        //object makan bisa dipanggil krna inherit dari kucing 
        objectKucing.meong();
        objectKucing.getNama();
        objectKucing.getUmur();
    }

   

}
