package BinarySearchTree;
import java.util.*;
import java.io.*;

public class kthsmallest {
    static ArrayList<Integer> arr= new ArrayList();
    public static void closest(Node root ){
       if(root==null){
        return ;
       }  
       closest(root.left);
       arr.add(root.data);
       closest(root.right);





    }
    public static void main(String args[]) throws IOException{
      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
      Node root=new Node(8);
     root.left=new Node(5);
     root.left.left=new  Node(3);
     root.left.right=new Node(6);
     root.right=new Node(11);
     root.right.right=new Node(20);
     System.out.println("enter the value of k:");
     int k=Integer.parseInt(obj.readLine());
     closest(root);
     System.out.println(arr.get(k-1));

    }
    
}
