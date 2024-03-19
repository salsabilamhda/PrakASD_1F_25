package Kuis1_25_Salsabila_1F;

public class Transaction25 {
    String name;
    ExtraVaganzaItem25[] arrTransaction;

    public void addData(ExtraVaganzaItem25[] data) {
        this.arrTransaction = data;
    }

    public int getIndexByName(String name) {
        int index = -1; 

        if (arrTransaction != null) {
            for (int i = 0; i < arrTransaction.length; i++) {
                if (arrTransaction[i] != null && arrTransaction[i].getClass() != null && arrTransaction[i].getClass().equals(name)) {
                    index = i; 
                    break; 
                }
            }
        }

        return index;
    }

    public void tampilData() {
        ExtraVaganzaItem25 data1 = new ExtraVaganzaItem25("paracetamol", "Obat", 5, 10000);
        ExtraVaganzaItem25 data2 = new ExtraVaganzaItem25("vitamin A", "Vitamin", 10, 15000);
        ExtraVaganzaItem25 data3 = new ExtraVaganzaItem25("KF 95 Mask","mask", 15, 5000);
        ExtraVaganzaItem25 data4 = new ExtraVaganzaItem25("hand gel Antis","sanitize", 25, 20000);

        ExtraVaganzaItem25[] tampil = new ExtraVaganzaItem25[4];
        tampil[0] = data1;
        tampil[1] = data2;
        tampil[2] = data3;
        tampil[3] = data4;

        for (int i = 0; i < tampil.length; i++) {
            System.out.println("name:  " + tampil[i].name);
            System.out.println("category: "+tampil[i].category);
            System.out.println("stock: "+tampil[i].stock);
            System.out.println("price: "+tampil[i].price);
        }
        System.out.println("========================================");
    }

    public void updateHarga() {
        System.out.println("=========APT Pharmacy==========");
        System.out.println("Apakah ingin kembali ke menu? (y/n)");
    }
}

