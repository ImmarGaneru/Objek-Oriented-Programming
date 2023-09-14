public class MataKuliah {
    public String nama;
    public int nilai, sks;

    public MataKuliah(String nama, int nilai, int sks){
        this.nama = nama;
        this.nilai =nilai;
        this.sks = sks;
    }
    
    public void tampilData(){
        System.out.println(
            "Nama\t:" + nama +
            "\nNilai\t:" + nilai +
            "\nSKS\t:" + sks
        );
    }
    
}