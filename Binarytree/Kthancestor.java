package Binarytree;
import java.util.*;
import java.io.*;

public class Kthancestor {
    public static int kth(Node root,int k,int node){
     if(root==null){
        return -1;
     }
     if(root.data==node){
        return 0;
     }
     int left=kth(root.left,k,node);
     int right=-1;
     int dist=0;
     if(left==-1){
        right=kth(root.right,k,node);
     }
     if(left==-1 && right ==-1){
        return -1;
     }
     if(left==-1){
         dist=right+1;
     }
     else{
        dist=left+1;
     }
     if(dist==k){
        System.out.println("the kth ancestor is :"+root.data);
        return -1; 
     }
     return dist;





    }
    public static void  main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        BinaryTree tree=new BinaryTree();
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
       Node root= tree.build(arr);
        System.out.println("enter the value of k:");
        int k=Integer.parseInt(obj.readLine());
        kth(root,k,5);







    }
    
}
