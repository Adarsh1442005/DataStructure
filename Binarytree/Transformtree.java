package Binarytree;
import java.util.*;
import java.io.*;
public class Transformtree {
    public static int transform(Node root){
        if(root==null){
            return 0;
        }
        int left=transform(root.left);
        int right=transform(root.right);
        int datac=root.data;
        root.data=left+right;
        return datac+left+right;


    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.build(arr);
        transform(root);
        tree.preorder(root);



        
    }
    
}
