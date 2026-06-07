package Binarytree;
import java.util.*;
import java.io.*;

class Nodea {
int data;
Nodea left=null;
Nodea right=null;
public Nodea(int data){
  this.data=data;
}


}

public class prebinarytree {
    static int arr1[];
    static int index=0;
    static Queue<Nodea> qu=new LinkedList<>();


   public static void levelorder(Nodea root){
          qu.add(root);
          while(!qu.isEmpty()){
            Nodea root1=qu.remove();
            System.out.println(root1.data);
            if(root1.left!=null){
            qu.add(root1.left);
            }
            if(root1.right!=null){
            qu.add(root1.right);
            }
          }
    

    }
    public static void preorder(Nodea root){
          if(root==null){
            return;
          }
          System.out.println(root.data);
          preorder(root.left);
          preorder(root.right);





    }
    public static void inorder(Nodea root){
       if(root==null){
        return;
       }
       inorder(root.left);
       System.out.println(root.data);
    inorder(root.right);
    }
    public static void postorder(Nodea root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    public static int height(Nodea root){
       if(root==null){
        return 0;
       }
       int left=height(root.left);
       int right=height(root.right);
       return Math.max(left,right)+1;






    }

    public static int countnodes(Nodea root){
            if(root==null){
                return 0;
            }
            int left=countnodes(root.left);
            int right=countnodes(root.right);
            return left+right+1;



    }
    public static Nodea build(){
       if(arr1[index]==-1 || index>=arr1.length){
        index++;
        return null;
        
       }
       Nodea root=new Nodea(arr1[index]);
       index++;
       root.left=build();
       root.right=build();
       return root;
   
   
   
   
    }
    public static int sumnode(Nodea root){
              if(root==null){
                return 0;
              }
              int left=sumnode(root.left);
              int right=sumnode(root.right);
              return left+right+root.data;
    }
    static int max=Integer.MIN_VALUE;
    public static int dia (Nodea root){
        if(root==null){
            return 0;

        }
        int left=dia(root.left);
        int right=dia(root.right);
        int diam=left+right+1;
        max=Math.max(diam,max);
        return Math.max(left,right)+1;
}

static int data=0;
public static boolean subtree(Nodea roota,Nodea rootb){
    if(roota==null && rootb!=null){
        return false;
    }
    if(roota==null && rootb==null){
        return true;
    }
    if(roota.data!=rootb.data && data!=0){
        return false;
    }
        
    if(roota.data==rootb.data){
        data=-1;
        boolean left=subtree(roota.left,rootb.left);
        boolean right=subtree(roota.right,rootb.right);
        return left && right;


    }
    else{
      boolean left=  subtree(roota.left,rootb);
      boolean right=  subtree(roota.right,rootb);
      return left||right;
    }






}
    public static void main(String args[]) throws IOException{
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("enter the size of the array");
        // int size=Integer.parseInt(obj.readLine());
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=Integer.parseInt(obj.readLine());
        // }
        arr1=arr;
        Nodea root=build();
        // levelorder(root);
        // dia(root);
        // System.out.println(max);
        
        Nodea rootb=new Nodea(2);
        rootb.left=new Nodea(4);
        rootb.right=new Nodea(5);
        rootb.right.left=new Nodea(7);
        System.out.println(subtree(root,rootb));


        // System.out.println(root.data);
        // System.out.println(root.left.data);
        // System.out.println(root.left.left.data);
        // System.out.println(root.left.right.data);


    }
    
}
