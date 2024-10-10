package LAB07;

public class LinkedList {
    Node head;
    class Node {
        int data;      
        Node next;     
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public void printNodes()
    {
        Node current=head;
        if(current==null)
        return;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        System.out.print("Iterative:");
        ll.printNodes();
        
    }
    
}
