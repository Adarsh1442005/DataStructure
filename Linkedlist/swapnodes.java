package Linkedlist;
import java.util.*;
import java.io.*;

public class swapnodes {
    public static void swap(int k1,int k2,Node head){
            Node headc=head;
            Node first=null;
            Node last=null;
            while(headc!=null){
                
                if(headc.data==k1 && first==null){
                    first=headc;
                

                }
                else if(headc.data==k2 && last==null){
                    last=headc;
                    
                }
              else if(first!=null && last!=null){
                    break;
                }
                headc=headc.next;
                
            }  
            first.data=k2;
            last.data=k1;

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of the first key");
        int k1=Integer.parseInt(obj.readLine());
        System.out.println("enter the value of k2");
        int k2=Integer.parseInt(obj.readLine());
        LinkedList li=new LinkedList();
        li.addlast(1);
        li.addlast(2);
        li.addlast(3);
        li.addlast(4);
        Node head=li.head;
        swap(k1, k2, head);
        while(head!=null){
            System.out.println(head.data);
             head=head.next;

        }


    }
    
}
