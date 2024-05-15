package P11.Tugas_P11.Nomor2;

import java.util.Scanner;

public class UnitLayananMain {
    public static void menu(){
        System.out.println("===Selamat Datang di Layanan Unit Kemahasiswaan===");
        System.out.println("--------------------------------------------------");
        System.out.println("Pilih Menu : ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Semua Antrian");
        System.out.println("4. Keluar");
        System.out.println("--------------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);

        UnitLayanan25 singLL = new UnitLayanan25();

        int pilih;
        do{
            menu();
            pilih = sc25.nextInt();
            sc25.nextLine();
        
        switch (pilih) {
            case 1:
                System.out.print("Nim Mahasiswa\t: ");
                int nim = sc25.nextInt();
                System.out.print("Nama Mahasiswa\t: ");
                String nama = sc25.next();
                singLL.addLast(nim, nama);
                System.out.println("Antrian berhasil ditambahkan!\n");
                System.out.println("--------------------------------------------------");
                sc25.nextLine();
                break;
            case 2:
                singLL.removeFirst();
                System.out.println("Mahasiswa antrian pertama sudah selesai dilayani!\n");
                System.out.println("Sisa Antrian : \n");
                singLL.print();
                break;
            case 3: 
                System.out.println("Berikut adalah data semua antrian : \n");
                singLL.print();
                break;
            case 4:
                System.out.println("Terimakasih Telah Menggunakan Unit Layanan Kemahasiswaan ");
                System.exit(0);
                break;
        }

        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);

        sc25.close();
    }
}
