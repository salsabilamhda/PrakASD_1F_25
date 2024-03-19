package Kuis1_25_Salsabila_1F;

import java.util.Scanner;

public class ApotekMain25 {

        static void Menu() {
        Transaction25 tr = new Transaction25();
        Scanner input25 = new Scanner(System.in);
        int choice;
        char pilih;


            System.out.println("===========APT Pharmacy===========");
            System.out.println("Menu : ");
            System.out.println("1. Input Data");
            System.out.println("2. Display data");
            System.out.println("3. Update harga");
            System.out.println("4. Penjualan");
            System.out.println("5. Exit");
            System.out.printf("select menu : ");
            choice = input25.nextInt();
        
            switch(choice) {
                case 1 : 
                    tr.addData(null);
                    System.out.println("Data Obat Berhasil Ditambahkan!!!");
                    System.out.println("Apakah ingin kembali ke menu? (y/n)");
                    Menu();
                    return;
                case 2 : 
                    tr.tampilData();
                    Menu();
                    return;
                case 3 : 
                    tr.updateHarga();
                    Menu();
                    return;
                case 4 : 
                    Menu();
                    return;
                case 5 : 
                    break;
                default :
                    System.out.println("pilihan tidak valid");
                    Menu();
            }
            System.out.print("Apakah anda ingin kembali ke menu ? (y/t) ");
            pilih = input25.next().charAt(0);
    }


    public static void main(String[] args) {
        Menu();
    }
}
