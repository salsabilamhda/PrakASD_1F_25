package P15;

public class DoubleLinkedList25 {
    Node25 head;
    int size;

    public DoubleLinkedList25(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public int get(int index) throws Exception{
        if(isEmpty() || index >= size){
            throw new Exception ("nilai indeks diluar batas");
        }
        Node25 tmp = head;
        for (int i =0; i<index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void addFirst(int item, int jarak){
        if (isEmpty()){
            head  = new Node25(null, item,jarak, null);
        }else{
            Node25 newNode = new Node25(null, item, jarak,  head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty()|| index >= size ){
            throw new Exception("Nilai index di luar batas");
        }
        Node25 tmp = head;
        for (int i = 0; i<index; i++){
            tmp = tmp.next  ;
        }
        return tmp.jarak;
    }

    public void remove(int index){
        Node25 current = head;
            while (current != null){
                if(current.data == index){
                    if(current.prev != null){
                        current.prev.next = current.next;
                    } else {
                        head = current.next;
                    }
                    if (current.next != null){
                        current.next.prev = current.prev;
                    }
                    //break;
                    size--; //perbaikan kode 
                    return; // perbaikan kode

                }
                current = current.next;
            }
    }

}
