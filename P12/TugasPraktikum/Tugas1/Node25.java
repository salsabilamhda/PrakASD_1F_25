package P12.TugasPraktikum.Tugas1;

public class Node25 {
    int nomor;
    String nama;

    Node25 prev, next;

    Node25(Node25 prev, int nomor, String nama, Node25 next){
        this.prev = prev;
        this.nomor = nomor;
        this.nama = nama;
        this.next = next;
    }
}
