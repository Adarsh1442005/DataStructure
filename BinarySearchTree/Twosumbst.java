package BinarySearchTree;
import java.util.*;
import java.io.*;
class  Pair{
    int a;
    int b;
    public Pair(int a ,int b){
        this.a=a;
        this.b=b;
    }
}
public class Twosumbst {
    static HashSet<Integer> set=new HashSet();
  static   ArrayList< Pair> arr = new ArrayList();
    public static void traverse(Node root){
    if(root==null){
        return;
    }
    traverse(root.left);
    set.add(root.data);
    traverse(root.right);
    }
    public static void pair(Node root,int k){
        if (root==null){
            return ;
        }
        int diff=k-root.data;
        if(set.contains(diff)){
           arr.add(new Pair(diff,root.data));
        }
        pair(root.left,k);
        pair(root.right,k);




    }
    public static void main(String arga[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of k:");
        int k=Integer.parseInt(obj.readLine());
        Node root=new Node(5);
        root.left=new Node(3);
        root.left.left=new Node(2);
        root.left.right=new Node(4);
        root.right=new Node(7);
        root.right.left=new Node(6);
        root.right.right=new Node(8);

        Node root1=new Node(10);
        root1.left=new Node(6);
        root1.left.left=new Node(3);
        root1.left.right=new Node(8);
        root1.right=new Node(15);
        root1.right.left=new Node(11);
        root1.right.right=new Node(18);
        traverse(root1);
        pair(root,k);
        for(Pair p:arr){
            System.out.print(p.a+","+p.b);
            System.out.println("");
        }

        





    }
    
}
