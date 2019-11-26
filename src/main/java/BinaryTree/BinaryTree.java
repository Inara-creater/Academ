package BinaryTree;

public class BinaryTree {
    Node root;

    private Node addRecursive(Node current, int value){
        if (current == null){
            return new Node(value);
        }

        if (value < current.value){
            current.left = addRecursive(current.left, value);
        }else if (value > current.value){
            current.right = addRecursive(current.right, value);
        }else {
            return current;
        }return current;
    }

    public void add (int value){
        root = addRecursive(root, value);
    }

    private BinaryTree create(){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(10);
        binaryTree.add(19);
        binaryTree.add(22);
        binaryTree.add(12);
        binaryTree.add(30);
        binaryTree.add(28);
        binaryTree.add(15);
        return binaryTree;
    }
}
