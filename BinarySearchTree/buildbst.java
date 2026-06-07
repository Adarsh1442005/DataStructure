package BinarySearchTree;
import java.util.*;
import java.io.*;
class Node{

    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class buildbst {
    public static Node insert(Node root,int value){
       if(root==null){
        return new Node(value);
       }
       if(root.data>=value){
        root.left=insert(root.left,value);
       }
       else if(root.data<=value){
        root.right=insert(root.right,value);

       }
       return root;



    }
    public static void inorder(Node root){
         if(root==null){
            return;
         }
         inorder(root.left);
         System.out.println(root.data);
         inorder(root.right);
    }
    public static Node main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
        int arr[]={8,5,3,1,4,6,10,11,14};
        //for valid bst;
        //   int arr[]={1,1,1};
        Node root=null;
        for(int i:arr){
            root=insert(root,i);
        }
        // inorder(root);
        return root;


    }
    
}
