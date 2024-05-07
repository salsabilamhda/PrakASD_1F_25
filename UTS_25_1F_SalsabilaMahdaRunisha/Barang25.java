package UTS_25_1F_SalsabilaMahdaRunisha;

public class Barang25 {
    String kodeBarang, nama, kategori;
    int stok, harga;

    public Barang25 (String kodeBarang, String nama, String kategori, int stock, int harga){
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        stok = stock;
        this.harga = harga;
    }

    void tampilDataBarang25(){
           
                System.out.println("Kode Barang : " + kodeBarang);
                System.out.println("Nama Barang : " + nama);
                System.out.println("Kategori    : " + kategori);
                System.out.println("Stok        : " + stok);
                System.out.println("Harga       : Rp " + harga);
            
        }
    }

