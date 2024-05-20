package P12.TugasPraktikum.Tugas2;

import java.util.Scanner;

public class DaftarFilm25Main {
    public static void menu() {
        System.out.println("===================================");
        System.out.println("  Data Film Layar Lebar  ");
        System.out.println("===================================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("===================================");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc25 = new Scanner(System.in);
        DaftarFilm25 dll = new DaftarFilm25();
        int pilih;

        do {
            menu();
            pilih = sc25.nextInt();
            sc25.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID Film\t\t: ");
                    int id = sc25.nextInt();
                    sc25.nextLine(); 
                    System.out.print("Judul Film\t: ");
                    String judulFilm = sc25.nextLine();
                    System.out.print("Rating\t\t: ");
                    double rating = sc25.nextDouble();
                    dll.addFirst(id, judulFilm, rating);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.print("ID Film\t\t: ");
                    int idD = sc25.nextInt();
                    sc25.nextLine(); 
                    System.out.print("Judul Film\t: ");
                    String judulFilmM = sc25.nextLine();
                    System.out.print("Rating\t\t: ");
                    double ratingG = sc25.nextDouble();
                    dll.addLast(idD, judulFilmM, ratingG);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film Posisi yang diinginkan");
                    System.out.print("Urutan ke - ");
                    int idx = sc25.nextInt();
                    System.out.print("ID Film\t\t: ");
                    int idDD = sc25.nextInt();
                    System.out.print("Judul Film\t: ");
                    sc25.nextLine();
                    String judulFilmMM = sc25.nextLine();
                    System.out.print("Rating\t\t: ");
                    double ratingGG = sc25.nextDouble();
                    dll.add(idDD, judulFilmMM, ratingGG, idx);
                    System.out.println("Data Film ini akan masuk di urutan ke - " + idx);
                    break;
                case 4:
                    dll.removeFirst();
                    dll.print();
                    break;
                case 5:
                    dll.removeLast();
                    dll.print();
                    break;
                case 6:
                    System.out.println("hapus Data Film  yang diinginkan");
                    System.out.print("index ke - ");
                    int index = sc25.nextInt();
                    dll.remove(index);
                    dll.print();
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.println("Cari ID Film Yang ingin dicari");
                    System.out.print("Masukkan ID\t: ");
                    int cari = sc25.nextInt();
                    int idF = dll.findSeqSearch(cari);
                    dll.tampilPosisi(cari, idF);
                    break;
                case 9:
                    System.out.println("Data Akan diurut secara DESC");
                    dll.sort();
                    break;
                case 10:
                    System.exit(0);
                    break;
            }
        } while (pilih != 10);

        sc25.close();
    }
}

    

