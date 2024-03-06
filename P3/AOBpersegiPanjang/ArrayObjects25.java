package P3.AOBpersegiPanjang;

public class ArrayObjects25 {
    
    public static void main(String[] args) {
        PersegiPanjang25[] ppArray = new PersegiPanjang25[3];

        ppArray[0] = new PersegiPanjang25();
        ppArray[0] .panjang = 110;
        ppArray[0] .lebar = 30;

        ppArray[1] = new PersegiPanjang25();
        ppArray[1] .panjang = 80;
        ppArray[1] .lebar = 40;

        ppArray[2] = new PersegiPanjang25();
        ppArray[2] .panjang = 100;
        ppArray[2] .lebar = 20;

        System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang + ", lebar: " + ppArray[0].lebar);
        System.out.println("Persegi Panjang ke-1, panjang: " + ppArray[1].panjang + ", lebar: " + ppArray[1].lebar);
        System.out.println("Persegi Panjang ke-2, panjang: " + ppArray[2].panjang + ", lebar: " + ppArray[2].lebar);
    }
}
