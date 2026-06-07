package practice;
import java.util.*;
import java.io.*;
class Node{
    int data;
    Node left=null;
    Node right=null;
    public Node(int data){
        this.data=data;

    }
}

public class mindistnode {
    static int dist=0;
    public static boolean mindst(Node root,int n1,int n2){
      if(root==null){
        return false;
      }
      if(root.data==n1 || root.data==n2){
        dist=dist+1;
        boolean a=mindst(root.left,n1,n2);
        boolean b=mindst(root.right,n1,n2);
        if(a||b){
            return false;
        }
        return true;

      }
      boolean a=mindst(root.left,n1,n2);
      boolean b=mindst(root.right,n1,n2);
      if(a||b){
        dist=dist+1;
        return true;
      }
      return a||b;
      





    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(9);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.left.right.left=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        mindst(root,5,3);
        System.out.println(dist-1);
    }
    

    

    
}
