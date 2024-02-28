package P2.SistemBuku;

public class BukuMain25 {
    public static void main(String[] args) {
        Buku25 bk1 = new Buku25();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku25 bk2 = new Buku25("Sel Reward", "Maheera Ayesha", 160, 29, 59000); //modifikasi konstruktor
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku25 bukuSalsabila = new Buku25("Dilan 1990", "Pidi Baiq", 199, 3, 89000); //pertanyaan 5

      // Buku25 bk2 = new Buku25(); //modifikasi
      // bk2.judul = "How to Train Your Dragon";
      // bk2.pengarang = "Cressida Cowell";
      // bk2.halaman = 432;
      // bk2.stok = 0;
      // bk2.harga = 275000;

      // bk2.tampilInformasi();
      // bk2.terjual(4); //modifikasi
    }
}