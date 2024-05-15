package P11.Tugas_P11.Nomor1;

public class Mahasiswa25 {
    Node25 head, tail;

    boolean isEmpty(){
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node25 tmp = head;
            System.out.print("Isi linked list: \t");
            while (tmp != null) {
                System.out.print("[" + tmp.nim + ", " + tmp.nama +  "]\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    void addFirst(int nim, String nama) {
        Node25 ndInput = new Node25(nim, nama, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int nim, String nama) {
        Node25 ndInput = new Node25(nim, nama,null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int nim, String nama) {
        Node25 ndInput = new Node25(nim, nama, null);
        Node25 temp = head;
        while (temp != null) {
            if (temp.nim == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
    
                if (temp == tail) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }
    

    void insertAt(int index, int nim, String nama) {
        if (index > 0) {
            Node25 temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = new Node25(nim, nama, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        } else if (index == 0) {
            addFirst(nim, nama);
        } else {
            System.out.println("Indeks -1. Tidak bisa melakukan operasi linked list!");
        }
    }
}
