public class Persegi {
    public int sisi, luas, keliling;

    public void tampilPersegi(int sisi){
        System.out.println("Sisi    : " + sisi);
    }

    public void luasPersegi(int sisi){
        luas = sisi * sisi;
        System.out.println("Luas    : " + luas);
    }

    public void kelilingPersegi(int sisi){
        keliling = 4 * sisi;
        System.out.println("Keliling: " + keliling);
    }
    
}