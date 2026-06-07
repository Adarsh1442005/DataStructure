package Binarytree;
import java.util.*;
import java.io.*;

public class mximumpathsum {
    static int max=Integer.MIN_VALUE;
    public static int max(Node root){
        if(root==null){
            return 0;
        }
        int left=max(root.left);
        int right=max(root.right);
       int sum= left+right+root.data;
        
        max=Math.max(sum,max);
        return sum;



    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        BinaryTree tree=new BinaryTree();
        int arr[]={4,2,-1,-1,7,-1,-1};
        Node root=tree.build(arr);
        max(root);
        System.out.println("max path sum is :"+max);




    }
    
}
