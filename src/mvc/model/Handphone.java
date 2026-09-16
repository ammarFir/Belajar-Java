package mvc.model;

public class Handphone extends ProdukElektronik {
    private int ram ,storage;

    //bikinconstructor 3 paramter extends produkelektronik + 2 bawaan class hp
    public Handphone (String nama, String merek , double harga, int ram , int storage) {
        super(nama, merek, harga);
        this.ram = ram;
        this.storage = storage;
    }

    public  int getRam () {
        return  ram;
    }

    public  int getStorage () {
        return  storage;
    }

    //setter public void (no return) dan berparameter
    public void setRam (int ram){
        this.ram = ram;
    }

    public  void setStorage (int storage) {
        this.storage = storage;
    }

    @Override 
    public void info () {
        System.out.println("HP - Nama : " + nama  );
        System.out.println("Merek : " + merek   );
        System.out.println("Harga : " + harga  );
        System.out.println("RAM : " + ram + " GB "  );
        System.out.println("Storage: " + storage + " GB ");
    }

    @Override  
    public double diskon () {
        double diskon = harga * 0.10;
        return  diskon;
    }
}
