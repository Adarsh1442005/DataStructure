package Binarytree;
import java.util.*;
import java.io.*;


public class Lcabtree {
    public static Node lca(Node root,int n1,int n2){
      if(root==null || root.data==n1 || root.data==n2){
        return root;
      }
      Node left=lca(root.left,n1,n2);
      Node right=lca(root.right,n1,n2);
      if(left==null){
        return right;
      }
      if(right==null){
        return left;
      }
      return root;

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
     Node root =tree.build(arr);
     Node lca=lca(root,4,5);
     System.out.println(lca.data);





    }
    
}
