package BinarySearchTree;
import java.util.*;
import java.io.*;


public class Range_sum_BST {
    public static void printrange(Node root,int left,int right){
     if(root==null){
        return;
     }
      if(root.data>=left && root.data<=right){
        System.out.println(root.data);
        printrange(root.left,left,right);
        printrange(root.right,left,right);
      }
      if(root.data<left){
        printrange(root.right,left,right);
      }
      else if (root.data>right){
        printrange(root.left,left,right);
      }
    }
    public static void main(String args[]) throws IOException{
     BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
     System.out.println("enter the left value");
     int left=Integer.parseInt(obj.readLine());
     System.out.println("enter the right value");
     int right=Integer.parseInt(obj.readLine());
     Node root=new Node(8);
     root.left=new Node(5);
     root.left.left=new  Node(3);
     root.left.right=new Node(6);
     root.right=new Node(11);
     root.right.right=new Node(20);
     printrange(root, left, right);





    }
    
}
