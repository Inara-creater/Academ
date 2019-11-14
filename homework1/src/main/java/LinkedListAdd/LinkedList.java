package LinkedListAdd;
public class LinkedList{

    class Node {
        int value;
        Node next;
    }

    private Node first;
    void add(int num) {
        Node node = new Node();
        node.value = num;

        Node node2 = new Node();
        node.value = num;
        node.next = node2;

        Node node3 = new Node();
        node2.value = num;
        node2.next = node3;


    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);




}

}
