package Tugas;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uang, option;
        System.out.println("Masukkan Identitas Nasabah\nNomor KTP: ");
        String noKtp = sc.nextLine();
        System.out.println("Nama     : ");
        String nama = sc.nextLine();
        Anggota donny = new Anggota(noKtp, nama, 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());

        do{
            System.out.println("Menu\n1. Pinjam uang\n2. Bayar angsuran\n3. Keluar");
            option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.print("Nominal pinjam: ");
                    uang = sc.nextInt();
                    System.out.println("\nMeminjam uang " + uang + "...");
                    donny.pinjam(uang);
                    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                    break;
                case 2:
                    System.out.print("Nominal angsuran: ");
                    uang = sc.nextInt();
                    System.out.println("\nMembayar angsuran " + uang);
                    donny.angsur(uang);
                    System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
                    break;
                default:
                    option = 3;
            }

        } while(option < 3);

    }
}
