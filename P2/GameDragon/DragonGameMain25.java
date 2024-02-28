package P2.GameDragon;

import java.util.Scanner;

public class DragonGameMain25 {
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DragonGame25 dragon = new DragonGame25(0, 0, 10, 10);
        int choice;

            while (true) {
            System.out.print(
                "PILIH ARAH!\n" +
                "1. KE ATAS\n" +
                "2. KE BAWAH\n" +
                "3. KE KANAN\n" +
                "4. KE KIRI\n" +
                "Masukkan pilihan anda : "
            );
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    dragon.moveUp();
                    break;
                case 2:
                    dragon.moveDown();
                    break;
                case 3:
                    dragon.moveRight();
                    break;
                case 4:
                    dragon.moveLeft();
                    break;
                default:
                    System.out.println(" tidak valid!");
                    break;
            }
        } 
    }
}
