package Kuis1_25_Salsabila_1F;

public class ExtraVaganzaItem25 {
    String name, category;
    int stock, price;

    public ExtraVaganzaItem25(String name, String category, int stock, int price){
        this.name = name;
        this.category = category;
        this.stock = stock;
        this.price = price; 

    }

    void updateHarga(int hrg) {
        price = hrg;
    }
}
