package P3.AOBpersegiPanjang;

import P3.ArrayBalok.Segitiga25;

public class BangunDatar25 {
    
    Segitiga25[] segitigas;
    PersegiPanjang25[] persegiPanjangs;

    void tambahSgt(Segitiga25[] segitiga) {
        this.segitigas=segitiga;
    }

    void TambahPp(PersegiPanjang25[] persegiPanjang) {
        this.persegiPanjangs=persegiPanjang;
    }

    void tampilBangunDatar() {
        for (int i = 0; i < persegiPanjangs.length; i++) {
            System.out.println("persegi panjang " + (i+1));
            System.out.println("panjang: "+persegiPanjangs[i].lebar);
            System.out.println("panjang: "+persegiPanjangs[i].panjang );
        }
        System.out.println("========================================");
        for (int j = 0; j < segitigas.length; j++) {
            System.out.println("segitiga "+(j+1));
            System.out.println("alas: "+segitigas[j].alas);
            System.out.println("tinggi: "+segitigas[j].tinggi);
        }
    }
}
