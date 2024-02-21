package P1;

import java.util.Scanner;

public class Fungsi25_Pertanyaan2 {
    
    private static int kurangBunga(String namaBunga, int jmlAwal){
        if(namaBunga.equalsIgnoreCase("Aglonema"))
            return jmlAwal-1;
        else if(namaBunga.equalsIgnoreCase("Keladi"))
            return jmlAwal-2;
        else if(namaBunga.equalsIgnoreCase("Alocasia"))
            return jmlAwal;
        else if(namaBunga.equalsIgnoreCase("Mawar"))
            return jmlAwal-5;
        else
            return 0;
    }

    public static void main(String[] args) {
        int royalGarden[][]= {
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9},
        };
        String nBunga[]= {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Stok Royal Garden 4 sekarang  ");
        for(int k=0; k<royalGarden[3].length; k++){
            royalGarden[3][k]= kurangBunga(nBunga[k], royalGarden[3][k]);
            System.out.printf("%-10s: %d%n", nBunga[k], royalGarden[3][k]);
        }
        
        sc.close();
    }
}

