package DataStructure;
class linkedList {
    Node head;
    // static : 메모리 할당을 한 번만 한다. 공유되는 것이라고 생각할 수 있다.
    static class Node{
        int data;
        Node next;

        // Constructor
        Node(int d){
            data = d;
            next = null;
        }
    }

    public static void main(String[] args){
        linkedList llist = new linkedList();

        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        llist.head.next = second;
        second.next = third;

    }
}
