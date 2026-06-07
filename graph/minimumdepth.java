package graph;
import java.util.*;
import java.io.*;
class TreeNode{
    int val;
    TreeNode left=null;
    TreeNode right=null;
    public TreeNode(int val){
        this.val=val;
    }
}
public class minimumdepth {
    public static int  depth(TreeNode root){
     if(root==null){
        return 0;
     }
     if(root.left==null){
        return 1+depth(root.right);
     }
     else if(root.right==null){
        return 1+depth(root.left);
     }
     else{
       return  1+Math.min(depth(root.left),depth(root.right));
     }



    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(8);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(6);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(9);
       System.out.println( "minimum depth is"+depth(root));
    }
}
