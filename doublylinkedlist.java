import java.util.*;
import java.io.*;
class Nodedb{
    int data;
    Nodedb next;
    Nodedb prev;
  
    public Nodedb(int data){
      this.data=data;
      this.next=null;
      this.prev=null;
    }
}
class doublelinkedlist{
    Nodedb head;
    Nodedb tail;
      int size=0;
    public void addfirst(int data){
        Nodedb obj=new Nodedb(data);
      if(head==null){
           head=obj;
           tail=obj;
           size++;
           return;
        }
        obj.next=head;
        head.prev=obj;
        head=obj;
        size++;


    }
    public void addlast(int data){
       Nodedb obj=new Nodedb(data);
       if(tail==null){
        tail=obj;
        head=obj;
        size++;
         return;
       }
       tail.next=obj;
       obj.prev=tail;
       tail=obj;
       size++;





    }
    public void printrev(){
        Nodedb tailc=tail;
        while(tailc!=null){
            System.out.print(tailc.data+",");
            tailc=tailc.prev;
        }
    }
    public void print(){
        Nodedb headc=head;
        while(headc!=null){
            System.out.print(headc.data+",");
            headc=headc.next;
        }
    }
    public void removefirst(){
     Nodedb cp=head.next;
     cp.prev=null;
     head=cp;
     size--;


    }
    public void removelast(){
        Nodedb cp=tail.prev;
        cp.next=null;
        tail=cp;
        size--;
        
    }
}

public class doublylinkedlist {
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the doubly linked list");
        int size=Integer.parseInt(obj.readLine());
        doublelinkedlist li=new doublelinkedlist();
        for(int i=0;i<size;i++){
            li.addlast(Integer.parseInt(obj.readLine()));
        }
        System.out.println("linkedlist after reversing:");
        li.printrev();
        System.out.println("");
        System.out.println("linkedlist without reverse");
        li.print();
        System.out.println("size of the linked list is:"+li.size);
        li.removelast();
        li.removelast();
        System.out.println("size of linke dlist after removing:"+li.size);
        li.print();


    }

    
}
