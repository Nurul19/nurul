/**
 * Created by lenovo on 6/10/2015.
 */
public class Helm {
    private String namaHelm;
    private int hargaHelm;
    private int jumlah;
    private Author Pemilik;

    public Helm(String namaHelm, int hargaHelm, int jumlah, Author pemilik) {
        this.namaHelm = namaHelm;
        this.hargaHelm = hargaHelm;
        this.jumlah = jumlah;
        Pemilik = pemilik;
    }

    public int getHargaHelm() {
        return hargaHelm;
    }

    public void setHargaHelm(int hargaHelm) {
        this.hargaHelm = hargaHelm;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getNamaHelm() {
        return namaHelm;
    }

    public void setNamaHelm(String namaHelm) {
        this.namaHelm = namaHelm;
    }

    public Author getPemilik() {
        return Pemilik;
    }

    public void setPemilik(Author pemilik) {
        Pemilik = pemilik;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "hargaHelm=" + hargaHelm +
                ", namaHelm='" + namaHelm + '\'' +
                ", jumlah=" + jumlah +
                ", Pemilik=" + Pemilik +
                '}';
    }
}
