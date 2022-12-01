public class Segitiga extends BangunDatar {
    private int tinggi;
    private int alas;
    
    public Segitiga(String warna, int tinggi, int alas){
        super(warna);
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    public int getTinggi(){
        return tinggi;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    public int getAlas(){
        return alas;
    }
    public void setAlas(int alas){
        this.alas = alas;
    }
    
    @Override
    public void gambar(){
        System.out.println("Gambar Segitiga");
    }
    
    @Override
    public float luas(){
        return this.alas * this.tinggi * 1/2;
    }
}