package P11.Tugas_P11.Nomor1;

public class Mhs25Main {
    public static void main(String[] args) {
        Mahasiswa25 singLL = new Mahasiswa25();

        singLL.print();
        singLL.addFirst(112, "Prita");
        singLL.print();
        singLL.addFirst(111, "Anton");
        singLL.print();
        singLL.insertAfter(112, 114, "Doni");
        singLL.print();
        singLL.insertAt(2, 113, "Yusuf");
        singLL.print();
        singLL.addLast(115, "Sari");
        singLL.print();
    }
}
