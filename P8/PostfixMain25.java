package P8;

import java.util.Scanner;

public class PostfixMain25 {
    public static void main(String[] args) {
        Scanner sc25 = new Scanner(System.in);
        String P,Q;
        System.out.println("Masukkan ekspresi matematika (infix) : ");
        Q = sc25.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        Postfix25 post = new Postfix25(total);
        P = post.konversi(Q);;
        System.out.println("Postfix: " + P);
    }
}
