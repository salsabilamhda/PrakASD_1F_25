package Kuis2_25_1F_Salsabila;

public class Pembeli25 {
    Node25 head;
    int size;
    String namaPembeli, noHP;


    Pembeli25(String b, String c){
        b = namaPembeli;
        c = noHP;
    }

    public Pembeli25(){
        head = null;
        size = 0;    
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst25(String namaPembeli, String noHp){
        if (isEmpty()){
            head  = new Node25(null, namaPembeli, noHp, null);
        }else{
            Node25 newNode = new Node25(null, namaPembeli, noHp, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast25(String namaPembeli, String noHP){
        if (isEmpty()){
            addFirst25(namaPembeli, noHP);
        }else{
            Node25 current = head;
            while (current.next != null){
                current = current.next;
            }
            Node25 newNode = new Node25(current, namaPembeli, noHP, null);
            current.next = newNode;
            size++;
        }
    }

    public void printMenu25(){
        System.out.println("----------------------");
        System.out.println("Masukkan Data Pembeli"); 
        System.out.println("----------------------");
        if(!isEmpty()){
            Node25 tmp = head;
            int antrian = 1;
            while (tmp != null){
                System.out.println("No Antrian\t: " + antrian);
                System.out.println("Nama Customer \t: "+tmp.namaPembeli);
                System.out.println("Nomor Hp\t: "+tmp.noHP);
                System.out.println();
                tmp = tmp.next;
                antrian++;
            }
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    public void print25(){
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("Daftar Antrian Resto Royal Delish"); 
        System.out.println("+++++++++++++++++++++++++++++++++");
        if(!isEmpty()){
            Node25 tmp = head;
            int antrian = 1;
            while (tmp != null){
                System.out.println("No Antrian\t: "+ antrian);
                System.out.println("Nama Customer \t: "+tmp.namaPembeli);
                System.out.println("Nomor Hp\t: "+tmp.noHP);
                System.out.println("------------------------------------");
                System.out.println();
                tmp = tmp.next;
                antrian++;
            }
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    public void removeFirst25() {
        if(isEmpty()){
            System.out.println("Linked List Masih Kosong,"
                                + "tidak dapat dihaapus!");
        }else if (size == 1){
            removeLast25();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast25()  {
        if(isEmpty()){
            System.out.println("Linked List Masih Kosong,"
            + "tidak dapat dihaapus!");
        }else if (head.next == null){
            head = null;
            size--;
            return;
        }
        Node25 current = head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }

   

    
}
