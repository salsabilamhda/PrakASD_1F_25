package P3.AOBpersegiPanjang;

import java.util.Scanner;

public class ArrayObjects25 {
    
    public static void main(String[] args) {
        PersegiPanjang25[] ppArray = new PersegiPanjang25[3];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 3; i++)
        {
            ppArray[i] = new PersegiPanjang25();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }

        for(int i=0; i<3; i++)
        {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar : " + ppArray[i].lebar);
        }

        sc.close();
    }
   
}
