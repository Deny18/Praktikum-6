public class Persegi extends BangunDatar {
    private float panjang;
    private float lebar;
    
    public Persegi(String warna, float panjang, float lebar){
        super(warna);
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public float getPanajng(){
        return panjang;
    }
    public void setPanajng(float panjang){
        this.panjang = panjang;
    }
    
    public float getLebar(){
        return lebar;
    }
    public void setLebar(float lebar){
        this.lebar = lebar;
    }
    
    @Override
    public void gambar(){
        System.out.println("Gambar Persegi");
    }
    
    @Override
    public float luas(){
        return panjang * lebar;
    }
    
}
