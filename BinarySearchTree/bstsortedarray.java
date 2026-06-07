package BinarySearchTree;
import java.util.*;
import java.io.*;

public class bstsortedarray {
    public static Node buildsort(int arr[],int left,int right){
          if(left>right){
             return null;
          }
        int mid=(left+right)/2;
        Node root=new Node(arr[mid]);
        root.left=buildsort(arr,left,mid-1);
        root.right=buildsort(arr,mid+1,right);
        return root;
 


    }
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the size of the array");
        int size=Integer.parseInt(obj.readLine());
        int arr[]=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(obj.readLine());
        }
       Node root= buildsort(arr,0,arr.length-1);
       buildbst bst=new buildbst();
       bst.inorder(root);




    }
}
