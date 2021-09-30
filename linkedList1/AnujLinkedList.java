package linkedList1;

public class AnujLinkedList {

    public static void main(String[] args) {
        
        AnujLinkedList list = new AnujLinkedList();
        list.add(6);
        list.add(4);
        list.add(4);

        list.print();


    }
    
    Node head;

    void add(int data){
        Node toAdd = new Node(data);

        Node temp = head;
        while(temp.next !=null) {
            temp = temp.next;
        }
        temp.next = toAdd;

    }

    void print() {
        Node temp =head;
        while(temp.next != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}
