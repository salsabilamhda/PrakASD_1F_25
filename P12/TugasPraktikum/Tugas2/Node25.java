package P12.TugasPraktikum.Tugas2;

public class Node25 {
    int id;
    String namaPembeli, noHP;

    Node25 prev, next;

    Node25(Node25 prev, String namaPembeli, String noHP, Node25 next){
        this.prev = prev;
        this.namaPembeli = namaPembeli;
        this.noHP = noHP;
        this.next = next;
    }
}
