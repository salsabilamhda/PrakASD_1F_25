package P3.ArrayBalok;

public class ArrayBalok25 {
    public static void main(String[] args) {
        Balok25[] blArray = new Balok25[3];

        blArray[0] = new Balok25(100, 30, 12);
        blArray[1] = new Balok25(120, 40, 15);
        blArray[2] = new Balok25(210, 50, 25);

        for(int i = 0; i < 3; i++)
        {
            System.out.println("Volume balok ke " + i + ": " + blArray[i].hitungVolume());
        }

        Segitiga25[] sgArray = new Segitiga25[4];

        sgArray[0] = new Segitiga25(10, 4);
        sgArray[1] = new Segitiga25(20, 10);
        sgArray[2] = new Segitiga25(15, 6);
        sgArray[3] = new Segitiga25(25, 10);

        for(int i = 0; i < 4;  i++)
        {
            System.out.println("Luas Segitiga " + i + ": " + sgArray[i].hitungLuas());
            System.out.println("Keliling Segitiga " + i + ": " + sgArray[i].hitungKeliling());
        }

    }
}
