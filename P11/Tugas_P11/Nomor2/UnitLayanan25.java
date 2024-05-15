package P11.Tugas_P11.Nomor2;

public class UnitLayanan25 {
    Node25 head, tail;


    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node25 tmp = head;
            int antrian = 0;
            while (tmp != null) {
                System.out.println("Antrian ke - " + (antrian+1)+ " = [" + tmp.nim+"] ["+tmp.nama + "]");
                tmp = tmp.next;
                antrian++;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong\n");
        }
    }

    
    void addLast(int nim, String nama){
        Node25 ndInput = new Node25(nim, nama, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List Masih Kosong");
        }else if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }
}
