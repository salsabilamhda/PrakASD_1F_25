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

    void selectionSort(){
        for(int i =0; i<listBk.length-1; i++){
            int idMax = i;
            for(int j=i+1; j<listBk.length; j++){
                if(listBk[j].stock > listBk[idMax].stock){
                    idMax = j;
                }
            }
            //swap 
            Buku25 tempBuku25 = listBk[i];
            listBk[i] = listBk[idMax];
            listBk[idMax] = tempBuku25;
        }
    }

    void insertionSort(){
        for(int i=1; i<listBk.length; i++){
            Buku25 temp = listBk[i];
            int j = i;
            //while(j>0 && listBk[j-1].stock>temp.stock){
            while(j<0 && listBk[j-1].stock>temp.stock){ //modified
                listBk[j] = listBk[j-1];
                j--;
            }
            listBk[j] = temp;
        }
    }
}
