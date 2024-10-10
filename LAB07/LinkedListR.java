package LAB07;

public class LinkedListR {
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
    public static void printLinkedListR(Node head)
    {
        if(head==null)
        return ;
        else{
            System.out.print(head.data+" ");
            printLinkedListR(head.next);

        }
    }
    public static void main(String[] args) {
        LinkedListR llr=new LinkedListR();
        llr.add(5);
        llr.add(10);
        llr.add(15);
        llr.add(20);
        llr.add(25);
        System.out.print("Recursion:");
        printLinkedListR(llr.head);


    }
    
}
