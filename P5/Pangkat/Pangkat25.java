package P5.Pangkat;

public class Pangkat25 {
    public int nilai, pangkat;

    public Pangkat25(int nilai, int pangkat){ //MODIFIKASI
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    int pangkatBF(int a, int n){
        //int hasil = 0; 
        int hasil = 1; //perbaikan
        for(int i=0; i<n; i++){
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n){
        if(n==1){
           // return 1;
            return a;  //perbaikan
        } else{
            if(n%2==1) // bilangan ganjil
            {
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a);
            }else{
                return (pangkatDC(a,n/2)*pangkatDC(a,n/2));
            }
        }
    }
}
