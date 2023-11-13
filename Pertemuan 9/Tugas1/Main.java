package Tugas1;

public class Main {
    public static void main(String[] args) {
        Segitiga s = new Segitiga();

        System.out.println("Method total sudut 1: " + s.totalSudut(60));
        System.out.println("Method total sudut 2: " + s.totalSudut(60,60));
        System.out.println("Method keliling 1: " + s.keliling(4, 3, 5));
        System.out.println("Method keliling 2: " + s.keliling(4, 3));
        
    }
}
