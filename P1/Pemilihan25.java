package P1;

import java.util.Scanner;

/**
 * Pemilihan25
 */
public class Pemilihan25 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        int NilaiTugas= sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int NilaiKuis= sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int NilaiUts= sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int NilaiUas= sc.nextInt();
        System.out.println("==============================");
        System.out.println("==============================");
        String nilaiHuruf="";
    
        if(NilaiTugas > 100 || NilaiTugas < 0 ||
           NilaiKuis > 100 || NilaiKuis < 0 ||
           NilaiUts > 100 || NilaiUts < 0 ||
           NilaiUas > 100 || NilaiUas < 0) {
            System.out.println("Nilai tidak valid!");
            System.out.println("==============================");
            System.out.println("==============================");
        } else { 
            double nilaiAkhir = (NilaiTugas * 0.20) + (NilaiKuis * 0.20) + (NilaiUts * 0.30) + (NilaiUas * 0.30);
            String kelulusan = "SELAMAT ANDA LULUS";
            if (80< nilaiAkhir && nilaiAkhir<=100) {
                nilaiHuruf = "A";
            } else if (73 < nilaiAkhir && nilaiAkhir <= 80) {
                nilaiHuruf = "B+";
            } else if (65 < nilaiAkhir && nilaiAkhir <= 73) {
                nilaiHuruf = "B";
            } else if (60 < nilaiAkhir && nilaiAkhir <= 65) {
                nilaiHuruf = "C+";
            } else if (50 < nilaiAkhir && nilaiAkhir <= 60) {
                nilaiHuruf = "C";
            } else if (39 < nilaiAkhir && nilaiAkhir <= 50) {
                nilaiHuruf = "D";
                kelulusan = "MOHON MAAF ANDA TIDAK LULUS";
            } else if (nilaiAkhir <= 39) {
                nilaiHuruf = "E";
                kelulusan = "MOHON MAAF ANDA TIDAK LULUS";
        } 
            
            System.out.println("Nilai Akhir     : " + nilaiAkhir);
            System.out.println("Nilai Huruf     : " + nilaiHuruf);
            System.out.println("==============================");
            System.out.println("==============================");
            System.out.println(kelulusan);
    }
    sc.close();
        
    }    
    }
