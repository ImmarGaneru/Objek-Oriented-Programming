public class TestGame {

    public static void main(String[] args) {
        game g1 = new game(001, "Dafa", "Naruto: Ninja Storm 4", 50000, 2);

        g1.dataPeminjaman(g1.hargaSewa(g1.harga, g1.sewa));
    }
}