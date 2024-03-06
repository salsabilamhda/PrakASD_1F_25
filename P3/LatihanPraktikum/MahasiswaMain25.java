package P3.LatihanPraktikum;

import java.util.Scanner;

public class MahasiswaMain25 {
    public static void main(String[] args) {
        Mahasiswa25[] mhsArray = new Mahasiswa25[3];
        

        InputData(mhsArray);
        System.out.println("=====================");
        tampilData(mhsArray);
        System.out.println("=====================");
        hitungRataIPK(mhsArray);
        System.out.println("=====================");
        IPKTerbesar(mhsArray);

    }


        private static void InputData(Mahasiswa25[] mhsArray) {
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
    }


        private static void tampilData(Mahasiswa25[] mhsArray) {
        for(int i=0; i<mhsArray.length; i++) 
        {
            System.out.println("Data Mahasiswa ke- "+ (i+1));
            System.out.println("Nama Mahasiswa: " + mhsArray[i].namaMhs);
            System.out.println("NIM Mahasiswa: " + mhsArray[i].nimMhs);
            System.out.println("Jenis Kelamin Mahasiswa: " + mhsArray[i].jenisKelamin);
            System.out.println("IPK Mahasiswa: " + mhsArray[i].ipk);
        }
    }

       private static void hitungRataIPK(Mahasiswa25[] mhsArray) {
        float totalIPK = 0;
        for(int i = 0; i<mhsArray.length; i++) {
            totalIPK += mhsArray[i].ipk / mhsArray.length;
        }
        System.out.println("Rata - rata IPK Mahasiswa: " + totalIPK);
       }

       private static void IPKTerbesar(Mahasiswa25[] mhsArray) {
        float temp, maxIPK = 0;
        int indexMhsMaxIPK = 0;
        for (int i=0; i<mhsArray.length; i++) {
            if (i==0) {
                maxIPK = mhsArray[i].ipk;
                indexMhsMaxIPK = i;
            } else {
                temp = mhsArray[i].ipk;
                if(temp > maxIPK) {
                    maxIPK = temp;
                    indexMhsMaxIPK = i;
                }
            }
        }
        System.out.println("Nilai IPK Terbesar: " + maxIPK);
        System.out.println(" -Mahasiswa IPK terbesar- ");
        System.out.println("Nama Mahasiswa: " + mhsArray[indexMhsMaxIPK].namaMhs);
        System.out.println("NIM Mahasiswa: " + mhsArray[indexMhsMaxIPK].nimMhs);
        System.out.println("Jenis Kelamin Mahasiswa: " + mhsArray[indexMhsMaxIPK].jenisKelamin);
        System.out.println("IPK Mahasiswa: " + mhsArray[indexMhsMaxIPK].ipk);
       }
}
