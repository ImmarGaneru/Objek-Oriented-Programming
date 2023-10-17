package Tugas;

public class Dosen extends Pegawai{
    private int jumlahSKS;
    private int tarifSKS;

    public Dosen(String nip, String nama, String alamat){
        super(nip, nama, alamat);
        this.tarifSKS = 200000;
        setSKS(20);
    }
    public void setSKS(int jumlah){
        this.jumlahSKS = jumlah;
    }
    @Override
    public int getGaji(){
        return this.jumlahSKS * this.tarifSKS;
    }
}
