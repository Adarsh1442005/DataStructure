package Linkedlist;
import java.io.*;
import java.util.*;
public class oddevennode {
    public static Node evenodd(Node head){
      Node evenhead=null;
      Node oddhead=null;
      Node eventail=null;
      Node oddtail=null;
      Node headc=head;
      while(headc!=null){
        if(headc.data%2==0 ){
            if(evenhead==null){
                evenhead=headc;
                eventail=headc;
                headc=headc.next;

            }
            else{
                eventail.next=headc;
                eventail=eventail.next;
                headc=headc.next;
            }

            
        }
        else{
            if(oddhead==null){
                oddhead=headc;
                oddtail=headc;
                headc=headc.next;
            }
            else{
                oddtail.next=headc;
                oddtail=oddtail.next;
                headc=headc.next;
            }

        }
      }
      if(eventail!=null){
        if(oddhead!=null){
      eventail.next=oddhead;
      oddtail.next=null;
      return evenhead;
        }
        else{
           
            return evenhead;    
        }
      }
      
     
      return oddhead;
     

     




    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        LinkedList li=new LinkedList();
        li.addlast(4);
        li.addlast(1);
        li.addlast(98);
        li.addlast(7);
        // li.addlast(4);
        // li.addlast(1);
        // li.addlast(6);
       Node head= evenodd(li.head);
       while(head!=null){
        System.out.println(head.data);
        head=head.next;
       }


    }
    
}
