package LinkedListAdd;
public class LinkedList{

    class Node {
        int value;
        Node next;
    }

    private Node first;
    Node add(int num) {
        Node node = new Node();
        node.value = num;

        Node node2 = new Node();
        node.value = num;
        node.next = node2;

        Node node3 = new Node();
        node2.value = num;
        node2.next = node3;

        return node;


    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node node = list.add(10);
        Node node1 = list.add(20);
        Node node2 = list.add(30);

        System.out.println(list);




}

}
