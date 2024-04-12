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

        System.out.println("===============================");
        System.out.println("Data keseluruhan Buku: ");
        data.tampil();

        System.out.println("Metode Pencarian Buku: ");
        System.out.println("1. Cari dengan Kode Buku");
        System.out.println("2. Cari dengan Judul Buku");
        System.out.print("Masukkan pilihan Anda: ");
        int choice = s.nextInt();

        switch (choice) {
            case 1 :
                System.out.println("===============================");
                System.out.println("Pencarian Data:");
                System.out.print("Masukkan Kode Buku yang dicari: ");
                String cari = s1.nextLine();
                int posisi = data.FindKodeSeqSearch(cari);
            
                System.out.println("===============================");
                System.out.println("Menggunakan Sequential Search Method FindBuku");
            
                if (posisi != -1) {
                    Buku25 dataBuku = data.FindBuku(cari);
                    if (dataBuku != null) {
                        dataBuku.tampilDataBuku();
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                } else {
                    System.out.println("Data tidak ditemukan");
                }
            
                System.out.println();
                System.out.println("===============================");
                System.out.println("Menggunakan Binary Search");
                String result = data.FindKodeBinarySearch(cari, 0, jumBuku - 1);
                if (result != null) {
                    int binarySearchPos = data.FindKodeSeqSearch(result); // Cari posisi menggunakan Sequential Search
                    data.TampilData(result, binarySearchPos);
                } else {
                    System.out.println("Data tidak ditemukan");
                }
                break;
            
            case 2:
                System.out.println();
                System.out.println("===============================");
                System.out.println("Pencarian Data  :");
                System.out.println("Masukkan Judul Buku yang dicari: ");
                System.out.print("Judul Buku   : ");
                cari = s1.nextLine();
                System.out.println("===============================");
                System.out.println("Menggunakan Sequential Search Method FindBuku");
                Buku25[] foundBooks = data.FindJudulBuku(cari);
                if (foundBooks != null) {
                    for (Buku25 buku : foundBooks) {
                        buku.tampilDataBuku();
                    }

                    if (foundBooks.length > 1) {
                        System.out.println("Ditemukan lebih dari 1 data buku dengan judul " + cari);
                    }

                } else {
                    System.out.println("Data tidak ditemukan");
                }

                System.out.println();
                System.out.println("===============================");
                System.out.println("Menggunakan Binary Search");
                data.findAllJudulBukuBinarySearch(cari, 0, jumBuku - 1);
                break;


            default:
                System.out.println("Mohon Maaf, pilihan Anda tidak tersedia.");
                break;
        }
        
        
    }   
    
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

    

