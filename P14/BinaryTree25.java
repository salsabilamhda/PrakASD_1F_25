package P14;

public class BinaryTree25 {
    Node25 root;

    public BinaryTree25(){
        root = null;
    }

    boolean isEmpty(){
        return root == null;
    }

    void add(int data){
        if(isEmpty()){ //tree is empty
            root = new Node25(data);
        }else{
            Node25 current = root;
            while(true){
                if(data<current.data){
                    if(current.left != null){
                        current = current.left;
                    }else{
                        current.left = new Node25(data);
                        break;
                    }
                }else if(data>current.data){
                    if(current.right != null){
                        current = current.right;
                    }else{
                        current.right = new Node25(data);
                        break;
                    }
                }else{// data is alredy exist
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean result = false;
        Node25 current = root;
        while(current!=null){
            if(current.data==data){
                result = true;
                break;
            }else if(data<current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(Node25 node){
        if(node != null){
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    void traversePostOrder(Node25 node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }
    void traverseInOrder(Node25 node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node25 getSuccessor(Node25 del){
        Node25 successor = del.right;
        Node25 successorParent = del;
        while(successor.left!=null){
            successorParent = successor;
            successor = successor.left;
        }
        if(successor!=del.right){
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data){
        if(isEmpty()){
            System.out.println("Tree is empty");
            return;
        }
        //find node (current) that will be deleted
        Node25 parent = root;
        Node25 current = root;
        boolean isLeftChild = false;
        while(current!=null){
            if(current.data==data){
                break;
            }else if(data<current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if(data>current.data){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

            //deletion
            if(current==null){
                System.out.println("Couldn't find data!");
                return;
            }else{
                //if there is no child, simply delete it
                if(current.left==null &&current.right==null){
                    if(current==root){
                        root = null;
                    }else{
                        if(isLeftChild){
                            parent.left = null;
                        }else{
                            parent.right = null;
                        }
                    }
                }else if(current.left == null){//if there is 1 child(right)
                    if(current==root){
                        root = current.right;
                    }else{
                        if(isLeftChild){
                            parent.left = current.right;
                        }else{
                            parent.right = current.right;
                        }
                    }
                }else if(current.right == null){//if there is 1 child(left)
                    if(current==root){
                        root = current.left;
                    }else{
                        if(isLeftChild){
                            parent.left = current.left;
                        }else{
                            parent.right = current.left;
                        }
                    }
                }else{//if there is 2 childs
                    Node25 successor = getSuccessor(current);
                    if(current==root){
                        root = successor;
                    }else{
                        if(isLeftChild){
                            parent.left = successor;
                        }else{
                            parent.right = successor;
                        }
                        successor.left = current.left;
                    }
                }
            }
            }

    //Tugas No 1
    void addRekursif(int data){
        root = addRekursif(root, data);
    }

    public Node25 addRekursif(Node25 current, int data){
        if (current == null){
            return new Node25(data);
        }
        if (data < current.data){
            current.left = addRekursif(current.left, data);
        }else if(data > current.data){
            current.right = addRekursif(current.right, data);
        }else{
            return current;
        }
        return current;
    }

    //Tugas No 2
    void NilaiTerbesar(){
        Node25 current = root;
        while(current.right != null){
            current = current.right;
        }
        System.out.println(current.data);
    }

    void NilaiTerkecil(){
        Node25 current = root;
        while(current.left != null){
            current = current.left;
        }
        System.out.println(current.data);
    }

    //Tugas No 3
    void printLeaf(Node25 node){
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(" " + node.data);
            }
            printLeaf(node.left);
            printLeaf(node.right);
        }
    }

     //Tugas No 4
    int jumlahLeft(){
        return jumlahLeft(root);
    }
    int jumlahLeft(Node25 node){
        if(node == null){
            return 0;
        }
        if(node.left == null && node.right == null){
            return 1;
        }else{
            return jumlahLeft(node.left)+jumlahLeft(node.right);
        }
    }
}
