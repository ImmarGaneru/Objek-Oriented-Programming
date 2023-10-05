public class Barang {
    private String id;
    private String nama;
    private int harga;

    Barang(String id, String nama, int harga){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getHarga() {
        return harga;
    }
    
}