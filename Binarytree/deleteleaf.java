package Binarytree;
import java.util.*;
import java.io.*;
public class deleteleaf{
    public static boolean delete(Node root ,int x){
        if(root==null){
            return true;
        }
        boolean left=delete(root.left,x);
        boolean right=delete(root.right,x);
        if(left && right){
            if(root.left!=null && root.right !=null){
                root.left=null;
                root.right=null;
              if(root.data==x){
                return true;
              }
              else{
                return false;
              }
            }
            else if(root.left==null ){
                root.right=null;
                if(root.data==x){
                return true;}
                else{
                    return false;
                }
            }
            root.left=null;
            if(root.data==x){
            return true;
            }
            else{
                return false;
            }
        }
        if(left){
            root.left=null;
            return false;
        }
       if(right){   
 root.right=null;
 return false;
       }
       return false;

        

        

    }
  public static void main(String args[]) throws IOException{
    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
    BinaryTree tree=new BinaryTree();
    int arr[]={1,3,3,-1,-1,2,-1,-1,3,-1,-1};
    Node root= tree.build(arr);
    System.out.println("enter the value of x:");
    int x=Integer.parseInt(obj.readLine());
    delete(root, x);
    tree.preorder(root);


  }



}

