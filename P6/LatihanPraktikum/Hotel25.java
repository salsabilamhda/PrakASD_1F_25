package P6.LatihanPraktikum;

public class Hotel25 {
    String nama, kota;
    int harga;
    Byte bintang;

    public Hotel25(String n, String k, int h, Byte b){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampilDataHotel(){
        System.out.println("=================================================================================");
        System.out.println("Nama Hotel     : "+nama                                                             );
        System.out.println("Kota           : "+kota                                                             );
        System.out.println("Harga Hotel    : "+harga                                                            );
        System.out.println("Rating Bintang : "+bintang                                                          );
        System.out.println("=================================================================================");

    }
}
