package LImmaratulAG.relasiclass.Tugas;

import java.util.Scanner;

public class MainPerpus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan("A");
        //Bagian penambahan buku
        Buku buku1 = new Buku("Harry Potter: Sorcerer's stone", "J.K Rowling", 3);
        perpus.setBuku(buku1, 0);
        Buku buku2 = new Buku("Harry Potter: Chamber of secrets", "J.K Rowling", 3);
        perpus.setBuku(buku2, 1);
        int option = 0;
        
    do{
        //Tempat memasukkan pilihan 
        System.out.println("MENU\n1. Daftar Buku\n2. Peminjaman\n3. Pengembalian\n4. Keluar");
        option = sc.nextInt();
        switch(option){
            case 1:
                System.out.println(perpus.info());
                break;
            case 2:
                //Memilih buku yang ingin dipinjam dengan memasukkan nomor indeks buku tersebut di array Rak
                System.out.println("Masukkan nomor buku yang ingin dipinjam (indeks dalam arrRak):");
                int nomorBuku = sc.nextInt();
                if (nomorBuku >= 0 && nomorBuku < perpus.getJumlahRak()) {
                    Rak rakPeminjaman = perpus.getRakByNomor(nomorBuku);
                    if (rakPeminjaman != null) {
                        System.out.println("Masukkan jumlah buku yang ingin dipinjam:");
                        int jumlahPeminjaman = sc.nextInt();
                        Peminjaman peminjaman = new Peminjaman(rakPeminjaman.getBuku(), jumlahPeminjaman);
                        peminjaman.pinjam(jumlahPeminjaman);
                    } else {
                        System.out.println("Buku tidak ditemukan dalam rak.");
                    }
                } else {
                    System.out.println("Nomor buku tidak valid.");
                }
                break;
                case 3:
                    //Memilih buku yang ingin dikembalikan dengan memasukkan nomor indeks buku tersebut di array Rak
                    System.out.println("Masukkan nomor buku yang ingin dikembalikan (indeks dalam arrRak):");
                    int nomorBukuKembali = sc.nextInt();
                    if (nomorBukuKembali >= 0 && nomorBukuKembali < perpus.getJumlahRak()) {
                        Rak rakPengembalian = perpus.getRakByNomor(nomorBukuKembali);
                        if (rakPengembalian != null) {
                            System.out.println("Masukkan jumlah buku yang ingin dikembalikan:");
                            int jumlahPengembalian = sc.nextInt();
                            Peminjaman pengembalian = new Peminjaman(rakPengembalian.getBuku(), jumlahPengembalian);
                            pengembalian.kembalikan(jumlahPengembalian);
                        } else {
                            System.out.println("Buku tidak ditemukan dalam rak.");
                        }
                    } else {
                        System.out.println("Nomor buku tidak valid.");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;

        }
    } while (option != 4);

    }
}
