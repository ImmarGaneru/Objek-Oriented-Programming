public class Dosen{
    public int nip;
    public String nama, alamat;

    public Dosen(int nip, String nama, String alamat){
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tampilBiodata(){
        System.out.println(
            "Nama\t:" + nama +
            "\nNip\t:" + nip +
            "\nAlamat\t:" + alamat
        );
    }
}