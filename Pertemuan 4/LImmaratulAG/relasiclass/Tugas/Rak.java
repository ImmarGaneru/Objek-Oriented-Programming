package LImmaratulAG.relasiclass.Tugas;

public class Rak {
    private Buku buku;
    private String kode;

    Rak(String kode){
        this.kode = kode;
    }
    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getKode() {
        return kode;
    }
    public void setBuku(Buku buku){
        this.buku = buku;
    }
    public Buku getBuku() {
        return buku;
    }
    public String info(){
        String info = "";
        if (this.buku != null){
            info += buku.info() + "\n";
        }
        return info;
    }
    
}
