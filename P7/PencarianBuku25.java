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

    //LATIHAN 
    public int FindKodeSeqSearch(String cari){
        int posisi = -1;
        for(int j = 0; j<listBk.length; j++){
            if(listBk[j] != null && listBk[j].kodeBuku.equals(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public String FindKodeBinarySearch(String cari, int left, int right) {
        boolean isSorted = false;
        for (int i = 0; i < idx - 1; i++) {
            if (listBk[i] != null && listBk[i + 1] != null && listBk[i].kodeBuku.compareTo(listBk[i + 1].kodeBuku) > 0) {
                isSorted = false;
                break;
            } else {
                isSorted = true;
            }
        }
    
        if (!isSorted) {
            // Bubble sort untuk mengurutkan array
            for (int i = 0; i < idx - 1; i++) {
                for (int j = 1; j < idx - i; j++) {
                    if (listBk[j] != null && listBk[j - 1] != null && listBk[j].kodeBuku.compareTo(listBk[j - 1].kodeBuku) < 0) {
                        Buku25 tmp = listBk[j];
                        listBk[j] = listBk[j - 1];
                        listBk[j - 1] = tmp;
                    }
                }
            }
        }
    
        // Pencarian biner
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (listBk[mid] != null) {
                int compareResult = cari.compareTo(listBk[mid].kodeBuku);
                if (compareResult == 0) {
                    return listBk[mid].kodeBuku;
                } else if (compareResult < 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return null; 
    }
    

    public void Tampilposisi(String x, int pos){
        if (pos!=-1){
            System.out.println("data : " + x + " ditemukan pada indeks " + pos);

        } else{
            System.out.println("data " + x + " tidak ditemukan");
        }
    }
    
    public void TampilData(String x, int pos){
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

    public Buku25[] FindJudulBuku(String cari) {
        Buku25[] foundBooks = new Buku25[listBk.length];
        int count = 0;

        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j] != null && listBk[j].judulBuku.equals(cari)) {
                foundBooks[count] = listBk[j];
                count++;
            }
        }

        if (count > 0) {
            Buku25[] result = new Buku25[count];
            System.arraycopy(foundBooks, 0, result, 0, count);
            return result;
        } else {
            return null;
        }
    }

    public void findAllJudulBukuBinarySearch(String cari, int left, int right) {
        int firstIndex = -1;
        int lastIndex = -1;

        for(int i=0; i<listBk.length-1; i++){
            for(int j=1; j <listBk.length -i; j++){
                if(listBk[j] != null && listBk[j - 1] != null && listBk[j].judulBuku.compareTo(listBk[j - 1].judulBuku) < 0){
                    Buku25 tmp = listBk[j];
                    listBk[j] = listBk[j-1];
                    listBk[j-1] = tmp;
                }
            }
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (listBk[mid] != null) {
                if (listBk[mid].judulBuku.compareTo(cari) == 0) {
                    firstIndex = mid;
                    lastIndex = mid;
                    // Temukan indeks pertama
                    while (firstIndex > left && listBk[firstIndex - 1] != null && listBk[firstIndex - 1].judulBuku.compareTo(cari) == 0) {
                        firstIndex--;
                    }
                    // Temukan indeks terakhir
                    while (lastIndex < right && listBk[lastIndex + 1] != null && listBk[lastIndex + 1].judulBuku.compareTo(cari) == 0) {
                        lastIndex++;
                    }
                    break;
                } else if (listBk[mid].judulBuku.compareTo(cari) < 0) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        if (firstIndex != -1 && lastIndex != -1) {
            boolean multipleBooksFound = firstIndex != lastIndex;
            for (int i = firstIndex; i <= lastIndex; i++) {
                if (listBk[i] != null && listBk[i].judulBuku.equals(cari)) {
                    System.out.println("Kode Buku       : " + listBk[i].kodeBuku);
                    System.out.println("Judul           : " + listBk[i].judulBuku);
                    System.out.println("Tahun Terbit    : " + listBk[i].tahunTerbit);
                    System.out.println("Pengarang       : " + listBk[i].pengarang);
                    System.out.println("Stock           : " + listBk[i].stock);
                    System.out.println("===============================");
                }
            }

            if (multipleBooksFound) {
                System.out.println("Ditemukan lebih dari 1 data buku dengan judul " + cari);
            }

        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

     //modifikasi
     public Buku25 FindBuku(String cari){
        for (int j = 0; j < idx; j++){
            if (listBk[j] != null && listBk[j].kodeBuku.equals(cari)){
                return listBk[j];
                }
            }
            return null;
           
            }
        }



   /// public int FindSeqSearch(String cari){
       // int posisi = -1;
        //for(int j = 0; j<listBk.length; j++){
            //if(listBk[j].kodeBuku==cari){ 
               // posisi = j;
               // break;
           // }
       // }
       /// return posisi;
   // }
    

    
   //public int FindSeqSearch(String cari){
    //int posisi = -1;
    //for(int j = 0; j<listBk.length; j++){
       // if(listBk[j].kodeBuku==cari){ 
            //posisi = j;
            //break;
        //}
    //}
    //return posisi;
//}

   //Binary
   // public int FindBinarySearch(String cari, int left, int right){
       // int mid;
       // if (right >= left){
            //mid = (left + right)/2;
            //if(cari == listBk[mid].kodeBuku){
               // return(mid);
            //}else if (listBk[mid].kodeBuku > cari){
           // } else if (listBk[mid].kodeBuku < cari){ //MODFIKASI PERTNYAAN 4
              //  return FindBinarySearch(cari, left, mid-1);
            //}else {
              //  return FindBinarySearch(cari, mid+1, right);
           // }
       // }
        //return -1;
  // }
            
            
        



