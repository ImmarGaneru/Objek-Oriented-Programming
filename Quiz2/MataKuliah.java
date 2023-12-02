public class MataKuliah {
    //Pendeklarasian atribut kelas
    private String nama_mataKuliah;
    private int sks, i=0;
    private double[] nilai_mahasiswa;

    //Pembuatan konstruktor
    MataKuliah(String nama_mataKuliah, int sks, double[] nilai_mahasiswa){
        this.nama_mataKuliah = nama_mataKuliah;
        this.sks = sks;
        this.nilai_mahasiswa = nilai_mahasiswa;
    }

    //Getter untuk atribut di kelas ini
    public String getNama_mataKuliah() {
        return nama_mataKuliah;
    }
    public int getSks() {
        return sks;
    }

    //method yang digunakan untuk mendapatkan bobot mata kuliah yaitu nilai dikalikan dengan jumlah sks
    public double hitung_bobot(){
        double bobot = 0;
        bobot = nilai_mahasiswa[i] * sks;
        i++;
        return bobot;
    }
    public double hitung_bobot(double bobot_mahasiswa){
        double bobot = 0;
        for(int i = 0;i<nilai_mahasiswa.length;i++){
            bobot = nilai_mahasiswa[i] * sks * bobot_mahasiswa;
        }
        return bobot;
    }

}
