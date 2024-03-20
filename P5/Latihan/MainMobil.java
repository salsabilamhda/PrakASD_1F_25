package P5.Latihan;

public class MainMobil {
    public static void main(String[] args) {

        Mobil25 mb1 = new Mobil25("BMW","M2 Coupe",2016, 6816, 728);
        Mobil25 mb2 = new Mobil25("Ford", "Fiesta ST", 2014, 3921, 575);
        Mobil25 mb3 = new Mobil25("Nissan", "370Z", 2009, 4360, 657);
        Mobil25 mb4 =  new Mobil25("Subaru", "BRZ", 2014, 4058, 609);
        Mobil25 mb5 =  new Mobil25("Subaru", "Impreza WRX STI", 2013, 6255, 703);
        Mobil25 mb6 = new Mobil25("Toyota", "AE86 Trueno", 1986, 3700, 553);
        Mobil25 mb7 =  new Mobil25("Toyota", "86/GT86", 2014, 4180, 609);
        Mobil25 mb8 = new Mobil25("Volkswagen", "Golf GTI", 2014, 4180, 631);

        Mobil25[] mobils = new Mobil25[8];

        mobils[0] = mb1;
        mobils[1] = mb2;
        mobils[2] = mb3;
        mobils[3] = mb4;
        mobils[4] = mb5;
        mobils[5] = mb6;
        mobils[6] = mb7;
        mobils[7] = mb8;
        
        
        System.out.println("=====================================================");
        Mobil25 accTertinggi = Mobil25.cariTopAccelerationTertinggi(mobils, 0, mobils.length - 1);
        System.out.println("Mobil dengan top_acceleration tertinggi: ");
        System.out.println("Merk  : " + accTertinggi.merk);
        System.out.println("Tipe  : " + accTertinggi.tipe);
        System.out.println("Tahun : " + accTertinggi.tahun);
        System.out.println("=====================================================");

        Mobil25 accTerendah = Mobil25.cariTopAccelerationTerendah(mobils, 0, mobils.length - 1);
        System.out.println("Mobil dengan top_acceleration terendah: ");
        System.out.println("Merk  : " + accTerendah.merk);
        System.out.println("Tipe  : " + accTerendah.tipe);
        System.out.println("Tahun : " + accTerendah.tahun);
        System.out.println("=====================================================");

        double rataTopPower = Mobil25.cariRataTopPower(mobils);
        System.out.println("Rata - rata top_power seluruh mobil : " + rataTopPower);
        System.out.println("=====================================================");
    }
}

