package BinaryTree;

public class Contains {
private boolean contains(Node current, int value){
    if (current == null){
        return false;
    }
    if (value == current.value){
        return true;
    }
    return value < current.value;
//            if (contains(current.left, value)){
//        }else if (contains(current.right, value));
}
}
