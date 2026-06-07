package BinarySearchTree;
import java.util.*;
import java.io.*;

public class closestelement {
   static  int min=Integer.MAX_VALUE;
   static int  rootdata=-1;

    public static void minimum(Node root ,int k){
     if(root==null){
        return ;
     }
     int diff=Math.abs((root.data-k));
     if(diff<min){
        rootdata=root.data;
     }
     min=Math.min(diff,min);
     if(root.data>k){
        minimum(root.left,k);
     }
     if(root.data<k){
        minimum(root.right,k);
     }
     else{
        return ;
     }






    }
    public static void main(String args[]) throws IOException{
    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the value of k:");
    int k=Integer.parseInt(obj.readLine());
    Node root=new Node(8);
     root.left=new Node(5);
     root.left.left=new  Node(3);
     root.left.right=new Node(6);
     root.right=new Node(11);
     root.right.right=new Node(20);
     minimum(root,k);
     System.out.println("the minimum absolute difference is:"+min);
     System.out.println("the data is :"+rootdata);






    }
    
}
