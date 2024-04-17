package P8;

public class Gudang25 {
    
    Barang25[] tumpukan;
    int size;
    int top;

    public Gudang25(int kapasitas){
        size = kapasitas;
        tumpukan = new Barang25[size];
        top = -1;
    }

    public boolean cekKosong(){
        if(top == -1){
            return true;
        }else {
            return false;
        }
    }

    public boolean cekPenuh(){
        if(top == size -1){
            return true;
        }else {
            return false;
        }
    }

    public void tambahBarang(Barang25 brg){
        if(!cekPenuh()){
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhaasil ditambahkan ke Gudang");
        }else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang25 ambilBarang(){
        if(!cekKosong()){
            Barang25 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode)); //percobaan 2
            return delete;
        }else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public Barang25 lihatBarangTeratas(){
       // if(!isEmpty()) { kode lama
        if(!cekKosong()){ //kode baru 
            Barang25 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public void tampilkanBarang(){
        if(!cekKosong()){
            System.out.println("Rincian tumpukan barang di Gudang");

            //for(int i = 0; i<=top; i++){ kode  lama
            for(int i = top; i >= 0; i--){ // kode baru 
                System.out.printf("Kode%d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        }else {
            System.out.println("Tumpukan barang kosong");
        }
    }

    //percobaan 2
    public String konversiDesimalKeBiner(int kode){
        StackKonversi25 stack = new StackKonversi25();
        //while(kode > 0){ kode lama
        while(kode!=0){ //kode baru
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()){
            biner += stack.pop();
        }
        return biner;
    }
}
