package P12.DoubleLinkedList;

public class DoubleLinkedList25Main {
    public static void main(String[] args) throws Exception {
        DoubleLinkedList25 dll = new DoubleLinkedList25();
        
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("===============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("===============================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("===============================");
        System.out.println("Data Awal pada linked list adalah : "+dll.getFirst());
        System.out.println("Data akhir pada linked list adalah : "+ dll.getLast());
        System.out.println("Data Pada indeks ke-1 pada linked list adalah : "+dll.get(1));
    } 
}

    

