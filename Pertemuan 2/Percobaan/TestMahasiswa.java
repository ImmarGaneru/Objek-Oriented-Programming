/**
 * TestMahasiswa
 */
public class TestMahasiswa {

    public static void main(String[] args) {
        Mahasiswa mhs1=new Mahasiswa();
        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl. Vinolia No 1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();

        Mahasiswa mhs2=new Mahasiswa(102, "Dafa", "Jl. Mawar No 20", "1A");
        Mahasiswa mhs3=new Mahasiswa(103, "Noval", "Jl. Orchid No 2C", "1A");

        mhs2.tampilBiodata();
        mhs3.tampilBiodata();
    
    }
}