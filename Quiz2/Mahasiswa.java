public class Mahasiswa {
    //Pendeklarasian atribut kelas
    private String nama, nim;
    private double[] nilai;

    //Pembuatan konstruktor
    Mahasiswa(String nama, String nim, double[] nilai){
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    //Getter untuk atribut di kelas ini
    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }

    //method yang digunakan untuk mendapatkan nilai IPK dari total bobot 
    public double hitung_ipk(double bobot){
        double ipk = 0;
        ipk = bobot;
        return ipk;
    }

    //mathod overload dari hitung_ipk yang mengambil ipk dari pembagian total bobot dan total sks
    public double hitung_ipk(double nilai_sks, double bobot){
        double ipk = 0;
        ipk = bobot/nilai_sks;
        return ipk;
    }
}
