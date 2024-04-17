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
            System.out.println("5. Keluar");
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
                    konfirmasi = false; //kode baru
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi");
            }
        }
    }
}
