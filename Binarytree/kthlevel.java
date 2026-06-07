package Binarytree;
import java.util.*;
import java.io.*;
public class kthlevel {
    public static void kth(Node root ,int level,int k){
        if(root==null){
            return;
        }
        if(level==k){
            System.out.println(root.data);
            return;

        }
        kth(root.left,level+1,k);
        kth(root.right,level+1,k);





    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.build(arr);
        kth(root,1,3);

    }
    
}
