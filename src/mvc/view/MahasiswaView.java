package mvc.view;

import mvc.model.Mahasiswa;

public class MahasiswaView {

    // Mahasiswa itu import dari model Mahasiswa lalu dijadikan object mhs yg isinya
    // umur dan nama
    // simplenya parameter akses object mahasiswa
    public void tampilkanData(Mahasiswa mhs) {
        System.out.println("Nama : " + mhs.nama);
        System.out.println("Umur : " + mhs.umur);
        System.out.println("Jurusan : " + mhs.jurusan);
    }
}
