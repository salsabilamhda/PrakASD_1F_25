package P10.Tugas;

public class Queue {
    Pembeli25[] antrian;
    int front, rear, size, max;

    public Queue(int n) {
        max = n;
        antrian = new Pembeli25[max];
        size = 0;
        front = rear = -1; 
    }

    public boolean IsEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(Pembeli25 antri){
        if(IsFull()){
            System.out.println("Queue sudah penuh");
        }else{
            if(IsEmpty()){
                front = rear = 0;
            }else{
                if (rear == max -1){
                    rear = 0;
                }else{
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        }
    }

    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen terdepan : "+antrian[front].nama+ " "+antrian[front].noHP);
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Elemen yang belakang : "+antrian[rear].nama+ " "+antrian[rear].noHP);
        }else{
            System.out.println("Queue masih kosong");
        }
    }

    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else {
            int i = front;
            while(i != rear){
                System.out.println(antrian[i].nama + " | "+antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " | "+antrian[i].noHP);
            System.out.println("Jumlah elemen = "+ size);
        }
    }

    public Pembeli25 Dequeue() {
        Pembeli25 dt = new Pembeli25();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
    

    public void peekPosition(String nama){
        int i = front;
        boolean j = true;
        while (j) {
            if (nama.equals(this.antrian[i].nama)) {
                System.out.println("data " + antrian[i].nama + " ada di antrian ke-" + i);
                j = false;
            }
            i++;
        }
    }

    public void daftarPembeli(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }else {
            int i = front;
            while(i != rear){
                System.out.println(antrian[i].nama + " | "+antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " | "+antrian[i].noHP);
            System.out.println("Jumlah elemen = "+ size);
        }
    }



}
