package P2.SistemBuku;

public class Buku25 {
    String judul, pengarang;
    int halaman, stok, harga;

    // public Buku25() {

     // }
    
    public Buku25(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang =pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang : "+ pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {   //modifikasi
            stok -= jml;
        } else {
            System.out.println("Maaf stok buku telah habis terjual");
        }
        
        
        //stok -= jml; (kode lama)
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
}





