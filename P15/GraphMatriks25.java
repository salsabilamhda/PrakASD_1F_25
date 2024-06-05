package P15;

public class GraphMatriks25 {
    int vertex;
    int[][] matriks;

    public GraphMatriks25(int v){
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak){
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan){
       // matriks[asal][tujuan] = -1;
        matriks[asal][tujuan] = 0; //perbaikan 
    }


    public void printGraph(){
        for(int i = 0; i<vertex; i++){
            System.out.println("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++){
                if(matriks[i][j] != -1){
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + "m), ");
                }
            }
            System.out.println();
        }
    }

    //modifikasi no 4
    public void degree(int asal) {
        int totalIn = 0, totalOut = 0;
        for(int i = 0; i < vertex; i++) {
            // inDegree
            if(matriks[i][asal] != 0) {
                totalIn++;
            }
            // outDegree
            if(matriks[asal][i] != 0) {
                totalOut++;
            }
        }
        System.out.println("Indegree dari Gedung " + (char) ('A' + asal) + " : " + totalIn);
        System.out.println("Outdegree dari Gedung " + (char) ('A' + asal) + " : " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + " : " + (totalIn + totalOut));
    }

}
