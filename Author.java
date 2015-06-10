/**
 * Created by lenovo on 6/10/2015.
 */
public class Author {
    private String namaPemilik;
    private String alamatPemilik;
    private char jenisKelamin;

    public Author(String alamatPemilik, String namaPemilik, char jenisKelamin) {
        this.alamatPemilik = alamatPemilik;
        this.namaPemilik = namaPemilik;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getAlamatPemilik() {
        return alamatPemilik;
    }

    public void setAlamatPemilik(String alamatPemilik) {
        this.alamatPemilik = alamatPemilik;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public String toString() {
        return "Author{" +
                "namaPemilik='" + namaPemilik + '\'' +
                ", alamatPemilik='" + alamatPemilik + '\'' +
                ", jenisKelamin=" + jenisKelamin +
                '}';
    }
}
