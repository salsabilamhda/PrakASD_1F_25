package P7;

public class Buku25 {
    //int kodeBuku;  >> kode lama
    String kodeBuku; //modifikasi latihan
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    //public Buku25(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock){ >> kode lama
    public Buku25(String kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stock){ //modifikasi latihan 1
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampilDataBuku(){
        System.out.println("=========================");
        System.out.println("Kode buku    : "+kodeBuku);
        System.out.println("Judul buku   : "+judulBuku);
        System.out.println("Tahun Terbit : "+tahunTerbit);
        System.out.println("Pengarang    : "+pengarang);
        System.out.println("Stock        : "+stock);
    }
}
