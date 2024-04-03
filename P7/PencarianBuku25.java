package P7;

public class PencarianBuku25 {
    Buku25 listBk[] = new Buku25[5];
    int idx;

    void tambah(Buku25 m){
        if(idx < listBk.length){
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for(Buku25 m : listBk){
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(int cari){
        int posisi = -1;
        for(int j = 0; j<listBk.length; j++){
            if(listBk[j].kodeBuku==cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos){
        if (pos!=-1){
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);

        } else{
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos){
        if (pos!=-1){
            System.out.println("Kode Buku\t : " + x );
            System.out.println("Judul\t         : "+listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t : "+listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t : "+listBk[pos].pengarang);
            System.out.println("Stock\t         : "+listBk[pos].stock);
        }else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    //modifikasi
    public Buku25 FindBuku(int cari){
        Buku25 dataBuku25 = null;
        for (int j = 0; j<listBk.length; j++){
            if(listBk[j].kodeBuku == cari){
                dataBuku25 = listBk[j];
                break;
            }
        }
        return dataBuku25;
       
   }

   //Binary
    public int FindBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right)/2;
            if(cari == listBk[mid].kodeBuku){
                return(mid);
            //}else if (listBk[mid].kodeBuku > cari){
            } else if (listBk[mid].kodeBuku < cari){ //MODFIKASI PERTNYAAN 4
                return FindBinarySearch(cari, left, mid-1);
            }else {
                return FindBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
   }
}
