package P8;

import java.util.Scanner;

public class Utama25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tentukan Kapasitas Gudang: "); //modifikasi pertanyaan 4
        int kapasitas = scanner.nextInt();
        Gudang25 gudang = new Gudang25(kapasitas);
        System.out.print("Kapasitas gudang saat ini adalah: " + kapasitas);
        boolean konfirmasi = true; //kode baru

        //while(true){ kode lama
        while(konfirmasi){ //kode baru
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Lihat Barang Teratas"); //modifikasi pertanyaan 4
            System.out.println("5. Lihat Barang Terbawah"); //Latihan Praktikum 1
            System.out.println("6. Cari Barang"); //Latihan Praktikum 2
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan){
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang25 barangBaru = new Barang25(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas(); //modifikasi pertanyaann 4
                    break;
                case 5:
                    gudang.lihatBarangTerbawah(); //Latihan Praktikum 1
                    break;
                case 6: //Latihan Praktikum 2
                    System.out.println("Cari Barang Berdasarkan: ");
                    System.out.println("1. Kode Barang");
                    System.out.println("2. Nama barang");
                    System.out.print("Masukkan Pilihan Anda: ");
                    int choice = scanner.nextInt();
                    switch(choice){
                        case 1: 
                            System.out.println("=============================");
                            System.out.println("Pencarian berdasarkan Kode Barang");
                            System.out.print("Masukkan kode barang: ");
                            int cari = scanner.nextInt();
                            int posisi = gudang.CariBarangKode(cari);
                            gudang.TampilPosisiKode(cari, posisi);
                            gudang.TampilDataKode(cari, posisi);
                            break;
                        case 2:
                            System.out.println("=============================");
                            System.out.println("Pencarian berdasarkan Nama Barang");
                            scanner.nextLine();
                            System.out.print("Masukkan nama barang: ");
                            String cari2 = scanner.nextLine(); 
                            posisi = gudang.CariBarangNama(cari2);
                            if (posisi != -1) {
                                gudang.TampilPosisiNama(cari2, posisi);
                                gudang.TampilDataNama(cari2, posisi);
                            } else {
                                System.out.println("Data " + cari2 + " tidak ditemukan");
                            }
                            break;
                        default:
                            System.out.println("Pilihan yang kamu masukkan tidak valid.");
                            break;
                        }
                case 7:
                    konfirmasi = false; //kode baru
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi");
            }
        }
    }
}

