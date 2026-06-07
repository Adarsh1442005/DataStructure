package BinarySearchTree;
import java.util.*;
import java.io.*;


public class roottoleaf {
    public static void root_to_leaf(Node root,String str){
         if(root==null){
            return;
         }
          str=str+Integer.toString(root.data)+",";
          root_to_leaf(root.left,str);
          root_to_leaf(root.right,str);
          if(root.left==null && root.right==null){
            System.out.println(str);
          }


    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        buildbst bst=new buildbst();
       Node root= bst.main(args);
       
       root_to_leaf(root,"");



    }
    
}
