package P15;

public class Graph25 {

        int vertex;
        DoubleLinkedList25 list[];

        public Graph25(int v){
            vertex = v;
            list = new DoubleLinkedList25[v];
            for(int i=0; i<v; i++){
                list[i] = new DoubleLinkedList25();
            }
        }

        public void addEdge(int asal, int tujuan, int jarak){
            //deirected
            list[asal].addFirst(tujuan, jarak);

            //undirected
            //list[tujuan].addFirst(tujuan, jarak);
            
        }

        
        public void degree(int asal)throws Exception{
            int k, totalIn =0, totalOut = 0;
            for(int i=0; i<vertex; i++){
                //inDegree
                for(int j=0; j<list[i].size(); j++){
                    if(list[i].get(j)==asal){
                        ++totalIn;
                    }
                }
                //outDegree
                for(k=0; k<list[asal].size(); k++){
                    list[asal].get(k);
                }
                totalOut = k;
            }
            System.out.println("Indegree dari Gedung " + (char) ('A' + asal) + ": "  +totalIn);
            System.out.println("Outdegree dari Gedung " + (char) ('A' + asal) + ": "  +totalOut);
            System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": "  + (totalIn + totalOut));
        }

        public void removeEdge(int asal, int tujuan)throws Exception{
            for(int i=0; i<vertex; i++){
                if(i==tujuan){
                    list[asal].remove(tujuan);
                }
            }
        }
        public void removeAllEdges(){
            for(int i=0; i<vertex; i++){
                list[i].clear();
            }
            System.out.println("Graph berhasil dikosongkan");
        }

        public void printGraph() throws Exception{
            for(int i=0; i<vertex; i++){
                if(list[i].size()>0){
                    System.out.print("Gedung "+ (char) ('A' + i) + " terhubung dengan : ");
                    for(int j=0; j<list[i].size(); j++){
                        System.out.print((char)('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                    }
                    System.out.println("");
                }
            }
            System.out.println(" ");
        }

        //modifikasi no 5
        public boolean isConnected(int asal, int tujuan) throws Exception {
            for (int i = 0; i < list[asal].size(); i++) {
                if (list[asal].get(i) == tujuan) {
                    return true;
                }
            }
            return false;
        }

        //Latihan Praktikum No 2
        public void updateJarak(int asal, int tujuan, int jarakBaru) throws Exception {
            for (int i = 0; i < list[asal].size(); i++) {
                if (list[asal].get(i) == tujuan) {
                    list[asal].updateJarak(tujuan, jarakBaru);
                    System.out.println("Jarak dari Gedung " + (char) ('A' + asal) + " ke Gedung " + (char) ('A' + tujuan) + " telah diubah menjadi " + jarakBaru + " m");
                    return;
                }
            }
            System.out.println("Edge tidak ditemukan!");
        }
}
