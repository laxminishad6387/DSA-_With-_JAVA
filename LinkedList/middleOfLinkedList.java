// package middleOfLinkedList;
public class middleOfLinkedList {
    Node head;
    class  Node {
      int data;
      Node next;
      Node(int newData)
      {
        data=newData;
        next=null;
      }
        
    }
    public void insertAtEnd(int newData)
    {
        Node newNode=new Node(newData);
        // linkedlist is empty
        if(head==null)
        {
            head=new Node(newData);
        }
        Node temp=head;
        newNode.next=null;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    // finding mid node
    public void middleNode()
    {
        Node slow=head;
        Node fast=head;
       while (fast!=null || fast.next!=null) {
           slow=slow.next;
           fast=fast.next.next;
       }
       System.out.println(slow.data); 
    }
    public void display()
    {
        Node temp=head;
        while (temp.next!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

  public static void main(String[] args) {
     middleOfLinkedList llist=new middleOfLinkedList();
     llist.insertAtEnd(2);
     llist.insertAtEnd(4);
    //  llist.insertAtEnd(8);
     System.out.println("original linkedlist");
     llist.display();

    }
}
