package mvc.model;

public class Buku {
    // blueprint utama
    private String judul;
    private String penulis;
    private int tahunTerbit;

    // dijadikan constructor yg mana buku punya 3 komponen yaitu judul, penulis ,
    // dan tahun terbit
    // yg mana 3 komponen tsb diambil dari private variable diatas
    // ibaratkan formulir data yg menjadikan semua data dalam 1 form
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        // jdul milik object buku = judul dari variable diatas
        this.penulis = penulis;
        // penulis milik object buku = diassign kan datanya dari variable penulis
        // diatasnya
        this.tahunTerbit = tahunTerbit;
    }

    // get untuk mengambil nilai variable yg bersifat private
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // set untuk mengubah isi variable
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setTahunTerbit(int tahunTerbit) {
        if (tahunTerbit < 1900) {
            System.out.println("Tahun Terbit harus diatas 1900 !");
        } else {
            this.tahunTerbit = tahunTerbit;
        }
    }

}
