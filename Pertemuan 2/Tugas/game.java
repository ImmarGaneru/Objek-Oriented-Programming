public class game {

    public int id, harga, sewa;
    public String namaMember, namaGame;

    game(int id, String namaMember, String namaGame, int harga, int sewa){
        this.id = id;
        this.namaMember = namaMember;
        this.namaGame = namaGame;
        this.harga = harga;
        this.sewa = sewa;
    } 

    public void dataPeminjaman(int bayar){
        System.out.println("Peminjam: " + namaMember);
        System.out.println("ID : " + id);
        System.out.println("Game : " + namaGame);
        System.out.println("Harga : " + bayar);

    }

    public int hargaSewa(int harga, int sewa){
        int bayar = harga * sewa;

        return bayar;
    }
}