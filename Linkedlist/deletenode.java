package Linkedlist;
import java.util.*;
import java.io.*;


public class deletenode {
    public static Node  delete(Node head ,int m,int n){
        Node headc=head;
        Node firstc=null;
        while(headc!= null){
            int fcount=1;
            int lcount=1;
            while(fcount!=m && headc!=null){
                  headc=headc.next;
                  fcount++;
            }
            firstc=headc;
            if(headc!=null){
            headc=headc.next;
            while(lcount!=n && headc!=null){
                headc=headc.next;
                lcount++;

            }
            if(headc!=null){
            firstc.next=headc.next;
            headc=headc.next;
            }
            else{
                firstc.next=null;
                return head;
            }
        }
        }

            return head;




    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of m:");
        int m=Integer.parseInt(obj.readLine());
        System.out.println("enter the value of n:");
        int n=Integer.parseInt(obj.readLine());

        LinkedList li=new LinkedList();
        li.addlast(1);
        li.addlast(2);
        li.addlast(3);
        li.addlast(4);
        li.addlast(5);
        li.addlast(6);
        li.addlast(7);
        li.addlast(8);
          li.addlast(9);
            li.addlast(10);
        //       li.addlast(11);
        Node del=delete(li.head, m, n);
        while(del!=null){
            System.out.println(del.data);
            del=del.next;
;        }





    }
    
}
