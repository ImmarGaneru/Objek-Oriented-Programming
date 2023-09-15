package Tugas;

public class Anggota {
    private String noKtp;
    private String nama;
    private int limit;
    private int pinjaman;

    Anggota(String noKtp, String nama, int limit){
        this.noKtp = noKtp;
        this.nama = nama;
        this.limit = limit;
        this.pinjaman = 0;
    }

    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limit;
    }
    public void pinjam(int uang){
        if (uang > limit){
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            pinjaman += uang;
        }
    }
    public int getJumlahPinjaman(){
        return pinjaman;
    }
    public void angsur(int uang){
        if (pinjaman < uang){
            System.out.println("Pinjaman anda lebih kecil dari uang yang anda masukkan");
        } else if(uang < (0.1 * pinjaman)){
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            pinjaman -= uang;
        }
    }

}
