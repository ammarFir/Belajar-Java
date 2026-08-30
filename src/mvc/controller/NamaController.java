package mvc.controller;

import java.util.ArrayList;
import mvc.view.NamaView;

public class NamaController {
    public void tampilkanDaftarNama() {
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Deankt");
        daftarNama.add("Mada");
        daftarNama.add("Ade");
        daftarNama.add("LukiAdonan");

        NamaView nView = new NamaView();
        nView.tampilkanNama(daftarNama);
    }

}
