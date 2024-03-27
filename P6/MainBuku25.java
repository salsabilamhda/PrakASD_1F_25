package P6;

public class MainBuku25 {
    public static void main(String[] args) {
    DaftarBuku25 listBuku = new DaftarBuku25();
        
    Buku25 m = new Buku25(20215, "Algoritma", 2019, "Wahyuni", 5);
    Buku25 m1 = new Buku25(20214, "Big Data", 2020, "Susilo", 3);
    Buku25 m2 = new Buku25(20212, "Desain UI", 2021, "Supriadi", 6);
    Buku25 m3 = new Buku25(20211, "Web Programming", 2022, "Pustaka Adi", 2);
    Buku25 m4 = new Buku25(20211, "Etika Mahasiswa", 2023, "Darmawan Adi", 1);
    listBuku.tambah(m);
    listBuku.tambah(m1);
    listBuku.tambah(m2);
    listBuku.tambah(m3);
    listBuku.tambah(m4);

    System.out.println("**********************");
    System.out.println("Data sebelum diurutkan");
    listBuku.tampil();

    System.out.println("**********************");
    System.out.println("Data setelah diurutkan secara Asc berdasarkan stock");
    listBuku.bubbleSort();
    listBuku.tampil();
    
    System.out.println("**********************");
    System.out.println("Data setelah diurutkan secara Desc berdasarkan stock Menggunakan selection sort");
    listBuku.selectionSort();
    listBuku.tampil();

    System.out.println("**********************");
    System.out.println("Data setelah diurutkan secara Asc berdasarkan stock Menggunakan insertion sort");
    listBuku.insertionSort();
    listBuku.tampil();
    

    }
}
