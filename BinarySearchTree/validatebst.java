package BinarySearchTree;
import java.util.*;
import java.io.*;

public class validatebst {
    public static boolean validatebst(Node root,int min ,int max){
     if(root.left==null && root.right ==null){
        if(root.data>min && root.data<max){
            return true;
        }
        else{
            return false;
        }
     }
     if(root.left==null){
        if(root.data>min && root.data<max && root.right.data>root.data){
            boolean right=validatebst(root.right,root.data,max);
            if(right){
                return true;
            }
            else{
                return false;
    
            }
        }
     }
     if(root.right==null){
        if(root.data>min && root.data<max && root.left.data<root.data){
            boolean left=validatebst(root.left,min,root.data);
        }
     }
     else{
        if(root.data>min && root.data<max && root.left.data<root.data && root.right.data>root.data){
            boolean left=validatebst(root.left,min,root.data);
            boolean right=validatebst(root.right,root.data,max);
            return left && right;
        }
     }
     return false;





    }
    public static void main(String args[]) throws IOException{
           BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
           buildbst bst=new buildbst();
          Node root= bst.main(args);
          if(validatebst(root,Integer.MIN_VALUE,Integer.MAX_VALUE)){
            System.out.println("given bst is valid");
            return;
          }
          System.out.println("given bst is not valid");



    }
    
}
