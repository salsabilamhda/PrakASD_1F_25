package Kuis2_25_1F_Salsabila;

import java.util.Scanner;

public class RoyalDelishMain25 {
    public static void menu(){
        System.out.println("Menu ");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian");
        System.out.println("4. Laporan Pengurutan pesanan by nama");
        System.out.println("5. Hitung Total pendapatan");
        System.out.println("6. Keluar");
        System.out.print("Pilih(1-5) : ");
    }

    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        Pembeli25 dll = new Pembeli25();
        int pilih;

        do {
            menu();
            pilih = sc25.nextInt();
            sc25.nextLine(); 

            switch (pilih) {
                case 1:
                    dll.addFirst25("Mamluatul", "081345679");
                    dll.addLast25("Abyaz", "087123456");
                    dll.addLast25("Yoshinoya", "089123485");
                    dll.addLast25("Susi", "08545678");
                    dll.printMenu25();
                    break;
                case 2:
                    dll.print25();
                    break;
                case 3:
                    dll.removeFirst25();
                    dll.print25();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6: 
                    System.exit(0);
                    break;
            }
        } while (pilih != 6);
    }
}
