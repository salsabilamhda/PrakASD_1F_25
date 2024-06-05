package P15;

import java.util.Scanner;

public class GraphMain25 {
    public static void main(String[] args) throws Exception {
        Scanner sc25 = new Scanner(System.in);
        Graph25 gedung = new Graph25(6);

        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();

        //Langkah 17 
        gedung.removeEdge(1, 3);
        gedung.printGraph();

        //modifikasi no 5
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Cek gedung");
            System.out.println("2. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = sc25.nextInt();

            if (pilihan == 1) {
                System.out.print("Masukkan gedung asal: ");
                int asal = sc25.nextInt();
                System.out.print("Masukkan gedung tujuan: ");
                int tujuan = sc25.nextInt();

                if (gedung.isConnected(asal, tujuan)) {
                    System.out.println("Gedung " + (char)('A' + asal) + " dan " + (char)('A' + tujuan) + " bertetangga");
                } else {
                    System.out.println("Gedung " + (char)('A' + asal) + " dan " + (char)('A' + tujuan) + " tidak bertetangga");
                }
            } else if (pilihan == 2) {
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }

        sc25.close();
    }
}
