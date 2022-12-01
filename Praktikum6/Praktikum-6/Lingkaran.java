public class Lingkaran extends BangunDatar {
    private int r;
    
    public Lingkaran(String warna ,int r){
        super(warna);
        this.r = r;
    }
    
    public int getR(){
        return r;
    }
    public void setR(int r){
        this.r = r;
    }
    
    @Override
    public void gambar(){
        System.out.println("Gambar Lingkaran");
    }
    
    @Override
    public float luas(){
        return (float) (Math.PI * r * r);
    }
}