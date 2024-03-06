package P3.LatihanPraktikum;

import java.util.Scanner;

public class MahasiswaMain25 {
    public static void main(String[] args) {
        Mahasiswa25[] mhsArray = new Mahasiswa25[3];
        
        Scanner scan25 = new Scanner(System.in);

        for(int i = 0; i<mhsArray.length; i++)
        {
            mhsArray[i] = new Mahasiswa25();
            System.out.println("Masukkan data mahasiswa ke- "+(i+1));
            System.out.print("Masukkan nama mahasiswa: ");
            mhsArray[i].namaMhs = scan25.next();
            System.out.print("Masukkan NIM mahasiswa: ");
            mhsArray[i].nimMhs = scan25.nextInt();
            System.out.print("Masukkan jenis kelamin mahasiswa: ");
            mhsArray[i].jenisKelamin = scan25.next().charAt(0);
            System.out.print("Masukkan IPK mahasiswa: ");
            mhsArray[i].ipk = scan25.nextFloat();
        }

        scan25.close();

        System.out.println("=======================================");

        for(int i=0; i<mhsArray.length; i++) 
        {
            System.out.println("Data Mahasiswa ke- "+ (i+1));
            System.out.println("Nama Mahasiswa: " + mhsArray[i].namaMhs);
            System.out.println("NIM Mahasiswa: " + mhsArray[i].nimMhs);
            System.out.println("Jenis Kelamin Mahasiswa: " + mhsArray[i].jenisKelamin);
            System.out.println("IPK Mahasiswa: " + mhsArray[i].ipk);
        }
    }
    
}
