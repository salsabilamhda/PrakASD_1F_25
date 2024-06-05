package P15;

public class Node25 {
    int data, jarak;
    Node25 prev,next;

    Node25(Node25 prev, int data, int jarak,Node25 next){
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }
}
