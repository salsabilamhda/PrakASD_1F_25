package P1;

public class Fungsi25_Pertanyaan1 {
    private static int jumlahBunga= 4;
    private static int[] hargaBunga = {75000, 50000, 60000, 10000};

    public static void main(String[] args) {
        int[][] stockBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9 }
        };

        for (int baris = 0; baris < stockBunga.length; baris++) {
            int totalPendapatan = hitungPendapatan(stockBunga[baris]);
            System.out.println("Pendapatan Cabang RoyalGarden " + (baris + 1) + " adalah: " + totalPendapatan);
        }
    }

    private static int hitungPendapatan(int[] stockBunga) {
        int totalPendapatan = 0;
        for (int i = 0; i < jumlahBunga; i++) {
            totalPendapatan += stockBunga[i] * hargaBunga[i];
        }
        return totalPendapatan;
    }
}
