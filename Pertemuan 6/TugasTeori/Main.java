package TugasTeori;

public class Main {
    public static void main(String[] args) {
        // Membuat objek persegi panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 20);

        // Menampilkan luas persegi panjang
        System.out.println("Luas persegi panjang: " + persegiPanjang.luas());

        // Menampilkan keliling persegi panjang
        System.out.println("Keliling persegi panjang: " + persegiPanjang.keliling());

        // Membuat objek lingkaran
        Lingkaran lingkaran = new Lingkaran(5);

        // Menampilkan luas lingkaran
        System.out.println("Luas lingkaran: " + lingkaran.luas());

        // Menampilkan keliling lingkaran
        System.out.println("Keliling lingkaran: " + lingkaran.keliling());

        // Membuat objek segitiga
        Segitiga segitiga = new Segitiga(10, 20);

        // Menampilkan luas segitiga
        System.out.println("Luas segitiga: " + segitiga.luas());

        // Menampilkan keliling segitiga
        System.out.println("Keliling segitiga: " + segitiga.keliling());
    }
}
