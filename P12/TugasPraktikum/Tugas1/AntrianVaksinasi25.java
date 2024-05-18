package P12.TugasPraktikum.Tugas1;

public class AntrianVaksinasi25 {
    Node25 head;
    int size;

    public AntrianVaksinasi25(){
        head = null;
        size = 1;    
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addLast(int nomor, String nama){
        if (isEmpty()){
            head  = new Node25(null, nomor, nama, null);
        }else{
            Node25 current = head;
            while (current.next != null){
                current = current.next;
            }
            Node25 newNode = new Node25(current, nomor, nama,null);
            current.next = newNode;
            size++;
        }
    }
    public void removeFirst() throws Exception{
        if(isEmpty()){
            throw new Exception("Linked List Masih kosong, tidak dapat dihapus!");
        }else if (size == 1){
            removeLast();
        }else{
            System.out.println(head.nama+" telah selesai divaksin");
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception {
        if(isEmpty()){
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        }else if (head.next == null){
            System.out.println(head.nama+" telah selesai divaksinasi");
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
    public void print(){
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(" DAFTAR PENGANTRI VAKSIN ");
        System.out.println("+++++++++++++++++++++++++"); 
        System.out.printf("| %-6s | %-10s |\n", "No", "Nama");
        if(!isEmpty()){
            Node25 tmp = head;
            while (tmp != null){
                System.out.printf("| %-6d | %-10s |\n", tmp.nomor, tmp.nama);
                tmp = tmp.next;
            }
            System.out.println("\nSisa Antrian "+size);
        }else{
            System.out.println("Linked List Kosong");
        }
    }

}
