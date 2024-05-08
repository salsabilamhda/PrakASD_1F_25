package P10.Praktikum2;

import java.util.Scanner;

public class QueueMain {
    public static void menu() {
        System.out.println("Pilih Menu : ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian Paling Belakang");
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc25.nextInt();
        Queue25 antri = new Queue25(jumlah);

        int pilih;

        do {
            menu();
            pilih = sc25.nextInt();
            sc25.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc25.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc25.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc25.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc25.nextInt();
                    System.out.print("Saldo: ");
                    int saldo = sc25.nextInt();
                    Nasabah25 nb = new Nasabah25(norek, nama, alamat, umur, saldo);
                    sc25.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2: 
                    Nasabah25 data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur !=0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4: 
                    antri.print();
                    break;
            }
        } while (pilih == 1|| pilih == 2 || pilih == 3| pilih == 4);
    }
}
