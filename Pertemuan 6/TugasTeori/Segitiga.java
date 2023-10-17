package TugasTeori;

public class Segitiga extends BangunDatar{
    private float alas;
    private float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public float keliling() {
        float sisiMiring = (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
        return alas + sisiMiring*2;
    }
}
