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
}
