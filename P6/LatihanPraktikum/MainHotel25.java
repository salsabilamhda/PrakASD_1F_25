package P6.LatihanPraktikum;

public class MainHotel25 {
    
    public static void main(String[] args) {
        HotelService25 daftar = new HotelService25();
        Hotel25 H = new Hotel25("Aston", "Malang", 500000,(byte)4);
        Hotel25 H1 = new Hotel25("The Apurva Kempinski Bali", "Denpasar", 14000000,(byte)5);
        Hotel25 H2 = new Hotel25("Hardys Hotel Negara", "Negara", 250000, (byte)2);
        Hotel25 H3 = new Hotel25("Crystal Kuta Hotel", "Badung", 650000, (byte)3);
        Hotel25 H4 = new Hotel25("Jati", "Singaraja", 150000,(byte)1);
        daftar.tambah(H);
        daftar.tambah(H1);
        daftar.tambah(H2);
        daftar.tambah(H3);
        daftar.tambah(H4);

        System.out.println("***************************************************************************");
        System.out.println("                        Data Sebelum Di Urutkan                            ");
        System.out.println("***************************************************************************");
        daftar.tampilAll();

        System.out.println("***************************************************************************");
        System.out.println("Data Setelah Diurutkan Secara Asc Berdasarkan Harga Menggunakan Bubble Sort");
        System.out.println("***************************************************************************");
        daftar.bubbleSortHarga();
        daftar.tampilAll();

        System.out.println("******************************************************************************");
        System.out.println("Data Setelah Diurutkan Secara Asc Berdasarkan Harga Menggunakan Selection Sort");
        System.out.println("******************************************************************************");
        daftar.selectionSortHarga();
        daftar.tampilAll();

        System.out.println("******************************************************************************");
        System.out.println("Data Setelah Diurutkan Secara Desc Berdasarkan Bintang Menggunakan Bubble Sort");
        System.out.println("******************************************************************************");
        daftar.bubbleSortBintang();
        daftar.tampilAll();

        System.out.println("*********************************************************************************");
        System.out.println("Data Setelah Diurutkan Secara Desc Berdasarkan Bintang Menggunakan Selection Sort");
        System.out.println("*********************************************************************************");
        daftar.selectionSortBintang();
        daftar.tampilAll();
    }
}
