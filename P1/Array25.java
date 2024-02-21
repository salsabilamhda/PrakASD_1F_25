package P1;

import java.util.Scanner;

public class Array25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] matkul = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"};
        int[] sks = {2, 2, 2, 3, 2, 2, 3, 2};
        int[] nilaiAngka = new int[matkul.length];
        double[] nilaiSetara = new double[matkul.length];
        double totalSKS = 0, totalNilaiSetara = 0;

        int maxMatkulLength = 0;
        for (String mk : matkul) {
            if (mk.length() > maxMatkulLength) {
                maxMatkulLength = mk.length();
            }
        }

            System.out.println("===============================");
            System.out.println("Program Menghitung IP Semester");
            System.out.println("===============================");
        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + matkul[i] + " : ");
            nilaiAngka[i] = scanner.nextInt();
    

            if (80 < nilaiAngka[i] && nilaiAngka[i]<=100) {
                nilaiSetara[i] = 4;
            } else if (73 < nilaiAngka[i] &&nilaiAngka[i] <= 80) {
                nilaiSetara[i] = 3.5;
            } else if (65 < nilaiAngka[i] && nilaiAngka[i] <= 73) {
                nilaiSetara[i] = 3;
            } else if (60 < nilaiAngka[i] && nilaiAngka[i] <= 65) {
                nilaiSetara[i] = 2.5;
            } else if (50 < nilaiAngka[i] && nilaiAngka[i] <= 60) {
                nilaiSetara[i] = 2;
            } else if (39 < nilaiAngka[i] &&nilaiAngka[i] <= 50) {
            } else  {
                nilaiSetara[i] = 0;
            }

            totalNilaiSetara += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        System.out.println("====================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("====================");
        System.out.println("Mata Kuliah\t\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        for (int i = 0; i < matkul.length; i++) {
            String nilaiHuruf = "";
            if (80< nilaiAngka[i] && nilaiAngka[i]<=100) {
                nilaiHuruf = "A";
            } else if (73 < nilaiAngka[i] &&nilaiAngka[i] <= 80) {
                nilaiHuruf = "B+";
            } else if (65 < nilaiAngka[i] && nilaiAngka[i] <= 73) {
                nilaiHuruf = "B";
            } else if (60 < nilaiAngka[i] && nilaiAngka[i] <= 65) {
                nilaiHuruf = "C+";
            } else if (50 < nilaiAngka[i] && nilaiAngka[i] <= 60) {
                nilaiHuruf = "C";
            } else if (39 < nilaiAngka[i] &&nilaiAngka[i] <= 50) {
                nilaiHuruf = "D";
            } else if (nilaiAngka[i] <= 39) {
                nilaiHuruf = "E";
        } 

            System.out.printf("%-" + (maxMatkulLength + 10) + "s%-15d%-15s%-15.2f%n", matkul[i], nilaiAngka[i], nilaiHuruf,
                    nilaiSetara[i]);
        }

        double ipSemester = totalNilaiSetara / totalSKS;
        System.out.println("====================");
        System.out.printf("IP Semester : %.2f ", ipSemester);

        scanner.close();
    }
}
