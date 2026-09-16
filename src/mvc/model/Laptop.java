package mvc.model;

public class Laptop extends ProdukElektronik {

        private  String processor ;
        private int ram;

        public Laptop (String nama , String merek , int harga, String processor , int ram) {
            super(nama, merek, harga);
            this.processor = processor;
            this.ram = ram;
        }

        public String getProcessor () {
            return  processor;
        }
        public  int getRam () {
            return  ram;
        }

        public void setProcessor (String processor) {
            this.processor = processor;
        }

        public  void setRam (int ram) {
            this.ram = ram;
        }


        @Override  
        public  void info () {
        System.out.println("Laptop - Nama : " + nama  );
        System.out.println("Merek : " + merek   );
        System.out.println("Harga : " + harga  );
        System.out.println("Processor : " + processor );
        System.out.println("RAM : " + ram + " GB "  );
        }

        @Override  
        public double diskon () {
            double diskon = harga * 0.07;
             return  diskon;
        }
}
