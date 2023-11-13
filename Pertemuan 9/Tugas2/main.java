package Tugas2;

public class main {
    public static void main(String[] args) {
        Manusia man = new Manusia();
        Mahasiswa mhs = new Mahasiswa();
        Dosen dsn = new Dosen();

        System.out.println("Class Manusia");
        man.bernafas();
        man.makan();
        System.out.println("");
        System.out.println("Class Dosen");
        dsn.makan();
        dsn.lembur();
        System.out.println("");
        System.out.println("Class Mahasiswa");
        mhs.makan();
        mhs.tidur();
        System.out.println("");
    }
}
