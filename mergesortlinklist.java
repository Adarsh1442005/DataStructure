import java.util.*;
import java.io.*;
public class mergesortlinklist {
    public static  Node mid(Node head){
        // if(li.size%2==0){
        //     Node slow=head;
        //     Node fast=head.next;
        // while(fast!=null && fast.next!=null){
        //     slow=slow.next;
        //     fast=fast.next;
        // }
        // return slow;
        // }
        Node slow=head;

     Node fast=head.next;
     while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
     }
     return slow;
    }
    public static Node divide(LinkedLists li,Node head){
        if(head==null || head.next==null){
            return head;

        }

        Node mid=mid(head);
        Node right=mid.next;
        mid.next=null;
      Node leftmerge=  divide(li,head);
        Node rightmerge=divide(li,right);
        Node merged= merge(leftmerge,rightmerge);
        return merged;


        


    }
    public static  Node merge(Node left,Node right){
        Node temp=new Node(-1);
        Node tempc=temp;
       Node leftheadc=left;
       Node rightheadc=right;
       while(leftheadc!=null && rightheadc!=null){
                  if(leftheadc.data>rightheadc.data){
                    Node obj=new Node(rightheadc.data);
                    rightheadc=rightheadc.next;
                    tempc.next=obj;
                    tempc=tempc.next;


                  }
                  else{
                    Node obj=new Node(leftheadc.data);
                    leftheadc=leftheadc.next;
                    tempc.next=obj;
                    tempc=tempc.next;
                  }
       }
       while(leftheadc!=null){
        Node obj=new Node(leftheadc.data);
        tempc.next=obj;
        tempc=tempc.next;
        leftheadc=leftheadc.next;
       }
       while(rightheadc!=null){
        Node obj=new Node(rightheadc.data);
        tempc.next=obj;
        tempc=tempc.next;
        rightheadc=rightheadc.next;
       }
       temp=temp.next;
       return temp;


       

  



    }


    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader( new InputStreamReader(System.in));
        System.out.println("enter the size of the linked");
        int size=Integer.parseInt(obj.readLine());
        LinkedLists li=new LinkedLists();
        for(int i=0;i<size;i++){
            li.addlast(Integer.parseInt(obj.readLine()));
        }
        li.print();
        System.out.println("linkedlist before sorting is :");
        li.print();
       Node head= divide(li, li.head);
        System.out.println("linked list after sorting is:");
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
            
        }
        




    }
    
}
