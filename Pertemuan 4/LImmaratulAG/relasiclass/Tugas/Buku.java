package LImmaratulAG.relasiclass.Tugas;

public class Buku {
    String judul;
    String penulis;
    int jumlah;
    
    Buku(String judul, String penulis, int jumlah){
        this.judul = judul;
        this.penulis = penulis;
        this.jumlah = jumlah;
    }
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public String getJudul() {
        return judul;
    }
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    public String getPenulis() {
        return penulis;
    }
    public int getJumlah(){
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public String info(){
        String info = "";
        info += "Judul: " + judul + "\n";
        info += "Penulis: " + penulis + "\n";
        info += "Jumlah: " + jumlah+ "\n";
        return info;
    }
    
}
