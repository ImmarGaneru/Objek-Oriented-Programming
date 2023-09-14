public class Mahasiswa {
    public int nim;
    public String nama;
    public String alamat;
    public String kelas;

    Mahasiswa(){
        
    }

    Mahasiswa(int nim, String nama, String alamat, String kelas){
        this.nim=nim;
        this.nama=nama;
        this.alamat=alamat;
        this.kelas=kelas;
    }
    
    public void tampilBiodata(){
        System.out.println(
            "Nama     :" + nama +
            "\nNim      :" + nim +
            "\nKelas    :" + kelas +
            "\nAlamat   :" + alamat
        );
    }
    
}