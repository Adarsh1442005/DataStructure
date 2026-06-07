package BinarySearchTree;
import java.util.*;
import java.io.*;
class info{
   boolean isvalid;
   int max;
   int min;
   int size;
   public info(boolean isvalid,int max,int min, int size){
    this.isvalid=isvalid;
    this.max=max;
    this.min=min;
    this.size=size;
   }





}

public class sizeofbstinbt {
    static int maxsize=0;

    public static info validbst(Node root){
      if(root==null){
        return new info(true,Integer.MIN_VALUE,Integer.MAX_VALUE,0);
      }
      info left=validbst(root.left);
      info right=validbst(root.right);
    
        boolean valid=false;
      if(root.data>left.max  && root.data <right.min && left.isvalid && right.isvalid ){
           valid=true;
       }
       int max=Math.max(Math.max(left.max,right.max),root.data);
       int min=Math.min(Math.min(left.min,right.min) ,root.data);
       int size=left.size+right.size+1;
      if(valid){
         maxsize=Math.max(maxsize,size);
         
       }
       return new info(valid,max,min,size);
  



    }
    public static void main(String args[] ) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        Node root=new Node(50);
        root.left=new Node(30);
        root.left.left=new Node(5);
        root.left.right=new Node(20);
        root.right=new Node(60);
        root.right.left=new Node(45);
        root.right.right=new Node(70);
        root.right.right.left=new Node(65);
        root.right.right.right=new Node(80);
        validbst(root);
        System.out.println("max size"+maxsize);
        

     
        
        

    }
    
}
