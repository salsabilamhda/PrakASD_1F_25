package P1;

import java.util.Scanner;
public class Perulangan25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nim: ");
        String nim = scanner.nextLine();
        System.out.println("===================");
        int n = Integer.parseInt(nim.substring(Math.max(0, nim.length() - 2)));
        if (n < 10) n += 10;

        System.out.println("n: " + n);
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

