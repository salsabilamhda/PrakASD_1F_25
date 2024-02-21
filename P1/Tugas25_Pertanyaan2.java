package P1;

import java.util.Scanner;

public class Tugas25_Pertanyaan2 {
   
    static double rumusKecepatan(double s, double t) {
        return s / t;
    }
    static double rumusJarak(double v, double t) {
        return v * t;
    }
    static double rumusWaktu(double v, double s) {
        return s / v;
    }

    static void MenuHitung() {
        Scanner sc = new Scanner(System.in);
        int pilihan;
        double s, v, t;

        System.out.println("Pilih rumus yang akan dihitung:");
        System.out.println("1. Kecepatan");
        System.out.println("2. Jarak");
        System.out.println("3. Waktu");
        System.out.print("Masukkan pilihan Anda: ");
        pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan jarak (m): ");
                s = sc.nextDouble();
                System.out.print("Masukkan waktu (s): ");
                t = sc.nextDouble();
                System.out.printf("Kecepatan = %.2f m/s", rumusKecepatan(s, t));
                break;
            case 2:
                System.out.print("Masukkan kecepatan (m/s): ");
                v = sc.nextDouble();
                System.out.print("Masukkan waktu (s): ");
                t = sc.nextDouble();
                System.out.printf("Jarak = %.2f m", rumusJarak(v, t));
                break;
            case 3:
                System.out.print("Masukkan jarak (m): ");
                s = sc.nextDouble();
                System.out.print("Masukkan kecepatan (m/s): ");
                v = sc.nextDouble();
                System.out.printf("Waktu = %.2f s", rumusWaktu(v, s));
                break;
            default:
                System.out.println("Pilihan tidak valid");
                MenuHitung();
        }
        sc.close(); 
    }
    
    public static void main(String[] args) {
        MenuHitung();
    }
}
