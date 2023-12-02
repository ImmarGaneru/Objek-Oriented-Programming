public class Perwalian {
    //Pendeklarasian atribut kelas
    private Mahasiswa[] m;
    private MataKuliah[] mk;
    private int jumlahMahasiswa;
    private int jumlahMataKuliah;
    private int nilaiSks=0;
    private double bobot=0, totalBobot = 0;

    //Pembuatan konstruktor
    Perwalian(){
        m = new Mahasiswa[100];
        mk = new MataKuliah[100];
        jumlahMahasiswa = 0;
        jumlahMataKuliah = 0;
    }

    //method yang digunakan untuk memasukkan objek mahasiswa dan mataKuliah menjadi array of object
    public void tambahMahasiswa(Mahasiswa mahasiswa){
        m[jumlahMahasiswa++] = mahasiswa;
    }
    public void tambahMataKuliah(MataKuliah mataKuliah){
        mk[jumlahMataKuliah++] = mataKuliah;
    }

    //method yang digunakan untuk mencetak nilai dan data dari mahasiswa
    public void cetak(){
        System.out.println("Data Perwalian:\n");
        for(int i = 0;i<jumlahMahasiswa;i++){
            nilaiSks = 0;
            System.out.println("Mahasiswa: "+m[i].getNama()+"\nNIM: "+m[i].getNim());
            for(int j = 0;j<jumlahMataKuliah;j++){
                bobot = mk[j].hitung_bobot();
                System.out.println("  - "+mk[j].getNama_mataKuliah()+"\n     SKS: "+mk[j].getSks() + "\n     Bobot: "+bobot);
                nilaiSks += mk[j].getSks();
                totalBobot += bobot; 
                bobot = 0;
            }
            System.out.println("IPK: " + m[i].hitung_ipk(nilaiSks, totalBobot));
            totalBobot = 0;
            System.out.println("\n");
        }
    }

}
