package Binarytree;
import java.util.*;
import java.io.*;
public class mindistance {
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
    public static int calcdis(Node root,int n1){
        if(root==null){
            return -1;
        }
        if(root.data==n1){
            return 0;
        }
        
        int left=calcdis(root.left,n1);
      
           int  right=calcdis(root.right,n1);
        
        if(right==-1 && left==-1){
                return -1;
        }
        if(left==-1){
            return right+1;
        }
        
            return left+1;
        
        

        

    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.build(arr);
        System.out.println("enter the value of node 1");
        int n1=Integer.parseInt(obj.readLine());
        int n2=Integer.parseInt(obj.readLine());
        Node lca=lca(root,n1,n2);
        int dist1=calcdis(lca,n1);
        int  dist2=calcdis(lca,n2);
        System.out.println("the minimum distance between the two nodes is :"+
        (dist1+dist2));




        }
    
}
