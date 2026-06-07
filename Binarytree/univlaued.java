package Binarytree;
//A binary tree is said to univalued if all nodes values are identical;
import java.util.*;
import java.io.*;
public class univlaued {
    public static boolean univalued(Node root ,int value){
         if(root==null){
              return true;
         }
         boolean left=univalued(root.left,value);
         if(left==false){
            return false;
         }
         boolean right=univalued(root.right,value);
         if(right==false){
            return false;
         }
         if(left && right &&(root.data==value)){
            return true;
         }
        
            return false;
         
}
    public static void main(String arga[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
     int arr[]={2,2,2,-1,-1,2,-1,-1,2,-1,-1};
        BinaryTree tree= new BinaryTree();
      Node root=  tree.build(arr);
      boolean unival=univalued(root, root.data);
      if(unival){
        System.out.println("the given binary tree is univalued");
        return ;
      }
      System.out.println("the given binary tree is not univalued");


        

    }
    
}
