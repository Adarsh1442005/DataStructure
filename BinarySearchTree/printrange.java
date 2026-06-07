package BinarySearchTree;
import java.util.*;
import java.io.*;

public class printrange {
    public static void range(Node root,int left,int right){
       if(root==null){
        return;
       }
       if(root.data==left || root.data==right){
        System.out.println(root.data);
        return;
       }
       if(root.data<left|| root.data>right){
        return;
       }
       System.out.println(root.data);
       range(root.left,left,right);
       range(root.right,left,right);

    }
    public  static void main(String args[]) throws  IOException{
        BufferedReader obj =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the value of left range:");
        int left=Integer.parseInt(obj.readLine());
        System.out.println("enter the value of right range:");
        int right=Integer.parseInt(obj.readLine());
        buildbst bst=new buildbst();
       Node root= bst.main(args);
       range(root,left,right);






    }
    
}
