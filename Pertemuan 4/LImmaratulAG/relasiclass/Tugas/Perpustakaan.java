package LImmaratulAG.relasiclass.Tugas;

public class Perpustakaan {
    private String kode;
    private Rak[] arrRak;

    Perpustakaan(String kode){
        this.kode = kode;
        this.arrRak = new Rak[10];
        this.initRak();
    }
    private void initRak(){
        for (int i = 0; i < arrRak.length; i++){
            this.arrRak[i] = new Rak(String.valueOf(i + 1));
        }
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getKode() {
        return kode;
    }
    public void setBuku(Buku buku, int nomor){
        if(this.arrRak[nomor].getBuku() != null){
            setBuku(buku, nomor+1);
        } else {
            this.arrRak[nomor].setBuku(buku);
        }
    }
    public int getJumlahRak() {
        return arrRak.length;
    }

    public Rak getRakByNomor(int nomor) {
        if (nomor >= 0 && nomor < arrRak.length) {
            return arrRak[nomor];
        } else {
            return null; // Mengembalikan null jika nomor rak tidak valid
        }
    } 
    public String info(){
        String info = "";
        for(Rak rak : arrRak){
            info+= rak.info();
        }
        return info;
    }
}
