package Kuis2_25_1F_Salsabila;

public class Pesanan25 {
    Pesanan25 head;
    int size;
    int kodePesanan, harga;
    String namaPesanan;

    Pesanan25 prev, next;

    Pesanan25(Pesanan25 prev, int a, String b, int d, Pesanan25 next){
        this.prev = prev;
        a = kodePesanan;
        b = namaPesanan;
        d = harga;
        this.next = next;
    }

    public Pesanan25(){
        head = null;
        size = 0;    
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst25(int kodePesanan, String namaPesanan, int harga){
        if (isEmpty()){
            head  = new Pesanan25(null, kodePesanan, namaPesanan, harga, null);
        }else{
            Pesanan25 newNode = new Pesanan25(null, kodePesanan, namaPesanan, harga, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
}
