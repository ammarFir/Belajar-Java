package myfolder.latihan;

import java.util.*;

public class Challenge14 {

    public static void main(String[] args) {
        // panggil scanner
        Scanner suhu = new Scanner(System.in);
        int inputCelcius;

        System.out.print("Masukkan suhu Celcius :");
        // input diassign ke variable
        inputCelcius = suhu.nextInt();

        // nilai dari variable inputcelcius dimasukkan ke fungsi , lalu fungsi tsb
        // diaasign ke variable double
        double celciusFahrenheit = celciusToFahrenheit(inputCelcius);
        double celciusKelvin = celciusToKelvin(inputCelcius);

        // print hasil by input
        suhu.close();
        cetakHasil(celciusFahrenheit, celciusKelvin);

    }

    public static double celciusToFahrenheit(double celcius) {
        double convert = (celcius * 9 / 5) + 32;

        return convert;
    }

    public static double celciusToKelvin(double celcius) {
        double convert = celcius + 273.15;

        return convert;
    }

    public static void cetakHasil(double fahrenheit, double kelvin) {
        System.out.println("Fahrenheit : " + fahrenheit);
        System.out.println("Kelvin : " + kelvin);
    }

}
