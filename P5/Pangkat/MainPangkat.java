package P5.Pangkat;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        Pangkat25[] png = new Pangkat25[3];
        png[0] = new Pangkat25(5, 2);
        png[1] = new Pangkat25(10, 2);
        png[2] = new Pangkat25(6, 2);

        int pilih;
        do {
            System.out.println("Menu Perhitungan Pangkat");
            System.out.println("===========================");
            System.out.println("1. Menggunakan Brute Force ");
            System.out.println("2. Menggunakan Divide and Conquer ");
            System.out.println("3. Keluar ");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = sc.nextInt();

            switch(pilih) {
                case 1 :
                    System.out.println("============================================");
                    System.out.println("Hasil pangkat dengan Brute force ");     
                    for(int i = 0; i < png.length; i++){
                        System.out.println("Nilai "+ png[i].nilai + " pangkat "+ png[i].pangkat + " adalah "+ png[i].pangkatBF(png[i].nilai,png[i].pangkat));
                    }
                    System.out.println("============================================");
                    break;
                case 2 :
                    System.out.println("============================================");
                    System.out.println("Hasil pangkat dengan Devide Conquer ");
                    for(int i = 0; i < png.length; i++){
                        System.out.println("Nilai "+ png[i].nilai + " pangkat "+ png[i].pangkat + " adalah "+ png[i].pangkatDC(png[i].nilai,png[i].pangkat));
                    }
                    System.out.println("============================================");
                    break;
                case 3 :
                    break; // Keluar dari loop
                default :
                    System.out.println("Input yang anda masukkan tidak valid");
            }
        } while (pilih != 3);
    }
}
