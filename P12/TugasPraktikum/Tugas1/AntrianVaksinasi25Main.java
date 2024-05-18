package P12.TugasPraktikum.Tugas1;

import java.util.Scanner;

public class AntrianVaksinasi25Main {
    public static void menu(){
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("++++++++++++++++++++++++++++++++");
    }
    public static void main(String[] args)throws Exception  {
        Scanner sc25 = new Scanner(System.in);
    
        AntrianVaksinasi25 dll = new AntrianVaksinasi25();
    
        int pilih;
        do{
            menu();
            pilih = sc25.nextInt();
            sc25.nextLine();

            switch(pilih){
                case 1:
                    System.out.print("Nomor Antrian\t: ");
                    int nim = sc25.nextInt();
                    sc25.nextLine();
                    System.out.print("Nama Penerima\t: ");
                    String nama = sc25.nextLine();
                    dll.addLast(nim, nama);
                break;
            
                case 2:
                    dll.removeFirst();
                    dll.print();
                break;
            
                case 3:
                    dll.print();
                break;
            
                case 4:
                    System.exit(0);
                break;
            
            } 
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 );

        sc25.close();
    }
   
}
