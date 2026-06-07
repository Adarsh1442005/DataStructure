package BinarySearchTree;
import java.util.*;
import java.io.*;
class Info{
    boolean isvalid;
    int sum;
    int max;
    int min;
    public Info(boolean isvalid,int sum,int max,int min){
       this.isvalid=isvalid;
       this.max=max;
       this.sum=sum;
       this.min=min;
    }
    
}

public class Maximumsumbst {
    static int sum=0;
    public static Info sum(Node root){
     if(root==null){
        return new Info(true,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
     }
     Info left=sum(root.left);
     Info right=sum(root.right);
     int max=Math.max(Math.max(root.data,left.max),right.max);
     int min=Math.min(Math.min(root.data,left.min),right.min);
     int total=root.data+left.sum+right.sum;
     if(left.isvalid && right.isvalid && root.data>left.max && root.data<right.min){
           sum=Math.max(sum,total);
           return new Info(true,total,max,min);
           
     }
     return new Info(false,total,max,min);
     

     




    }
    public static void main(String args[]) throws IOException{
      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
       Node root=new Node(5);
       root.left=new Node(9);
       root.left.left=new Node(6);
       root.left.left.left=new Node(8);
       root.left.left.right=new Node(7);
       root.right=new Node(2);
       root.right.right=new Node(3);
       sum(root);
       System.out.println(sum);


    }
}
