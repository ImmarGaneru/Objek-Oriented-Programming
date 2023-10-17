package Tugas;

public class Main {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(10);
        
        // Tambahkan data pegawai
        daftarGaji.addPegawai(new Pegawai("1234567890", "Adi", "Jl. Jendral Sudirman"));
        daftarGaji.addPegawai(new Dosen("9876543210", "Budi", "Jl. Gatot Subroto"));

        // Tampilkan data gaji pegawai
        daftarGaji.printSemuaGaji();
    }
}
