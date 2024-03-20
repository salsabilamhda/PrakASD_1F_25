package P5.Latihan;

public class Mobil25 {
    String merk, tipe;
    int tahun;
    double top_acceleration, top_power;

    public Mobil25(String merk, String tipe, int tahun, double top_acceleration, double top_power){
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }

    public static Mobil25 cariTopAccelerationTertinggi(Mobil25[] mobils, int rendah, int tinggi){
        if(rendah == tinggi) {
            return mobils[rendah];
        }
        int mid = (rendah + tinggi) / 2;
    
        Mobil25 leftMax = cariTopAccelerationTertinggi(mobils, rendah, mid);
        Mobil25 rightMax = cariTopAccelerationTertinggi(mobils, mid + 1, tinggi);
    
        if (leftMax.top_acceleration > rightMax.top_acceleration) {
            return leftMax;
        } else {
            return rightMax;
        }
    }

    public static Mobil25 cariTopAccelerationTerendah(Mobil25[] mobils, int rendah, int tinggi){
        if (rendah == tinggi){
            return mobils[rendah];
        }
        int mid = (rendah + tinggi) / 2;
    
        Mobil25 leftMin = cariTopAccelerationTerendah(mobils, rendah, mid);
        Mobil25 rightMin = cariTopAccelerationTerendah(mobils, mid + 1, tinggi);
    
        if (leftMin.top_acceleration < rightMin.top_acceleration) {
            return leftMin;
        } else {
            return rightMin;
        }
    }

    public static double cariRataTopPower(Mobil25[] mobils){
        double totalPower = 0;
        for(Mobil25 mobil : mobils) {
            totalPower += mobil.top_power;
        }
        return totalPower / mobils.length;
    }

}
