import java.util.*;
import java.io.*;
public class zigzaglink {
    public static Node mid(Node head){
       Node slow=head;
       Node fast=head.next;
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;

       }
       return slow;
    }
    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;



    }
    public static void zigzag(Node head){
        Node mid=mid(head);
        Node temp=mid.next;
        mid.next=null;
        Node righthead=reverse(temp);
        Node headc=head;
        Node right=righthead;
        Node nextleft=null;
        Node nextright=null;
        while(headc!=null && right!=null){
            nextleft=headc.next;
            headc.next=right;
            nextright=right.next;
            right.next=nextleft;
            headc=nextleft;
            right=nextright;

        }
        

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
        LinkedLists li=new LinkedLists();
        System.out.println("enter the size of the linked list");
        int size=Integer.parseInt(obj.readLine());
        for(int i=0;i<size;i++){
            li.addlast(Integer.parseInt(obj.readLine()));
        }
        li.print();
        zigzag(li.head);
        System.out.println("linkedlist after zigzag");
        li.print();





    }
    
}
