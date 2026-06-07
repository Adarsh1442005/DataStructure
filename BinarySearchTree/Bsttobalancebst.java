package BinarySearchTree;
import java.util.*;
import java.io.*;

public class Bsttobalancebst {
   static  ArrayList<Integer> arr=new ArrayList();
    public static void inorder(Node root ){
     if(root==null){
        return;
     }
     inorder(root.left);
     arr.add(root.data);
     inorder(root.right);
 }
   public static Node balanced(ArrayList<Integer> arr,int left,int right){
       if(left>right){
        return null;
       } 
       int mid=(left+right)/2;
       Node root=new Node(arr.get(mid));
       root.left=balanced(arr,left,mid-1); 
       root.right=balanced(arr,mid+1,right);
       return root; 
    


   }
    public static void main(String args[]) throws IOException{
      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));









    }
    
}
