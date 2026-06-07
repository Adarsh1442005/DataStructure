package BinarySearchTree;
import java.util.*;
import java.io.*;
public class deletenode {
    public static Node inordersuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static Node  delete(Node root,int val){
       if(root.data>val){
        root.left=delete(root.left,val);
       }
       else if(root.data<val){
        root.right=delete(root.right,val);
       }
       else{
        if(root.left==null && root.right==null){
            return null;
        }
        if(root.left==null){
            return root.right;
        }
        if(root.right==null){
            return root.left;
        }
        else{
            Node inorder=inordersuccessor(root.right);
            root.data=inorder.data;
            root.right=delete(root.right,inorder.data);

        }
       }
       return root;
    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value need to delete");
        int val=Integer.parseInt(obj.readLine());
        buildbst bst=new buildbst();
       Node root= bst.main(args);
       System.out.println("before traversal inordertraversal is:");
       bst.inorder(root);
      Node del= delete(root, val);
      System.out.println("after deleting updating inorder traversal is :");
      bst.inorder(del);








    }
    
}
