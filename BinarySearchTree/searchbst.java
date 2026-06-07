package BinarySearchTree;
import java.util.*;
import java.io.*;

public class searchbst {
    public static boolean search(Node root,int key){
       if(root==null){
        return false;
       }
       if(root.data==key){
        return true;
       }
       
       if(root.data>key){
        boolean left=search(root.left,key);
         if(left){
            return true;
         }
         else{
            return false;
         }
       }
       if(root.data<key){
      boolean  right=search(root.right,key);
      if(right){
        return true;
      }
      else{
        return false;
    
      }
       }
       return false;

    }
     public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of key");
        int key=Integer.parseInt(obj.readLine());
        buildbst build=new buildbst();
        
      Node root=  build.main(args);
      build.inorder(root);
      if(search(root,key)){
        System.out.println("provided key exist in bst");
      }
      else{
        System.out.println("given key does not exist");
      }



     }
    
}
