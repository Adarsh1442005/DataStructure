import java.util.*;
import java.io.*;
class  Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
class LinkedLists{
     Node head;
     Node tail;
     int size=0;

     public void addfirst(int data){
        Node obj=new Node(data);
        if(head==null){
            head=obj;
            tail=obj;
            size++;
            return;
        }
        obj.next=head;
        head=obj;
        size++;

     }
     public void addlast(int data){
          Node obj=new Node(data);
        if(tail==null){
           tail=obj;
           head=obj;
           return;
        }
      
        tail.next=obj;
        tail=obj;
        size++;

     }
     public void reverse(){
           Node prev=null;
           Node curr=head;
           Node next=null;
           while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next; 
              
           } 
           Node cp=head;
           head=tail;
           tail=cp;



     
    
    
    }
   public void add(int index,int data){
        int indexc=0;
        Node headc=head;
        Node obj=new Node(data);
        for(int i=0;i<index-1;i++){
            indexc=indexc++;
            headc=headc.next;
        }
        Node cp=headc.next;
        headc.next=obj;
        obj.next=cp;
        size++;

        

     }
     public void removefirst(){
        if(head==null){
            System.out.println("your linked list is empty already");
            return ;
        }
        else if(size==1){
            head=null;
            tail=null;
            size--;
            return;

        }
        head=head.next;
        size--;

     }
     public void removelast(){
        if(size==0){
            System.out.println("your linked list is already empty");
            return;
        }
        else if(size==1){
            tail=null;
            head=null;
            size--;
            return;
        }
        Node headc=head;
        while(headc.next.next!=null){
            headc=headc.next;
        }
        tail=headc;
        tail.next=null;
        size--;
     }
     public void print(){
        Node cp=head;
        while(cp!=null){
            System.out.println(cp.data);
            cp=cp.next;

        }
     }
     public int search(int element){
        Node headc=head;
        int ind=0;
        while(headc.next!=null){
              if(headc.data==element){
                return ind;
              }
              ind++;
              headc=headc.next;
        }
        return -1;
     }
     public void removefromLast(int index){
            int delind=size-index;
            if(delind==0){
                head=head.next;
                size--;
                return;

            }
           
        
            Node headc=head;
            for(int i=0;i<delind-1;i++){
                   headc=headc.next;
            }
            headc.next=headc.next.next;
            size--;
            return;
            

     }


}    

public class LinkedListaddfirst {
    
    
    
    public static void main(String args[]) throws IOException{
        LinkedLists li=new LinkedLists();
       li.addfirst(2);
       li.addlast(4);
       li.add(1,3);

        // li.print();
        
        // int ind=li.search(6);
        // if(ind!=-1){
        //     System.out.println("element found at index"+ind);
        // }
        // else{
        //     System.out.println("element not found at any of the index");
        // }

        // System.out.println("size of the linked list is:"+li.size);

        // System.out.println("reversed Linked list is:");
        // li.reverse();
        li.print();
        li.removefromLast(3);
        li.print();
        System.out.println("size of the list is:"+li.size);
        
       





    }
    
}
