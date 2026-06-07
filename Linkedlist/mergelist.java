package Linkedlist;
import java.util.*;
import java.io.*;


public class mergelist {
     public static Node merge(Node head1,Node head2){
           Node merged=new Node(-1);
           Node mergedc=merged;
           Node head1c=head1;
           Node head2c=head2;
           
           while(head1c!=null && head2c!=null){
            if(head1c.data>head2c.data){
                  mergedc.next=new Node(head2c.data);
                  mergedc=mergedc.next;
                  head2c=head2c.next;

            }
            else{
                mergedc.next=new Node(head1c.data);
                head1c=head1c.next;
                mergedc=mergedc.next;


            }
           }
        while(head1c!=null){
             mergedc.next=new Node(head1c.data);
                head1c=head1c.next;
                mergedc=mergedc.next;

        }
        while(head2c!=null){
             mergedc.next=new Node(head2c.data);
                  mergedc=mergedc.next;
                  head2c=head2c.next;

        }
        merged=merged.next;
        return merged;


     }
    public static void main(String args[]) throws IOException{
     BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter the number of linked list");
     int n=Integer.parseInt(obj.readLine());
     System.out.println("enter the size of th elinked list");
     int size=Integer.parseInt(obj.readLine());
     LinkedList li=new LinkedList();
     li.addlast(1);
     li.addlast(3);
     LinkedList li_2=new LinkedList();
     li_2.addlast(6);
     li_2.addlast(8);
     LinkedList li_3=new LinkedList();
     li_3.addlast(9);
     li_3.addlast(10);
     Node merged=merge(li.head,li_2.head );
     Node finalmerge=merge(merged,li_3.head);
     while(finalmerge!=null){
       System.out.println(finalmerge.data);
       finalmerge=finalmerge.next;
     }

     




    }
    
}
