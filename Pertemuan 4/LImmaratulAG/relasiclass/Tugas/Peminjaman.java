package LImmaratulAG.relasiclass.Tugas;

public class Peminjaman {
    private Buku buku;
    private int jumlahPinjam;

    public Peminjaman(Buku buku, int jumlahPinjam) {
        this.buku = buku;
        this.jumlahPinjam = jumlahPinjam;
    }

    public void pinjam(int jumlah) {
        if (jumlah <= buku.getJumlah() && jumlah > 0) {
            buku.setJumlah(buku.getJumlah() - jumlah);
            jumlahPinjam += jumlah;
            System.out.println(jumlah + " buku " + buku.getJudul() + " berhasil dipinjam.");
        } else {
            System.out.println("Jumlah buku yang diminta tidak tersedia.");
        }
    }

    public void kembalikan(int jumlah) {
        if (jumlah <= jumlahPinjam && jumlah > 0) {
            buku.setJumlah(buku.getJumlah() + jumlah);
            jumlahPinjam -= jumlah;
            System.out.println(jumlah + " buku " + buku.getJudul() + " berhasil dikembalikan.");
        } else {
            System.out.println("Jumlah buku yang dikembalikan tidak valid.");
        }
    }
}
