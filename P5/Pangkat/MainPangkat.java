package P5.Pangkat;

public class MainPangkat {
    public static void main(String[] args) {
       
        Pangkat25[] png = new Pangkat25[3];
        png[0] = new Pangkat25(5, 2);
        png[1] = new Pangkat25(10, 2);
        png[2] = new Pangkat25(6, 2);

        System.out.println("==============================");
        System.out.println("Hasil pangkat dengan Brute Force ");
        for(int i=0; i<png.length; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatBF(png[i].nilai, png[i].pangkat));

        }
        System.out.println("===============================");
        System.out.println("Hasil Pangkat Divide and Conquer ");
        for(int i=0; i<png.length; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah "+png[i].pangkatDC(png[i].nilai, png[i].pangkat));

        }


    }

}