public class Main {
    public static void main(String[] args){
        // Membuat object
        BangunDatar lingkaran = new Lingkaran("Hijau",5);
        BangunDatar segitiga = new Segitiga("Oren",8,7);
        BangunDatar persegi = new Persegi("Kuning",9,4);
        
        /*memanggil method gambar*/
        lingkaran.gambar();
        segitiga.gambar();
        persegi.gambar();
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Luas Persegi: " + persegi.luas()
        );
    }
}