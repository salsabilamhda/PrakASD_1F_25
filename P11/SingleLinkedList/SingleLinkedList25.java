package P11.SingleLinkedList;

public class SingleLinkedList25 {
    Node25 head, tail;

    boolean isEmpty(){
        return head == null;
    }

    void print(){
        if(!isEmpty()){
            Node25 tmp = head;
            System.out.print("Isi Linked List: \t");
            while(tmp != null){
                System.out.print(tmp.data +"\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(int input){
        Node25 ndInput = new Node25(input, null);
        if(isEmpty()){ 
            head = ndInput; 
            tail = ndInput;
        }else{
            ndInput.next = head;
                head = ndInput;
        }
    }

    void addLast(int input){
        Node25 ndInput = new Node25(input, null);
        if(isEmpty()){
            head = ndInput; 
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input){
        Node25 ndInput = new Node25(input, null);
        Node25 temp = head;
        do {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next != null) tail = ndInput;
                break;
            }
            temp = temp.next;
        }while (temp != null);
    }

    void insertAt(int index, int input){
        if(index < 0){
            System.out.println("perbaiki logikanya!"
                            + "kalau indeksnya -1 bagaimana???");
        } else if(index == 0){
            addFirst(input);
        } else {
            Node25 temp = head;
            for(int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = new Node25(input, temp.next);
            if(temp.next.next == null) tail=temp.next;
        }
    }

    //MODIFIKASI ELEMEN
    int getData(int index){
        Node25 tmp = head;
        for (int i=0; i<index; i++){
            tmp =  tmp.next;
        }
        return tmp.data;
    }

    int indexOf(int key){
        Node25 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null){
            return -1;
        }else{
            return index;
        }
    }

    void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked List Masih Kosong,"
                                + "tidak dapat dihaapus!");
        }else if (head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()){
            System.out.println("Linked List Masih kosong," 
                            + "tidak dapat dihapus!");
        }else if (head == tail){
            head = tail = null;
        }else{
            Node25 temp = head;
            while (temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp.next;
        }
    }

    void remove(int key){
        if(isEmpty()){
            System.out.println("Linked List Masih kosong,"
                                + "tidak dapat dihapus!");
        }else {
            Node25 temp = head;
            while (temp != null){
                if((temp.data == key) && (temp == head)){
                    removeFirst();
                    break;
                }else if (temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index){
        if(index == 0){
            removeFirst();
        }else{
            Node25 temp = head;
            for(int i=0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null){
                tail = temp;
            }
        }
    }
}
