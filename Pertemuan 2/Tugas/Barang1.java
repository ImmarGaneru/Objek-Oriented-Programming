public class Barang1 {
    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    Barang1(String kode, String namaBarang, int hargaDasar, float diskon){
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }

    public int hitungHargaJual(){
        int hargaJual = hargaDasar - (int)(hargaDasar * diskon);
        return hargaJual;
    }

    public void tampilData(){
        System.out.println("Barang: " + namaBarang);
        System.out.println("Kode: " + kode);
        System.out.println("Harga awal: Rp" + hargaDasar);
        System.out.println("Diskon: " + (int)(diskon*100) + "%");
        System.out.println("Harga akhir: Rp" + hitungHargaJual());
    }
    
}