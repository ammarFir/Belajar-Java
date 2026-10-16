package mvc.model;


public class TarifParkir {

public static double hitungTarif(String jenis, int lamaParkir) {
    double tarifDasar = 0;
    double denda = 0;
    if (jenis.equalsIgnoreCase("motor")) {
        tarifDasar = 2000;
    } else if  (jenis.equalsIgnoreCase("mobil")) {
        tarifDasar = 5000;
    } else if  (jenis.equalsIgnoreCase("truk")) {
        tarifDasar = 10000;
    } else {
        //jika tidak valid fungsi langsung berhenti dan mengembalikan -1
        return  -1;
    }

    if (lamaParkir > 5) {
        denda = 50000;
    }
    return (tarifDasar * lamaParkir) + denda;
}

public static String getStruk(KendaraanParkir kendaraan) {

    String struk = " === STRUK PARKIR === " 
                    + "\nPlat :  " + kendaraan.getPlatNomor()
                    + "\nJenis : " + kendaraan.getJenis()
                    + "\nMasuk : " + kendaraan.getJamMasuk()
                    + "\nKeluar : " + kendaraan.getJamKeluar()
                    + "\nLama : " + kendaraan.getLamaParkir()
                    + "\nTotal : " + hitungTarif(kendaraan.getJenis(), kendaraan.getLamaParkir() )
                    + "\n=====================";
        

                    return struk;
}

}
