package P3.AOBpersegiPanjang;

public class AOBduaDimensiMain25 {
    
    public static void main(String[] args) {
        AOBduaDimensi25[][] dua = new AOBduaDimensi25[2][2];

        dua[0][0] = new AOBduaDimensi25();
        dua[0][0].nilai = 80;
        
        dua[0][1] = new AOBduaDimensi25();
        dua[0][1].nilai = 90;
        
        dua[1][0] = new AOBduaDimensi25();
        dua[1][0].nilai = 85;
        
        dua[1][1] = new AOBduaDimensi25();
        dua[1][1].nilai = 89;
        
        System.out.println("Nilai kuis 1 Praktikum ASD "+dua[0][0].nilai);
        System.out.println("Nilai kuis 2 Praktikum ASD "+dua[0][1].nilai);
        System.out.println("Nilai kuis 1 ASD "+dua[1][0].nilai);
        System.out.println("Nilai kuis 2 ASD "+dua[1][1].nilai);
    }
}


