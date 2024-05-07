package UTS_25_1F_SalsabilaMahdaRunisha;

import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        Scanner scanner25 = new Scanner(System.in);
        Barang25 data1 = new Barang25("Br001", "Leo Kripik", "Makanan", 10, 1000);
        Barang25 data2 = new Barang25("Br002", "YOU C100 Botol", "Minuman", 10, 7000);
        Barang25 data3 = new Barang25("Br003", "Teh Pucuk Botol", "Minuman", 10, 4000);
        Barang25 data4 = new Barang25("Br004", "Rinso Cair", "Sabun", 10, 7000);
        Barang25 data5 = new Barang25("Br005", "Mama Lemon Cair", "Sabun", 10, 1000);
        boolean konfirmasi = true; //kode baru

        //while(true){ kode lama
        while(konfirmasi){ //kode baru
            System.out.println("\nMenu");
            System.out.println("1. Data Barang");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Pencarian Data");
            System.out.println("4. Pengurutan Data"); 
            System.out.println("5. Tampilkan Kode Terbalik"); 
            System.out.println("6. Keluar"); 
            System.out.print("Pilih operasi: ");
            int pilihan = scanner25.nextInt();
            scanner25.nextLine();

            switch (pilihan){
                case 1:
                    data1.tampilDataBarang25();
                    data2.tampilDataBarang25();
                    data3.tampilDataBarang25();
                    data4.tampilDataBarang25();
                    data5.tampilDataBarang25();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    konfirmasi = false; //kode baru
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi");
            }
        }
    }
}

