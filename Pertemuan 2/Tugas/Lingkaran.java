public class Lingkaran {
    public double phi, r;
    
    Lingkaran(double phi, double r){
        this.phi = phi;
        this.r = r;
    }

    public double hitungLuas(){
        double luas = phi * r * r;
        return luas;
    }

    public double hitungKeliling(){
        double keliling = 2 * phi * r;
        return keliling;
    }
    
}