package mvc.model;

public class Nasabah {
    private String nama, noRekening;
    private double saldo;

    public Nasabah(String nama, String noRekening, double saldo) {
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNama(String nama) {
        if (nama == null) {
            System.out.println("Nama tidak boleh kosong");
        } else {
            this.nama = nama;
        }
    }

    public void setNoRekening(String noRekening) {
        this.noRekening = noRekening;
    }

    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("Mohon maaf saldo tidak boleh kosong");
        } else {
            this.saldo = saldo;
        }
    }

}
