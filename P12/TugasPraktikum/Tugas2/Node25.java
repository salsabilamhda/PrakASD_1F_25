package P12.TugasPraktikum.Tugas2;

public class Node25 {
    int id;
    String judulFilm;
    double rating;

    Node25 prev, next;
    

    Node25(Node25 prev, int id, String judulFilm, double rating, Node25 next){
        this.prev = prev;
        this.id = id;
        this.judulFilm = judulFilm;
        this.rating = rating;
        this.next = next;
    }
}