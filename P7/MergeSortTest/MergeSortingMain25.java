package P7.MergeSortTest;

public class MergeSortingMain25 {
    
    public static void main(String[] args) {
        int data[] = {10,40,30,50,70,20,100,90};
        System.out.println("sorting dengan merge sort");
        MergeSorting25 mSort = new MergeSorting25();
        System.out.println("data awal");
        mSort.printArray(data);
        System.out.println("setelah diurutkan");
        mSort.mergeSort(data);
    }
}
