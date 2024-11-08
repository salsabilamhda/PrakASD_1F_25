package P15;

import java.util.Scanner;

public class GraphMain25 {
    public static void main(String[] args) throws Exception {
        Scanner sc25 = new Scanner(System.in);
        Graph25 gedung = new Graph25(6);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Check Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Egde"); //Latihan Praktikum 3
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int pilihan = sc25.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan gedung asal: ");
                    int asal = sc25.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan = sc25.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = sc25.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc25.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc25.nextInt();
                    gedung.removeEdge(asal, tujuan);
                    break;
                case 3:
                    System.out.print("Masukkan gedung: ");
                    asal = sc25.nextInt();
                    gedung.degree(asal);
                    break;
                case 4:
                    gedung.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc25.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc25.nextInt();
                    if (gedung.isConnected(asal, tujuan)) {
                        System.out.println("Gedung " + (char)('A' + asal) + " dan " + (char)('A' + tujuan) + " bertetangga");
                    } else {
                        System.out.println("Gedung " + (char)('A' + asal) + " dan " + (char)('A' + tujuan) + " tidak bertetangga");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc25.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc25.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    int jarakBaru = sc25.nextInt();
                    gedung.updateJarak(asal, tujuan, jarakBaru);
                    break;
                case 7:
                    System.out.println("Jumlah edge dalam graf: " + gedung.hitungEdge());
                    break;
                case 8:
                    sc25.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
