/**
 * Created by lenovo on 6/10/2015.
 */
public class testHelm {
    public static void main(String[] args) {
        Author Nurul = new Author("Nurul","Madiun",'P');
        System.out.println("Semua data : " + Nurul.toString());
        Nurul.setAlamatPemilik("Jl. Cindewilis, Madiun");
        System.out.println("Alamat Pemilik : " + Nurul.getAlamatPemilik());
        System.out.println("Nama Pemilik : " + Nurul.getNamaPemilik());
        System.out.println("Jenis Kelamin : " + Nurul.getJenisKelamin());

        Helm helmmbois = new Helm("INK",300000,15,Nurul);
        System.out.println(helmmbois.getPemilik().getNamaPemilik());
        System.out.println(helmmbois.toString());
    }
}
