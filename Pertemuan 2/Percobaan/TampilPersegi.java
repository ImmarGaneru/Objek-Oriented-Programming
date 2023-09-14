import java.util.Scanner;

public class TampilPersegi {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        Scanner sc=new Scanner(System.in);
        int s;

        do{
            System.out.print("Masukkan sisi persegi(-1 untuk berhenti) : ");
            s = sc.nextInt();
            if(s<0){
                break;
            }
            p.tampilPersegi(s);
            p.luasPersegi(s);
            p.kelilingPersegi(s);
        }while(s!=0);
    }
    
}