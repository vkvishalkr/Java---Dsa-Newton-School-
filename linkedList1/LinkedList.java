package linkedList1;

public class LinkedList {

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();

        list.insert(12);
        list.insert(42);
        list.insert(92);

        list.show();
    }
    

    Node head;

    public void insert(int data)
    {
        Node node = new Node(data);
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show()
    {
        Node node = head;

        while(node.next != null)
        {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

}
