import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int nim, semester;
        String namaMhs, alamatMhs, kelas;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nim     :");
        nim=sc.nextInt();
        System.out.print("Semester:");
        semester=sc.nextInt();
        sc.nextLine();
        System.out.print("Nama    :");
        namaMhs=sc.nextLine();
        System.out.print("Alamat  :");
        alamatMhs=sc.nextLine();
        System.out.print("Kelas   :");
        kelas=sc.nextLine();
        Mahasiswa mhs = new Mahasiswa(nim, semester, namaMhs, alamatMhs, kelas);

        mhs.tampilBiodata();
    }    
}