package mvc.controller;

import mvc.model.Pegawai;
import mvc.view.PegawaiView;
import java.util.*;

public class PegawaiController {
    public void tampilkanData() {
        Scanner input = new Scanner(System.in);

        String nama;
        do {
            System.out.print("Masukkan nama pegawai : ");
            nama = input.nextLine();

            if (nama.trim().equals("")) {
                System.out.println("Nama pegawai tidak boleh kosong ! ");
            }
        } while (nama.trim().equals(""));

        String nip;
        do {
            System.out.print("Masukkan NIP : ");
            nip = input.nextLine();

            if (nip.length() < 5) {
                System.out.println("NIP minimal 5 karakter ! ");
            }
        } while (nip.length() < 5);

        double gapok;
        do {
            System.out.print("Masukkan gaji pokok : ");
            gapok = input.nextDouble();

            if (gapok < 3000000) {
                System.out.println("Gaji pokok minimal 3.000.000");
            }
        } while (gapok < 3000000);

        int jamLembur;
        do {
            System.out.print("Masukkan jam lembur : ");
            jamLembur = input.nextInt();

            if (jamLembur < 0) {
                System.out.println("Jam tidak boleh minus");
            }

            if (jamLembur > 40) {
                System.out.println("Tidak boleh lebih 40 jam");
            }
        } while (jamLembur < 0 || jamLembur > 40);
        Pegawai modelPegawai = new Pegawai(nama, nip, gapok, jamLembur);
        PegawaiView vPegawai = new PegawaiView();
        vPegawai.tampilkanData(modelPegawai);

        input.close();

    }

}
