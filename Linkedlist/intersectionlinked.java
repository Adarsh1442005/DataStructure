package Linkedlist;
import java.io.*;
import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int data){
      this.data=data;
      this.next=null;
    }
}
class LinkedList{
    Node head;
    Node tail;
    public void addlast(int data){
        Node obj=new Node(data);
        if(head==null){
            head=obj;
            tail=obj;
        }
        else{
            tail.next=obj;
            tail=obj;
        }
    }
}

public class intersectionlinked {
    public static Node intersection(Node head1,Node head2){
        Node head1c=head1;
        Node head2c=head2;
        while(head1c!=null){
            while(head2c!=null){
                if(head1c==head2c){
                    return head1c;
                    
                }
                head2c=head2c.next;

            }
            head1c=head1c.next;
            head2c=head2;




        }
        return null;



    }
    public static void main(String args[]) throws IOException{
        LinkedList li=new LinkedList();
        li.addlast(4);
        li.addlast(5);
        li.addlast(6);
    
        LinkedList li_2=new LinkedList();
        li_2.addlast(1);
        li_2.addlast(2);
        li_2.addlast(3);
        li_2.tail.next=li.tail;
        li.addlast(7);
  Node head=li_2.head;
  while(head!=null){
    System.out.println(head.data);
    head=head.next;
  }
  Node intersect=intersection(li.head, li_2.head);
  if(intersect!=null){
    System.out.println("intersecting point is :"+intersect.data);
  }





    }
    
    
}
