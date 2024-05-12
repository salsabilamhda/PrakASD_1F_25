package P10.Tugas;
import java.util.Scanner;

public class QueueMain {
    public static void menu(){
        System.out.println("Pilih Menu ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Antrian Terbelakang");
        System.out.println("5. Cek Semua Antrian");
        System.out.println("6. Cek Posisi Pembeli Berdasarkan Nama");
        System.out.println("7. Menampilkan data seluruh pembeli");
        System.out.println("-----------------------------------");
    
    }
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc25.nextInt();
        Queue antri = new Queue(jumlah);
    
        int pilih;
        do{
            menu();
            pilih = sc25.nextInt();
            sc25.nextLine();
        
            switch(pilih){
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc25.nextLine();
                    System.out.print("Nomor HP Pembeli : ");
                    int noHP = sc25.nextInt();
                    Pembeli25 nb = new Pembeli25(nama, noHP);
                    antri.enqueue(nb);
                    break;
                case 2:
                    Pembeli25 data = antri.Dequeue();
                    if(!"".equals(data.nama) && !"".equals(data.noHP)){
                        System.out.println("Antrian yang keluar : " + data.nama + " " + data.noHP);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    antri.print();
                    break;
                case 6:
                    System.out.print("Masukkan nama Pembeli : ");
                    String namaPembeli = sc25.nextLine();
                    antri.peekPosition(namaPembeli);
                    break;
                case 7:
                    antri.daftarPembeli();
                    break;
            }
        } while (pilih >= 1 && pilih <= 8);
    }
}
