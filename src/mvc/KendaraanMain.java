package mvc;
import  mvc.model.MobilKendaraan;
import  mvc.model.MotorKendaraan;

public class KendaraanMain {
    public static void main(String[] args) {
        MobilKendaraan objectMobil = new MobilKendaraan ("Toyota" , 2020, 4);
        objectMobil.info();
        objectMobil.bergerak();
        objectMobil.berhenti();
        objectMobil.klakson();

        MotorKendaraan objectMotor = new  MotorKendaraan("Honda", 2022, "Matic");
        objectMotor.info();
        objectMotor.bergerak();
        objectMotor.berhenti();
        objectMotor.gasPol();
    }
}
