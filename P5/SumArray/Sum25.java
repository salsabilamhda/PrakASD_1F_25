package P5.SumArray;

public class Sum25 {
    int elemen;
    double keuntungan[], total;

   // Sum25(int elemen){
       // this.elemen = elemen;
       // this.keuntungan = new double[elemen];
       // this.total = 0;
   // }

     public double totalBF(double arr[]){
        double total = 0;
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }
        return total;
    }
    double totalDC(double arr[], int l, int r){
        if(l == r) {
            return arr[l];
        } else if(l < r) {
            int mid = (l + r) / 2;
           // double lsum = totalDC(arr, l, mid-l);
            double lsum = totalDC(arr, l, mid-1); //perbaikan
            //double rsum = totalDC(arr, mid+l, r);
            double rsum = totalDC(arr, mid + 1, r); //perbaikan
            return lsum + rsum+arr[mid];
        }
        return 0;
    }
    
}
