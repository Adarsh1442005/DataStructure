package Binarytree;
import java.util.*;
import java.io.*;
public class invertbinary{
    public static boolean invert(Node root1,Node root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null){
            return false;
        }
        if(root2==null){
            return false;
        }
        boolean leftright=false;
        boolean rightleft=false;
        if(root1.data==root2.data){
          leftright=invert(root1.left,root2.right);
          if(leftright==true){
            rightleft=invert(root1.right,root2.left);
          }
          else{
            return false;
          }
        }
        return leftright && rightleft;

       
        
    }
    public static void main(String args[]) throws IOException{

        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
          int arr[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
           int arr2[]={1,3,7,-1,-1,6,-1,-1,2,5,-1,-1,4,-1,-1};
        BinaryTree tree1=new BinaryTree();
        BinaryTree tree2=new BinaryTree();

       Node root1=   tree1.build(arr);
        Node root2=  tree2.build(arr2);
        if(invert(root1, root2)){
            System.out.println("yes the binary tree is inverted");
            return;
        }
        System.out.println("no binary tree is not inverted");

    }
}
