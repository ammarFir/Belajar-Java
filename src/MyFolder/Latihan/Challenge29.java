package myfolder.latihan;

import java.util.*;

public class Challenge29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int celcius;

        System.out.print("Masukkan suhu celcius : ");
        celcius = input.nextInt();

        double celciusToReamur = celciusToReamur(celcius);
        cetakHasil(celcius, celciusToReamur);
        input.close();
    }

    public static double celciusToReamur(double celcius) {
        double reamur = celcius * 4 / 5;
        return reamur;
    }

    public static void cetakHasil(double celcius, double reamur) {
        System.out.print(celcius + "°C = " + reamur + "°R");
    }
}
