package P6.LatihanPraktikum;

public class HotelService25 {
    Hotel25 rooms[] = new Hotel25[5];
    int index;

    //method tambah 
    void tambah(Hotel25 H){
        if(index < rooms.length){
            rooms[index] = H;
            index++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }

    //method tampil
    void tampilAll(){
        for(Hotel25 H : rooms){
            H.tampilDataHotel();
        }
    }

    //method bubble sort harga
    void bubbleSortHarga(){
        for(int i=0; i<rooms.length-1; i++){
            for(int j=1; j<rooms.length-i; j++){
                if(rooms[j].harga < rooms[j-1].harga){
                    Hotel25 temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }

    //method selection sort harga
    void selectionSortHarga(){
        for(int i=0; i<rooms.length-1; i++){
            int indexMin = i;
            for(int j=i+1; j<rooms.length; j++){
                if(rooms[j].harga < rooms[indexMin].harga){
                    indexMin = j;
                }
            }
            Hotel25 temp = rooms[indexMin];
            rooms[indexMin] = rooms[i];
            rooms[i] = temp;
        }
    }

    //method bubble sort bintang
    void bubbleSortBintang(){
        for(int i=0; i<rooms.length-1; i++){
            for(int j=1; j<rooms.length-i; j++){
                if(rooms[j].bintang > rooms[j-1].bintang){
                    Hotel25 temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }

    //method selection sort bintang 
    void selectionSortBintang(){
        for(int i=0; i<rooms.length-1; i++){
            int indexMax = i;
            for(int j=i+1; j<rooms.length; j++){
                if(rooms[j].bintang > rooms[indexMax].bintang){
                    indexMax = j;
                }
            }
            Hotel25 temp = rooms[i];
            rooms[i] = rooms[indexMax];
            rooms[indexMax] = temp;
        }
    }
}
