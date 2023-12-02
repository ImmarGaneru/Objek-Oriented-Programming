public class Main {
    public static void main(String[] args) {
        //deklarasi object mahasiswa1 dan mahasiswa2
        Mahasiswa mahasiswa1 = new Mahasiswa("Immar", "12345", new double[] {4, 4});
        Mahasiswa mahasiswa2 = new Mahasiswa("Bob", "67890", new double[] {3, 3.5});

        //deklarasi object mataKuliah1 dan mataKuliah2
        MataKuliah mataKuliah1 = new MataKuliah("GUI", 3, new double[] {4, 3});
        MataKuliah mataKuliah2 = new MataKuliah("Basis Data", 4, new double[] {4, 3.5});

        //pembuatan objek perwalian dan pemanggilan method untuk menambahkan objek yang diatas untuk dijadikan array of objek
        Perwalian perwalian = new Perwalian();
        perwalian.tambahMahasiswa(mahasiswa1);
        perwalian.tambahMahasiswa(mahasiswa2);

        perwalian.tambahMataKuliah(mataKuliah1);
        perwalian.tambahMataKuliah(mataKuliah2);

        perwalian.cetak();
    }
}
