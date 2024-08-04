// package searchElement;

import java.util.Scanner;

public class searchElement {
     Node head;
     class Node{
        int data;
        Node next;
        Node(int newData)
        {
            data=newData;
            next=null;
        }
     }
     public void insertion(int newData)
     {
        Node newNode=new Node(newData);
        if (head==null) {
            // head=new Node(newData);
            head=newNode;
            return;
        }
        Node temp=head;
        newNode.next=null;
        while (temp.next!=null) {
            temp=temp.next;
        }
        temp.next=newNode;
        return;
        
     }
     public int search(int key)
     { 
        int flag=0;
        Node temp=head;
        while (temp!=null) {
            if (temp.data==key) {
               flag=1;
               return flag;
            }
            temp=temp.next;
            
        }
        return flag;
     }
     public void display()
     {
        Node  temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        return;
   
     }
     public static void main(String[] args) {
        searchElement llist=new searchElement();
        llist.insertion(2);
       
        llist.insertion(4);
       
        llist.insertion(8);
       
        llist.insertion(10);
        llist.display();
       
        System.out.println();
       int result= llist.search(8);
       if (result==1) {
        System.out.println("yes");
       }
       else
       {
        System.out.println("No");
       }
     }
    
}