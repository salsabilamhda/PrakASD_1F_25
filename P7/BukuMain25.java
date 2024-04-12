package P7;

import java.util.Scanner;

public class BukuMain25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        PencarianBuku25 data = new PencarianBuku25();
        int jumBuku = 5;

        System.out.println("------------------------------");
        System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil : ");
        for (int i = 0; i<jumBuku; i++){
            System.out.println("------------------");
            System.out.print("Kode Buku \t : ");
            String kodeBuku = s.nextLine();
            System.out.print("Judul Buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            s.nextLine();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t         : ");
            int stock = s.nextInt();
            s.nextLine();

            Buku25 m = new Buku25(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();


        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku \t : ");
        String cari = s.nextLine();
       // int posisi = data.FindKodeSeqSearch(null);
       // data.Tampilposisi(null, posisi);
       // data.TampilData(null, posisi);

        //LATIHAN
        System.out.println("==============================");
        System.out.println("menggunakan Sequential Search");
        System.out.println("==============================");
        int posisi = data.FindKodeSeqSearch(cari); 
        data.Tampilposisi(cari, posisi); 
        data.TampilData(cari, posisi); 

        System.out.println("==============================");
        System.out.println("menggunakan Binary Search");
        System.out.println("==============================");
        String kodeBukuDitemukan = data.FindKodeBinarySearch(cari, 0, jumBuku - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        //modifikasi
        //Buku25 dataBuku25 = data.FindBuku(cari);
        //dataBuku25.tampilDataBuku();

        //Binary
        //System.out.println("==============================");
        //System.out.println("menggunakan binary Search");
        //posisi = data.FindBinarySearch(cari, 0, jumBuku -1);
        //data.Tampilposisi(cari, posisi);
        //data.TampilData(cari, posisi);
    }

    
}
