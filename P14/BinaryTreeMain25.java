package P14;

public class BinaryTreeMain25 {
    public static void main(String[] args) {
        BinaryTree25 bt = new BinaryTree25();
    
        bt.addRekursif(6);
        bt.addRekursif(4);
        bt.addRekursif(8);
        bt.addRekursif(3);
        bt.addRekursif(5);
        bt.addRekursif(7);
        bt.addRekursif(9);
        bt.addRekursif(10);
        bt.addRekursif(15);
        bt.addRekursif(50);
    
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("inOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node : "+bt.find(5));
        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
    }
}

