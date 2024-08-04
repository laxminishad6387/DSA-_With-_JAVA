// package insertionAtEnd;
 class insertionAtEnd {
    
        Node head;
         class Node {
          int data;
          Node next;
          Node(int newData)
          {
            data=newData;
            next=null;
          }
            
        }
        public  void Insertion(int newData)
        {
            Node newNode=new Node(newData);
            // linked  list is empty
            if (head==null) {
                head=new Node(newData);
                return ;
            }
            // linkedlist is not empty
            newNode.next=null;
            Node temp=head;
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next=newNode;
        }
        // reverse the linkedlist
        public void reverseLL()
        {
            Node current=head;
            Node prev=null;
            Node nextN=null;
            while (current.next!=null) {
               nextN=current.next;
               current.next=prev;
               prev=current;
               current=nextN; 
            }
           head= prev;
        }
        // display method
        public   void display()
        {
            Node temp=head;
            while (temp.next!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            
        }
        
    
    
    public static void main(String[] args) {
        insertionAtEnd llist=new insertionAtEnd();
        
        llist.Insertion(2);
        llist.Insertion(4);
        llist.Insertion(8);
        llist.Insertion(10);
        System.out.println("orignal linkedlist");
       llist. display();
       System.out.println();
       System.out.println("insert a new node at the end of  linkedlist");
       llist.Insertion(12);
       llist.display();
       System.out.println();
       System.out.println("reverse the linkedlist");
       llist.reverseLL();
   
       llist.display();


    }
}

