package P1;

import java.util.Scanner;

public class Tugas25_Pertanyaan1 {
    public static void main(String[] args) {
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        char [][] kota = { {'B', 'A', 'N', 'T', 'E', 'N'},
                           {'J', 'A', 'K', 'A', 'R', 'T','A'},
                           {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
                           {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
                           {'B', 'O', 'G', 'O', 'R'},
                           {'P','E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
                           {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
                           {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
                           {'M', 'A', 'L', 'A', 'N', 'G'},
                           {'T', 'E', 'G', 'A', 'L'} };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor  : ");
        String input = scanner.nextLine();

            int index = 0;
            for (int i = 0; i < kode.length; i++) {
                if (kode[i] == input.charAt(0)) {
                    index = i;
                    break;
                }
            }

            for(int i=0; i<kota[index].length;i++){
                System.out.print(kota[index][i]);
            }

        scanner.close();
    }
}
