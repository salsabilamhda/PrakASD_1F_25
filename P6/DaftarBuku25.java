package P6;

public class DaftarBuku25 {
    Buku25 listBk[] = new Buku25[5];
    int idx;

    //method tambah
    void tambah(Buku25 m){
        if(idx < listBk.length){
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    //method tampil
    void tampil(){
        for (Buku25 m : listBk){
            m.tampilDataBuku();
        }
    }

    //method bubbleSort
    void bubbleSort(){
        for (int i = 0; i<listBk.length-1; i++){
            for(int j = 0; j<listBk.length-i-1; j++){
                if(listBk[j].stock > listBk[j+1].stock){
                    Buku25 tempBk = listBk[j];
                    listBk[j] = listBk[j+1];
                    listBk[j+1] = tempBk;
                }
            }
        }
    }
}
