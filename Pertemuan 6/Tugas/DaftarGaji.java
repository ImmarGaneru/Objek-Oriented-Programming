package Tugas;

public class DaftarGaji {
    private Pegawai[] listPegawai; 

    public DaftarGaji(int kapasitas){
        this.listPegawai = new Pegawai[kapasitas];
    }
    public void addPegawai(Pegawai pegawai){
        for (int i = 0; i < listPegawai.length; i++) {
            if (listPegawai[i] == null) {
                listPegawai[i] = pegawai;
                break;
            }
        }   
    }
    public void printSemuaGaji(){
        for(Pegawai pegawai : this.listPegawai){
            if (pegawai == null){
                break;
            }
            System.out.println("Nama\t: " + pegawai.getNama() + "\nGaji\t: " + pegawai.getGaji() + "\n");
        }
    }
}
