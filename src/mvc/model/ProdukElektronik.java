package mvc.model;

public class ProdukElektronik {
    //deklare variable
    protected String nama,merek;
    protected double harga;


    //constructor
    public ProdukElektronik (String nama, String merek, double harga) {
        this.nama = nama;
        this.merek = merek;
        this.harga = harga;
    }


    //getter
    public String getNama () {
        return  nama;
    }

    public String getMerek () {
        return merek;
    }

    public double getHarga () {
        return harga;
    }

    //setter
    public void setNama (String nama) {
        this.nama = nama;
    }
    public void setMerek (String merek) {
        this.merek = merek;
    }

    public  void setHarga (double harga) {
        this.harga = harga;
    }


    public void  info () {
        System.out.println("Nama  : " + nama);
        System.out.println("Merek  : " + merek);
        System.out.println("Harga  : " + harga);
    }

    public double diskon(){
        double diskon = harga * 0.05;
        return diskon;
    }




}
