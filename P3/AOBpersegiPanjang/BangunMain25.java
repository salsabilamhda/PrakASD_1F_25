package P3.AOBpersegiPanjang;

import P3.ArrayBalok.Segitiga25;

public class BangunMain25 {
    
    public static void main(String[] args) {
        
        Segitiga25 sg1 = new Segitiga25(5, 10);
        Segitiga25 sg2 = new Segitiga25(10, 15);
        Segitiga25 sg3 = new Segitiga25(15, 20);
        PersegiPanjang25 pp1 = new PersegiPanjang25(5, 10);
        PersegiPanjang25 pp2 = new PersegiPanjang25(2, 8);
        PersegiPanjang25 pp3 = new PersegiPanjang25(10, 15);

        Segitiga25[] s = new Segitiga25[3];
        PersegiPanjang25[] p = new PersegiPanjang25[3];

        s[0]=sg1;
        s[1]=sg2;
        s[2]=sg3;
        p[0]=pp1;
        p[1]=pp2;
        p[2]=pp3;


        BangunDatar25 bd = new BangunDatar25();
        bd.tambahSgt(s);
        bd.TambahPp(p);
        bd.tampilBangunDatar();
    }
}
