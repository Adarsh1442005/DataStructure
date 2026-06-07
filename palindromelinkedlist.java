import java.util.*;
import java.io.*;

class LinkedList2{
    Node head;
    Node tail;
    int size=0;
    public void addfirst(int data){
          Node obj=new Node(data);
          size++;
          if(head==null){
             head=obj;
             tail=obj;
             return;
          }
          obj.next=head;
          head=obj;
          return;


    }
    public void addlast(int data){
       
        Node obj=new Node(data);
        size++;
        if(tail==null){
            tail=obj;
            head=obj;
            return;
        }
        tail.next=obj;
        tail=obj;
        


    }
    public boolean iscycle(){
     Node slow=head;
     Node fast=head;
     while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
         if(slow==fast){
            return true;
         }
        
     }
     return false;




    }
    public void removecycle(){
        if(!iscycle()){
            System.out.println("cycle does not exist");
            return;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        slow=head;
        Node prev=null;
        while(slow!=fast){
            slow=slow.next;
            prev=fast;
            fast=fast.next;



        }
        Node temp=fast;
        while(temp.next!=slow){
            temp=temp.next;

        }
        temp.next=null;
        return;

    }
    public Node findmid(){
      Node slow=head;
      Node fast=head;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      }
      return slow;



    }
    public boolean checkpalindrome(){
        if(head.next==null && head==null){
            return true;
        }
      Node mid=findmid();
      Node prev=null;
      Node curr=mid;
      Node next=null;
      while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;

      } 
      Node headc=head;
      while(prev!=null){
        if(prev.data!=headc.data){
             return false;
        }
        prev=prev.next;
        headc=headc.next;
      }
      return true;


    }
}
public class palindromelinkedlist {
    public static void main(String args[]) throws IOException{
     BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter the number of elements in the linked list");
     LinkedList2 li=new LinkedList2();
     int size=Integer.parseInt(obj.readLine());
     for(int i=0;i<size;i++){
        li.addlast(Integer.parseInt(obj.readLine()));

     }
    li.tail.next=li.head;
     if(li.iscycle()){
        System.out.println("there is cycle exist in the linkedlist");
     }
     else{
        System.out.println("there is no cycle exist in thelinked list");
     }
    li.removecycle();
    
    if(li.iscycle()){
        System.out.println("there is cycle exist in the linkedlist");
     }
     else{
        System.out.println("there is no cycle exist in thelinked list");
     }

    }
    
}
